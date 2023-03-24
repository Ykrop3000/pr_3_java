import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Андреев Григорий Даниилович РИБО-01-21");

        Map<String, Car> cars = new HashMap<>();

        // добавляем несколько автомобилей в список
        Car car1 = new Car("Volvo S90", 2015, "x001xx");
        Car car2 = new Car("Lada Vesta", 2020, "x002xx");
        Car car3 = new Car("Kia Rio", 2012, "x003xx");
        cars.put(car1.getRegNumber(), car1);
        cars.put(car2.getRegNumber(), car2);
        cars.put(car3.getRegNumber(), car3);

        // выводим начальный список автомобилей
        System.out.println("Начальный список автомобилей:");
        for (Car car : cars.values()) {
            System.out.println(car);
        }

        // добавляем новый автомобиль
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите марку автомобиля: ");
        String make = scanner.nextLine();
        int year = 0;
        while (true) {
            try {
                System.out.print("Введите год выпуска автомобиля: ");
                year = Integer.parseInt(scanner.nextLine());
                if (year < 1900 || year > 2023) {
                    throw new IllegalArgumentException("Год выпуска должен быть в диапазоне от 1900 до 2023");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целочисленное значение года выпуска");
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
        System.out.print("Введите регистрационный номер автомобиля: ");
        String regNumber = scanner.nextLine();
        Car car4 = new Car(make, year, regNumber);
        if (cars.containsKey(car4.getRegNumber())) {
            System.out.println("Ошибка: автомобиль с таким регистрационным номером уже существует");
        } else {
            cars.put(car4.getRegNumber(), car4);
        }

        // выводим список автомобилей после добавления
        System.out.println("Список автомобилей после добавления:");
        for (Car car : cars.values()) {
            System.out.println(car);
        }

        // удаляем автомобиль по регистрационному номеру
        String regNumberToDelete = "x002xx";
        cars.remove(regNumberToDelete);

        // выводим список автомобилей после удаления
        System.out.println("Список автомобилей после удаления:");
        for (Car car : cars.values()) {
            System.out.println(car);
        }

        // удаляем все автомобили из списка
        cars.clear();

        // выводим список автомобилей после удаления всех
        System.out.println("Список автомобилей после удаления всех:");
        for (Car car : cars.values()) {
            System.out.println(car);
        }
    }
}
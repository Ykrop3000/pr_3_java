
class Car {
    private String make;
    private int year;
    private String regNumber;

    public Car(String make, int year, String regNumber) {
        this.make = make;
        this.year = year;
        this.regNumber = regNumber;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String toString() {
        return make + ", " + year + ", " + regNumber;
    }
}
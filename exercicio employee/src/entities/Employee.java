package entities;

public class Employee {

    String name;
    double valuePerHour;
    double hours;

    public Employee(String name, double valuePerHour, double hours) {
        this.name = name;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double calculateSalary(){
        return valuePerHour * hours;
    }

}

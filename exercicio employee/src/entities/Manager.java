package entities;

public class Manager extends Employee{

    double bonus;

    public Manager(String name, double valuePerHour, double hours, double bonus){
        super(name, valuePerHour, hours);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
       return super.calculateSalary() + bonus;
    }

}

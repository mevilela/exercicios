package entities;

public class Programmer extends Employee{

    double euroticket;

    public Programmer(String name, double valuePerHour, double hours, double euroticket){
        super(name, valuePerHour, hours);
        this.euroticket = euroticket;
    }

    public double getExtraHours() {
        return euroticket;
    }

    public void setBonus(double bonus) {
        this.euroticket = euroticket;
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() + euroticket;
    }

}
public class SalariedEmployee extends Employee implements Displayable{
    double salary;
    double bonus;
    double deduction;

    public SalariedEmployee() {
        salary = 7000;
        bonus = 1000;
        deduction = 300;
    }
    public SalariedEmployee (String name, int SSN, double salary, double bonus, double deduction) {
        super(name, SSN);
        this.salary = salary;
        this.bonus = bonus;
        this.deduction = deduction;
    }

    @Override
    public void displayAllDetails() {
        System.out.println("Name: " + super.name);
        System.out.println("SSN: " + super.SSN);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Deduction: " + deduction);
    }

    @Override
    public double Earning() {
        return salary + bonus - deduction;
    }

    @Override
    public void displayEarning() {
        System.out.println("Earning: " + Earning());
    }


    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
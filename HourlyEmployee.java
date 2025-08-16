public class HourlyEmployee extends Employee implements Displayable{

    double hourRate;
    int numberOfHours;

    public HourlyEmployee () {
        hourRate = 90;
        numberOfHours = 30;
    }
    public HourlyEmployee(String name, int SSN, double hourRate, int numberOfHours) {
        super(name, SSN);
        this.hourRate = hourRate;
        this.numberOfHours = numberOfHours;
    }

    @Override
    public void displayAllDetails() {
        System.out.println("Name: " + super.name);
        System.out.println("SSN: "+ super.SSN);
        System.out.println("Hour rate: " + hourRate);
        System.out.println("Number OF Hours: " + numberOfHours);
    }

    @Override
    public double Earning() {
        return hourRate * numberOfHours;
    }

    @Override
    public void displayEarning() {
        System.out.println("Earning: " + Earning());
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }
}

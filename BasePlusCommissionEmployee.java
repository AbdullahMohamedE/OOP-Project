//This class extends the CommissionEmployee class.

public class BasePlusCommissionEmployee extends CommissionEmployee {

    double base;

    public BasePlusCommissionEmployee () {
        base = 3000;
    }

    public BasePlusCommissionEmployee (String name, int SSN, double Gross_Sales, double commissionRate, double base) {
        super(name, SSN, Gross_Sales, commissionRate);
        this.base = 3000;
    }

    @Override
    public void displayAllDetails() {
        System.out.println("Name: " + super.name);
        System.out.println("SSN: "+ super.SSN);
        System.out.println("Gross Sales: " + super.Gross_Sales);
        System.out.println("Commission: " + super.commissionRate);
        System.out.println("Base: " + base);
    }

    @Override
    public void displayEarning() {
        System.out.println("Earning: " + Earning() + base);
    }

    public void base(double base) {
        this.base = base;
    }
}


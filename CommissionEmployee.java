public class CommissionEmployee extends Employee implements Displayable {

    double Gross_Sales;
    double commissionRate;

    public CommissionEmployee () {
        Gross_Sales = 4000;
        commissionRate = 0.14;
    }

    public CommissionEmployee (String name, int SSN, double Gross_Sales, double commissionRate) {
        super(name, SSN);
        this.Gross_Sales =Gross_Sales ;
        this.commissionRate = commissionRate;
    }

    public void setGross_Sales(double gross_Sales) {
        Gross_Sales = gross_Sales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    // Earnings=Gross_Sales×CommissionRate
    public double Earning() {
        return Gross_Sales * commissionRate;
    }

    public void displayAllDetails() {
        System.out.println("Name: " + super.name);
        System.out.println("SSN: "+ super.SSN);
        System.out.println("Gross Sales: " + Gross_Sales);
        System.out.println("Commission: " + commissionRate);
    }
    public void displayEarning() {
        System.out.println("Earning: " + Earning());
    }
}
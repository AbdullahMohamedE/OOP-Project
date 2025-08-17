import java.util.ArrayList;

enum Gender {Male, Female};

public class Main {
    public static void main(String[] args) {

    CommissionEmployee commissionEmployee = new BasePlusCommissionEmployee("Abdullah", 2323423, 3242, 0.15, 7000);

    System.out.println("CommissionEmployee Info: ");
    commissionEmployee.displayAllDetails();
    commissionEmployee.displayEarning();

    //To print a new line and make the output readable.
    System.out.println();
 
    BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Sayed", 2321232, 5000, 0.50, 4000);
        
    System.out.println("BasePlusCommissionEmployee Info: ");
    basePlusCommissionEmployee.displayAllDetails();
    basePlusCommissionEmployee.displayEarning();
        
    System.out.println();
   
        
    SalariedEmployee salariedEmployee = new SalariedEmployee("Sara", 54646456, 10000,3000,700);
   
    System.out.println("Salaried Employee Info: ");
    salariedEmployee.displayAllDetails();
    salariedEmployee.displayEarning();

    System.out.println();

    System.out.println("Hourly emp info: ");
    HourlyEmployee hourlyEmployee = new HourlyEmployee("Rawan", 223242, 100,40);
    hourlyEmployee.displayAllDetails();
    hourlyEmployee.displayEarning();

    System.out.println();     

    }
}

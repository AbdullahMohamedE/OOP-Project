public abstract class Employee {
    protected String name;
    //SSN: Social Security Number.
    protected int SSN;

    //Constructors
    public Employee () {
        name = "Ahmed";
        SSN = 123456789;
    }
    public Employee (String name, int SSN) {
        this.name = name;
        this.SSN = SSN;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    //An abstract class that will be implemented in all subclasses.
    public abstract double Earning();

}

public abstract class Employee {
    protected String name;
    protected int SSN;

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
    public abstract double Earning();
}
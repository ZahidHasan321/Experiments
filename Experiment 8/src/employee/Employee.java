package employee;
//1
public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    private double basicSalary;
    private float incrementRate;

    public void salaryIncrement(){
        basicSalary += basicSalary * (incrementRate/100);
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getIncrementRate() {
        return incrementRate;
    }

    public void setIncrementRate(float incrementRate) {
        this.incrementRate = incrementRate;
    }
}

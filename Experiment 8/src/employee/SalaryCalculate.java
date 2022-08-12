package employee;
//3
public class SalaryCalculate extends HouseRent {
    private double grossSalary;
    private double providentFund;

    public void setProvidentFund(double providentFund) {
        this.providentFund = providentFund;
    }

    public void computeGrossSalary(){
        salaryIncrement();
        computeHouseRent();

        double houseRent = getHouseRent();
        double basicSalary = getBasicSalary();

        grossSalary = (basicSalary - ((basicSalary/100)*providentFund));
        grossSalary = grossSalary - houseRent;
    }

    public double getGrossSalary() {
        computeGrossSalary();
        return grossSalary;
    }

    @Override
    public String toString() {
        return "Name: " + getFirstName() + " " + getLastName() + "\n" + "Gross Salary: " + getGrossSalary() + "\n";
    }
}

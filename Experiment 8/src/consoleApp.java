import employee.*;
//4
public class consoleApp {
    public static void main(String[] args) {
        SalaryCalculate calculate = new SalaryCalculate();

        calculate.setFirstName("Zahid");
        calculate.setLastName("Hasan");
        calculate.setEmployeeID(123);
        calculate.setIncrementRate(10F);
        calculate.setHouseRentRate(20F);
        calculate.setProvidentFund(5F);
        calculate.setBasicSalary(15000.0);


        System.out.println(calculate);
    }
}

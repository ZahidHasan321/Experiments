package employee;
//2
public class HouseRent extends Employee{
    private float houseRentRate;
    private double houseRent;

    void computeHouseRent(){
        double basicSalary = getBasicSalary();
        houseRent = (float) ((basicSalary/100.00)*houseRentRate);
    }

    public void setHouseRentRate(float houseRentRate) {
        this.houseRentRate =  houseRentRate;
    }

    public double getHouseRent() {
        return houseRent;
    }
}

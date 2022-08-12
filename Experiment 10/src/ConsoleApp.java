import java.util.Scanner;
//final
public class ConsoleApp {
    public static void doAction(Vehicle v, int action){
        switch (action){
            case 1: v.speedUp();
                break;
            case 2: v.speedDown();
                break;
            case 3: v.pressBreak();
                break;
            case 4: v.changeGear();
                break;
            default:
                System.out.println("Press valid key");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bus bus = new Bus();
        CNG cng = new CNG();
        MicroBus microBus = new MicroBus();
        MotoCycle motoCycle = new MotoCycle();
        Truck truck = new Truck();

        int menu, action;

        System.out.println("Select one vehicle: \n1.Bus\n2.CNG\n3.Micro Bus\n4.Moto Cycle\n5.Truck\n");
        System.out.printf("Enter a value: ");
        menu = sc.nextInt();
        System.out.println("\nSelect one action: \n1.Speed up\n2.Speed down\n3.Press Break\n4.Change gear\n");
        System.out.printf("Enter a value: ");
        action = sc.nextInt();



        switch (menu){
            case 1:
                System.out.println(bus.getVehicleName());
                doAction(bus, action);
                break;
            case 2:
                System.out.println(cng.getVehicleName());
                doAction(cng, action);
                break;
            case 3:
                System.out.println(microBus.getVehicleName());
                doAction(microBus, action);
                break;
            case 4:
                System.out.println(motoCycle.getVehicleName());
                doAction(motoCycle, action);
                break;
            case 5:
                System.out.println(truck.getVehicleName());
                doAction(truck, action);
                break;
            default:
                System.out.println("Wrong selection");
        }
    }
}

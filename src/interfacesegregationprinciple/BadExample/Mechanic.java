package interfacesegregationprinciple.BadExample;

public class Mechanic {
    public static void main(String[] args) {
    Car mechanicCar = new Car();
    mechanicCar.openEngineMode();
    mechanicCar.repairWheel();
    mechanicCar.move();
    mechanicCar.startEngine();
    }

}

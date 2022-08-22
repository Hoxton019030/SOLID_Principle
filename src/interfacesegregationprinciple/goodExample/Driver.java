package interfacesegregationprinciple.goodExample;

public class Driver {
    public static void main(String[] args) {
        DailyUsage normalPeople = new Car();
        normalPeople.startEngine();
        normalPeople.move();

        RepairUsage mechanic = new Car();
        mechanic.openEngineMode();
        mechanic.openEngineMode();
    }
}

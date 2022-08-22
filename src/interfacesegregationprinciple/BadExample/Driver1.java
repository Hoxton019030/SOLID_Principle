package interfacesegregationprinciple.BadExample;

public class Driver1 {
    public static void main(String[] args) {
        Car normalDriver = new Car();
        //normal user shouldn't openEngineModes
        normalDriver.openEngineMode();

    }

}

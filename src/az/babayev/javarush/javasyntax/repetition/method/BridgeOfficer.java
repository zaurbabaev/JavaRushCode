package az.babayev.javarush.javasyntax.repetition.method;

public class BridgeOfficer {

    private final int maxWeight;

    public BridgeOfficer(int normalWeight) {
        this.maxWeight = normalWeight;
    }

    public boolean checkTruck(Truck truck) {
        return maxWeight >= truck.getWeight();
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}

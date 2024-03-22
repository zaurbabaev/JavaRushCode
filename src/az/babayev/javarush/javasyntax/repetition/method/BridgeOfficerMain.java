package az.babayev.javarush.javasyntax.repetition.method;

public class BridgeOfficerMain {
    public static void main(String[] args) {
        Truck first = new Truck();
        first.setWeight(10000);
        Truck second = new Truck();
        second.setWeight(20000);

        BridgeOfficer bridgeOfficer = new BridgeOfficer(15000);
        System.out.println("Normal weight is " + bridgeOfficer.getMaxWeight());

        System.out.println("Грузовик номер 1! Могу я проехать, офицер?");

        boolean canFirstTruckGo = bridgeOfficer.checkTruck(first);
        System.out.format("weight is %d %b \n", first.getWeight(), canFirstTruckGo);

        System.out.println("-".repeat(20));

        boolean canSecondTruckGo = bridgeOfficer.checkTruck(second);
        System.out.println("Грузовик номер 2! А мне можно?");
        System.out.format("weight is %d %b \n", second.getWeight(), canSecondTruckGo);
    }
}

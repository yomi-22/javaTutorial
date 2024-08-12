package Interface;

import org.w3c.dom.ls.LSOutput;

public class Washing implements Laundry, WashingDryer {
    final double vat = 2.5;

    @Override
    public String soap(String soapType) {
        return soapType;
    }

    @Override
    public String washingCombo(String dryer) {
        return "I am using washing machine that has tumble dryer";
    }

    @Override
    public double repairCost(double price) {
        return price * vat;
    }

    @Override
    public String waterType(String waterTypes) {
        return waterTypes;
    }

    private void washingAppliance(String washingMachine) {
        if (washingMachine == "combo") {
            System.out.println(washingCombo(washingMachine));
        } else {
            System.out.println(repairCost(120.50));
        }

    }

    public static void main(String[] args) {
        Washing washing = new Washing();
        var water = washing.waterType("hard water");
        var soap = washing.soap("Arial");
        var cost = washing.repairCost(130.89);
        System.out.println("Using " + soap + " soap and " + water + " are good for washing and save you money on energy");
        washing.washing();
        washing.washingAppliance("combo");
    }
}

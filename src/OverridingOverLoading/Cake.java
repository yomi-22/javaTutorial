package OverridingOverLoading;

public class Cake {

    protected String flavor = "strawberry";
    protected double price = 400;

    public String getFlavor() {
        return flavor;
    }

    public String setFlavor(String flavor) {
        return flavor;
    }

    public double getPrice() {
        return price;
    }

    public double setPrice(double price) {
        return price;
    }

    public void tasteCake() {
        System.out.println("This cake tastes so good hmm yummy !!!");
    }

    public void getCakeQuote() {
        System.out.println("Your cake will costs " + this.price + "for " + this.flavor);
    }

    public void blowBirthdayCandle() {
        System.out.println("I received a " + this.price + " as a gift on my birthday");
    }

    public static void main(String[] ags) {
    }
}


package OverridingOverLoading;

public class WeddingCake extends Cake {
    private String gift;

    public String getTier() {
        return gift;
    }


    public void getCakeQuote() {
        System.out.println("Your wedding cake costs £" + price * 1.5 + " for " + flavor + " flavor");
    }

    // overloading -> method from BirthdayCake
    public void blowBirthdayCandle(String gift) {
        System.out.println("I received a " + gift + " as a gift on my wedding day");
    }

    public static void main(String[] args) {
        var weddingCake = new WeddingCake();
        //overriding
        weddingCake.getCakeQuote();
        // overloading
        weddingCake.blowBirthdayCandle("car");

        Cake cake = new Cake();
        cake.blowBirthdayCandle();

    }
}

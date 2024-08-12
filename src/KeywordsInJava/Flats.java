package KeywordsInJava;

public class Flats extends House {

    // using super keyword
    int bedroom = 2;
    String houseType = "flat";

    Flats() {
        super(450000.00);
    }

    public void houseInfo() { // parent method using super
        super.houseInfo();

        // calling the parent class variable value
        //  System.out.println("The building type is a " +  super.houseType + " and it has " + super.bedroom + " bedrooms");

        // calling the local variable from Flat
        System.out.println("The building type is a " + houseType + " and it has " + bedroom + " bedrooms");


    }

    public static void main(String[] args) {
        Flats flat = new Flats();

        flat.houseInfo();
    }

}

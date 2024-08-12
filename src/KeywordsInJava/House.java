package KeywordsInJava;

public class House {
    int bedroom = 4;
    String houseType = "detached";

    public House(double houseValue) {
        System.out.println("This house worth " + houseValue);
    }


    protected void houseInfo() {
        System.out.println("The building type is " + houseType + " and it has " + bedroom + " bedrooms");
    }
}

package polymorphism;

public class Carbohydrate extends Food {

    public String carb;

    @Override
    public void foodChoice() {
        System.out.println("I like to eat " + favouriteFood);
    }

    public void energyFood() {
        System.out.println("I get energy from eating " + carb);
    }


}

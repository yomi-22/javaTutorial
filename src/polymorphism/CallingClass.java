package polymorphism;

public class CallingClass {
    public static void main(String[] args) {
        Carbohydrate carbohydrate = new Carbohydrate();
        carbohydrate.favouriteFood = "rice";
        carbohydrate.foodChoice();
        carbohydrate.carb = "porridge";
        carbohydrate.energyFood();
// polymorphism
        Food food = new Carbohydrate();
        food.favouriteFood = "beans";
        food.foodChoice();
        ((Carbohydrate) food).carb = "potatoes";
        ((Carbohydrate) food).energyFood();


        Food protein = new Food();
        protein.favouriteFood = "fish";
        protein.foodChoice();


    }
}

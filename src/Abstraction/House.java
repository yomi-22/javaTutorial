package Abstraction;

public abstract class House {
    /*Abstract are used as base class, it contains both abstract and non abstract method
    if a method is abstract, the class has to be abstract. Any class inherit from the abstract class
    must provide implementation for the base class
    * */
    protected String planningPermission;

    abstract void layout(int noOfRooms);

    public void getPlanningPermission() {
        System.out.println("Your planning permission for " + planningPermission + " is now approved");
    }


}

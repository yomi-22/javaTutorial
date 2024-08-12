package Abstraction;

public class HouseType extends House {
    @Override
    void layout(int noOfRooms) {
        System.out.println("I am interested in applying to build " + noOfRooms + " bedroom house ");
    }

    public static void main(String[] args) {
        HouseType house = new HouseType();
        house.planningPermission = " 3 bedroom flat";

        house.layout(3);
        house.getPlanningPermission();
    }
}

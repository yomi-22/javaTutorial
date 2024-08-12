package Interface;

public interface Laundry {
    String soap(String soapType);

    String waterType(String waterTypes);
// To implement interface methods in the interface without implementing the methods
// in the class that extends it. You can use either of the following
    // keywords e.g. private, static and default. Then implement the method. See below
    default void washing() {
        System.out.println("I have completed my washing");
    }
  }

package KeywordsInJava;

public class FinalKeyword {
    // class with final keyword means the class can't be inherited
    // final keyword
    //final on variable means value can't be changed
    final String password = "mypassword";
    final int employId = 101;

    // final on method means the method can't be overridden by the inherited class. However,
    // the method can be inherited if the class the method is residing is not marked as final
    public static final void login() {
        System.out.println("Login with password or employ id");
        int n = 'Z' + 1;
        System.out.println("The value of n is " + n);
    }

    public static void main(String[] args) {
        login();
    }
}

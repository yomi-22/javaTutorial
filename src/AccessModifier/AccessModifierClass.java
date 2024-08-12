package AccessModifier;

public class   AccessModifierClass {

    private int number = 1;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age = 1;
    public String accessString = "Access Modifier";
    boolean exist;
    protected String result = "Yes";

    private int getNumber() {
        return Integer.parseInt("This is a number " + this.number);
    }

    public String getMessage() {
        return ("This is a number " + this.accessString);
    }

    boolean getAnswer() {
        return true;
    }

    protected String getResult() {
        return ("Is this your final answer? number " + this.result);
    }
}

package polymorphism;

public class Protein extends Food {

    protected String protein;

    public void setProtein(String protein) {
        System.out.println(protein + "is a source of protein food");
    }

    @Override
    public void foodChoice() {
        System.out.println(protein + " is a source of protein food");
    }
}

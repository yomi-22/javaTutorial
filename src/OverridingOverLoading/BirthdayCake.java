package OverridingOverLoading;

public class BirthdayCake extends Cake {
    public String getCandle() {
        return candle;
    }

    public void setCandle(String candle) {
        this.candle = candle;
    }

    private String candle;

    public static void main(String[] ags) {

    }

    public void blowBirthdayCandle() {
        System.out.println("I will blow my birthday " + candle + " +  when people are singing happy birthday song");
    }
}

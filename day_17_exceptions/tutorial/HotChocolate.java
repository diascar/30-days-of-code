package hotchocolate;

public class HotChocolate {

    public static final double tooHot = 85.0;
    public static final double tooCold = 65.0;

    public static void drinkHotChocolate(double temp) throws TooHotException, TooColdException {
        if (temp >= tooHot) {
            throw new TooHotException();
        }
        else if (temp <= tooCold) {
            throw new TooColdException();
        }
    }
    
    public static void main(String[] args) {
        double temperature = 90;

        try {
            drinkHotChocolate(temperature);
            System.out.println("Good!");
        } catch (TooHotException e1) {
            System.out.println("Too Hot!");
        } catch (TooColdException e2) {
            System.out.println("Too Cold!");
        }
    }
}
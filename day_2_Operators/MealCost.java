import java.util.Scanner;

public class MealCost {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

//using Double.parseDouble instead of scan.nextDouble(), otherwise it will return an error.
        double mealCost = Double.parseDouble(scan.next());
        int tipPercent = scan.nextInt();
        int taxPercent = scan.nextInt();
        int totalCost;

// casting double into int - (int)
        totalCost = (int) Math.round(mealCost + (mealCost*tipPercent/100) + (mealCost*taxPercent/100));

        
        //output
        System.out.println(totalCost);
    }
}
import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
       
        int totalCost =  (int)Math.round(mealCost+(double)mealCost*tipPercent/100+(double)mealCost*taxPercent/100);
      System.out.printf("The total meal cost is %d dollars.",totalCost);
        // Print your result
    }
}

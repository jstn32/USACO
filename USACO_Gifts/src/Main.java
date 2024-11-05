import java.util.Scanner;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cows = sc.nextInt();
        double budget = sc.nextDouble();

        // Arrays for price and shipping costs
        int[] price = new int[cows];
        int[] shipping = new int[cows];

        for (int i = 0; i < cows; i++) {
            price[i] = sc.nextInt();
            shipping[i] = sc.nextInt();
        }

        // total cost without any coupon
        double[] totalCost = new double[cows];

        // total cost for each cow without the coupon
        for (int i = 0; i < cows; i++) {
            totalCost[i] = price[i] + shipping[i];
        }

        // buy gifts for as many cows as possible without the coupon
        long moneySpent = 0;
        int maxCows = 0;
        for (int i = 0; i < cows; i++) {
            if (moneySpent + totalCost[i] <= budget) {
                moneySpent += totalCost[i];
                maxCows++;
            }
            else {
                break;
            }
        }
    }
}
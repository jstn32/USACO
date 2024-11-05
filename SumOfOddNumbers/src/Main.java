//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter a number from 1 to 1000");
        int num = sc.nextInt();


        for(int i =0; i <= num; i++){
            if(i % 2!=0) {
                total += i;
            }
        }

        System.out.println("The sum of all odd numbers 1 - n is " + total);




    }
}
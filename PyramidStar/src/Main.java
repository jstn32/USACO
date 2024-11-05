//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer");
        int n = sc.nextInt();

        //n rows
        //each row is n +2 more stars


        for(int i =0; i < n; i++){
            for(int x =0; x< n-(i+1); x++){

                System.out.print(" ");

            }
        //row start
            for(int j = 0; j <= 2*i; j++) {

                System.out.print("*");


            }
            System.out.println();
            //row end


        }


    }
}
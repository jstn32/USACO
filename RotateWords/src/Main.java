//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a string");
        String s = sc.nextLine();

        System.out.println("Enter an integer 1- 100");
        int k = sc.nextInt();

        //substring: first is inclusive, second is exclusive
        for(int i =0; i < k; i++){

            s = s.substring(s.length()-1)+s.substring(0,s.length()-1);

        }
//account for revolving until original string is reached
        
        System.out.println(s);

    }
}
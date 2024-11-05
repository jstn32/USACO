import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String input = sc.nextLine();

        System.out.println("Enter a character");
        char character = sc.nextLine().charAt(0);

        int counter = 0;
        for(int i =0; i < input.length(); i++){

            if(input.charAt(i) == character){

                counter ++;

            }

        }

        System.out.println("The charcater " + character + " appears in the word " + input + " " + counter + " times.");







    }
}
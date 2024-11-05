//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of rows");
        int n = sc.nextInt();

        int [][] array = new int[n][n];

        for(int i =0; i < n; i++){
            for(int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();

            }
        }
        print2DArray(array, n);


        System.out.println("Enter the number of rotations.");
        int k = sc.nextInt();

        for(int i =0; i < k; i++){
            array = rotation(array, n);
        }

    }

    public static void print2DArray(int[][] array, int n){

        for(int i =0; i < n; i++){
            for(int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] rotation(int[][] array, int n){

        int[][] rotatedArray = new int[n][n];

        //todo
        //use coordinate patterns discussed 

        return rotatedArray;

    }


}
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        System.out.println("Enter the array values: ");
        int[] values = new int[size];

        for(int i =0; i < size; i++){
            values[i] = sc.nextInt();
        }

        int max=0;
        for(int j =0; j < size; j++){

            if (max < values[j]) {
                max = values[j];
            }

        }


        System.out.println("Maximum value: " + max);
    }
}
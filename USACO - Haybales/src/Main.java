import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {


        //REading input.txt
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));

        int quantity = Integer.parseInt(br.readLine());

        int[] size = new int[quantity];
        int total=0;

        for(int i =0; i < quantity; i++){

            size[i] = Integer.parseInt(br.readLine());
            total += size[i];
        }

        int avg = total/quantity;
        int count =0;

        for(int i =0; i < quantity; i++){

            if(size[i]>avg){
                int dif = size[i]-avg;
                size[i] -=dif;
                count+=dif;
            }
            else if(size[i] < avg){
                int dif2 = avg-size[i];
                size[i] += dif2;
                count+=dif2;
            }

        }

        pw.println(count/2);

        //close
        pw.close();
        br.close();

    }
}
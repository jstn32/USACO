import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));

        //Reading input
        String line = br.readLine();
        System.out.println(line);//console output

        //writing to a file
        pw.println("This is a result");
        pw.close();
        br.close();




    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the incorrect base-2 and base-3 representations
        String base2 = sc.nextLine();
        String base3 = sc.nextLine();

        // Generate all possible correct values for base-2 and base-3 by fixing one digit
        Set<Integer> base2Candidates = generateCandidates(base2, 2);
        Set<Integer> base3Candidates = generateCandidates(base3, 3);

        // Find the common value between two sets
        for (int n : base2Candidates) {
            if (base3Candidates.contains(n)) {
                System.out.println(n);
                break;
            }
        }

        sc.close();
    }

    public static Set<Integer> generateCandidates(String input, int base){



        Set<Integer> returnVal = new HashSet();

        for(int i =0; i < input.length(); i++){
            char[] digits = input.toCharArray();
            char original = digits[i];
        }




    }
}
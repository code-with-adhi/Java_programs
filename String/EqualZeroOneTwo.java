package String;
import java.util.Scanner;

public class EqualZeroOneTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        System.out.println("Count of substrings: " + countEqualSubstrings(str));
    }

    public static int countEqualSubstrings(String str) {
        int count = 0;
        int n = str.length();

        for (int i = 0; i < n; i++) {
            int zeroCount = 0, oneCount = 0, twoCount = 0;

            for (int j = i; j < n; j++) {
              
                char ch = str.charAt(j);
                if 
                	(ch == '0') zeroCount++;
                else if 
                	(ch == '1') oneCount++;
                else if 
                	(ch == '2') twoCount++;

               
                if (zeroCount == oneCount && oneCount == twoCount) {
                    count++;
                }
            }
        }
        return count;
    }
}


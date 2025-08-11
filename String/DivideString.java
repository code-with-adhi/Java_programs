package String;
import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();
        System.out.println("Enter the number of parts: ");
        int N = scanner.nextInt();
        divideString(input, N);
    }

    public static void divideString(String str, int N) {
        int len = str.length();

        if (len % N != 0) {
            System.out.println("Cannot divide the string into " + N + " equal parts.");
            return;
        }

        int partSize = len / N;
        for (int i = 0; i < len; i += partSize) {
            
            for (int j = 0; j < partSize; j++) {
                System.out.print(str.charAt(i + j));
            }
            System.out.println(); 
        }
    }
}

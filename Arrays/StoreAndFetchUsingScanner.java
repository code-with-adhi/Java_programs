package Arrays;
import java.util.Scanner;

public class StoreAndFetchUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        sc.nextLine(); 

        char arr[] = new char[size]; 

        System.out.println("Enter " + size + " characters:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0); 
        }

        System.out.println("Stored characters are:");
        for (char c : arr) {
            System.out.println(c);
        }


    }
}

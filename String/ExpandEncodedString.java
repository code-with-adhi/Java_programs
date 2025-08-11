package String;
import java.util.Scanner;

public class ExpandEncodedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter encoded string: ");
        String input = sc.nextLine();
        expandString(input);
    }

    public static void expandString(String s) {
        int i = 0;
        
        while (i < s.length()) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') { 
                int num = 0;
                
                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }

                if (i < s.length() && s.charAt(i) == '{') {
                    i++; 
                    String temp = "";
                    
                    while (i < s.length() && s.charAt(i) != '}') {
                        temp += s.charAt(i);
                        i++;
                    }
                    i++; 

                    for (int j = 0; j < num; j++) {
                        System.out.print(temp + " ");
                    }
                    System.out.println(); 
                }
            }
        }
        
    }
}

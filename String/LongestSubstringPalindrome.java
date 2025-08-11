package String;
import java.util.Scanner;

public class LongestSubstringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.next();
        sc.close();
        
        String longestPalindrome = findLongestPalindromicSubstring(s);
        System.out.println("Longest Palindromic Substring: " + longestPalindrome);
    }

    public static String findLongestPalindromicSubstring(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String longestPalindrome = "";
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String subStr = s.substring(i, j + 1);

                if (isPalindrome(subStr) && subStr.length() > maxLength) {
                    longestPalindrome = subStr;
                    maxLength = subStr.length();
                }
            }
        }

        return longestPalindrome;
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

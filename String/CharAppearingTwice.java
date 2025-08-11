package String;
import java.util.Scanner;

public class CharAppearingTwice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] arr = new int[26];
		char[] sarr = s.toCharArray();
		
		 for (char ch : sarr) {
	            arr[ch - 'a']++; 
	            
	            if (arr[ch - 'a'] == 2) 
	            {  
	                System.out.println(ch); 
	                break;  
	            }
	        }
	        
		
	
}
	

}

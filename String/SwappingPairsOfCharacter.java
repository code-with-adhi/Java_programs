package String;
import java.util.Scanner;
public class SwappingPairsOfCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.next();
		StringBuilder res=new StringBuilder();
		char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length - 1; i += 2) {
            res.append((arr[i + 1])).append((arr[i]));
        }
		System.out.println(res);
	}

}

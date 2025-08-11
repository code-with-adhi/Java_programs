package String;
import java.util.Scanner;

public class DupilicateCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=Character.MIN_VALUE)
			{
				int count=0;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
						{
						count++;
						arr[j]=Character.MIN_VALUE;
						}
				}
				if(count>0)
					System.out.println(arr[i]);
			}
		}

	}

}

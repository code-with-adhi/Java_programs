package String;

import java.util.Scanner;

public class OccurenceOfEachChar {
	public static void main(String[] args) {
		String s = new String();
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		
		char[] arr = s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			if(arr[i]!=Character.MIN_VALUE)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						arr[j]=Character.MIN_VALUE;
					}
				}
				System.out.println(arr[i]+" : "+count);
			}
		}
	}

}

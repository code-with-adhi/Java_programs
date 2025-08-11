package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbersBetweenARange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=m;i<n;i++)
		{
		if(prime(i))
			al.add(i);
		}
		System.out.println(al);
	}
	public static boolean prime(int num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
		}
	return true;
	}

}

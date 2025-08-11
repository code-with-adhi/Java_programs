package Arrays;

public class StoreAndFetchData {
	public static void main(String[] args) {
		char[] a = new char[5];
		a[0]='a';
		a[1]=97+1;
		a[2]=98+1;
		a[3]='d';
		char e = 'e';
		a[4]=e;
		System.out.println(a);
		System.out.println(a.length);
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for (char x:a)
		{
			System.out.println(x);
		}
		
		
		
	}
}

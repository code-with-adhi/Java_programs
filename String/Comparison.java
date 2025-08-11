package String;

public class Comparison {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		System.out.println(str1==str2);
		
		
		String s1 = new String("Hi");
		String s2 = new String("hi");
		System.out.println(s1==s2);
		
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println("Hi".equalsIgnoreCase("hi"));
		
		System.out.println("Hi".compareTo("Hi"));
		System.out.println("hi".compareTo("Hi"));
		System.out.println("Hi".compareTo("hi"));
		
		String s3="Hello";
		System.out.println(s3);
		System.out.println(s3.toString());
		System.out.println(new String("Hello"));
		System.out.println(new String("Hello").toString());
		
	}

}

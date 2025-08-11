package String;

public class StringBufferCreation {
	public static void main(String[] args) {
		
		//No argument constructor
		StringBuffer s = new StringBuffer();
		//s="Hello";(Direct initialization not allowed)
		System.out.println(s.capacity());
		System.out.println(s.length());
		System.out.println(s.append("Hello"));
		s.append("Everyone");
		System.out.println(s.capacity());
		System.out.println(s);
		s.append("ABCD");
		System.out.println(s);
		System.out.println(s.capacity());
		s.append("ABCDEFGHIJKLMNOPQRSUDSHFIjaoda");
		System.out.println(s);
		System.out.println(s.capacity());
		
		
		// int arugument constructor
		StringBuffer s1 = new StringBuffer(20);
		System.out.println(s1.capacity());
		s1.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		System.out.println(s1);
		System.out.println(s1.capacity());
		
		
		//String argument constructor
		StringBuffer s2 = new StringBuffer("HELLO");
		System.out.println(s2.capacity());
		s2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		System.out.println(s2);
		System.out.println(s2.capacity());
		
		
	}

}

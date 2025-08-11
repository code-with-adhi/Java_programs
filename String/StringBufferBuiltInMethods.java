package String;

public class StringBufferBuiltInMethods {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Abc");
		StringBuffer s2 = new StringBuffer("Abc");
		System.out.println(s1.equals(s2));
		//equals
		System.out.println(new String(s1).equals(new String(s2)));
		//charAt
		System.out.println(s1.charAt(2));
		//Insert
		System.out.println(s1.insert(0, "ABC"));
		//Delete
		System.out.println(s1.delete(0, 4));
		//setCharAt
		s1.setCharAt(0, 'a');
		System.out.println(s1);
		//Remove extra space
		System.out.println(s1.capacity());
		s1.trimToSize();
		System.out.println(s1.capacity());
		//charAt
		System.out.println(s2.charAt(2));
		//length
		System.out.println(s2.length());
		//deleteCharAt
		StringBuffer s3 = new StringBuffer("Kabi");
		s3.deleteCharAt(0);
		System.out.println(s3);
		//setLength
		s3.setLength(18);
		System.out.println(s3.length());
		//substring
		System.out.println(s3.substring(2));
		System.out.println(s3.substring(1,3));
		//capacity
		System.out.println(s3.capacity());
		StringBuffer s4 = new StringBuffer("Abu");
		System.out.println(s4.replace(2, 3, "i"));
		
		
		
		
	}

}

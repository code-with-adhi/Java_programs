package ArrayList;

import java.util.ArrayList;

public class FirstLetterOfEachWord {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("Banana");
		al.add("Cherry");
		al.add("Date");
		al.add("ElderBerry");
		char[] arr = new char[al.size()];
		for(int i=0;i<al.size();i++)
			arr[i]=al.get(i).charAt(0);
	
		System.out.println(arr);
	}

}

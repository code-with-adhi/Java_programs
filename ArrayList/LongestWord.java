package ArrayList;
import java.util.ArrayList;

public class LongestWord {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Programming");
		al.add("Language");
		al.add("Code");
		al.add("Algorithm");
		int max=0;
		String word =null;
		for(int i=0;i<al.size();i++)
		{
			String x = al.get(i);
			if(x.length()>max)
			{
				max = x.length();
				word = x;
			}
		}
		System.out.println(word);
	}

}

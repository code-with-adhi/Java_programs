package ArrayList;
import java.util.ArrayList;
import java.util.ListIterator;

public class CountDuplicates {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(20);
		al.add(10);
		al.add(50);
		int duplicateCount = 0;
		ArrayList<Integer> visited = new ArrayList<>();

		        for (int i = 0; i < al.size(); i++) 
		        {
		            int count = 0;
		            if (!visited.contains(al.get(i))) 
		            {
		                for (int j = i + 1; j < al.size(); j++) 
		                {
		                    if (al.get(i).equals(al.get(j))) 
		                    {
		                        count++;
		                    }
		                }
		                visited.add(al.get(i));
		                duplicateCount += count;
		            }
		        }

		        System.out.println("Number of duplicate elements: " + duplicateCount);
		    }

	}



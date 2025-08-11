package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MovieDriver {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(30);
		al1.add(40);
		al1.add(10);
		al1.add(20);
		Collections.sort(al1);
		System.out.println(al1);
		
		ArrayList<Movie> al2 = new ArrayList<Movie>();
		al2.add(new Movie("Bigil","Vijay","Nayanthara",5.0));
		al2.add(new Movie("Dragon","Pradeep","Anupama",4.3));
		al2.add(new Movie("Ok Kanmani","DQ","Nithya menon",4.9));
		al2.add(new Movie("Anjaan","Suriya","Samantha",2.5));
		Collections.sort(al2);
		System.out.println(al2);
		Comparator<Movie> c = new RatingsComparator();
		Collections.sort(al2,c);
		System.out.println(al2);
		
		System.out.println("Sort based on : \n 1.Movie name \n 2.Actor name \n 3.Actress name \n 4.Ratings \n");
		System.out.println("Enter an option: ");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch(option)
		{
		case 1:
			Collections.sort(al2);
			System.out.println(al2);
			break;
		case 2:
			Comparator<Movie> c1 = new ActorComparator();
			Collections.sort(al2,c1);
			System.out.println(al2);
			break;
		case 3:
			Comparator<Movie> c2 = new ActressComparator();
			Collections.sort(al2,c2);
			System.out.println(al2);
			break;
		case 4:
			Comparator<Movie> c3 = new RatingsComparator();
			Collections.sort(al2,c3);
			System.out.println(al2);
			break;
		default:
			System.out.println("Invalid option");
			break;
		}
	}

}

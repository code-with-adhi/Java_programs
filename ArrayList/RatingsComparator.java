package ArrayList;
import java.util.Comparator;

public class RatingsComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) 
	{
		if(o1.ratings==o2.ratings)
			return 0;
		else if(o1.ratings>o2.ratings)
			return 1;
		else
			return -1;
	}
	
	

}

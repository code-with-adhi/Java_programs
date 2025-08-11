package ArrayList;

import java.util.Comparator;

public class ActressComparator implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.actress.compareTo(o2.actress);
	}

}

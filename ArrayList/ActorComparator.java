package ArrayList;
import java.util.Comparator;
import ArrayList.Movie;

public class ActorComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.actor.compareTo(o2.actor);
			
	}

}

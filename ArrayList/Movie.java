package ArrayList;

public class Movie implements Comparable<Movie>{
	String name;
	String actor;
	String actress;
	double ratings;
	public Movie(String name, String actor, String actress,double ratings) {
		this.name = name;
		this.actor = actor;
		this.actress = actress;
		this.ratings=ratings;
	}
	
	@Override
	public String toString() {
		return "Movie [name=" + name + ", actor=" + actor + ", actress=" + actress + ", ratings=" + ratings + "]";
	}

	@Override
	public int compareTo(Movie o) 
	{
		return this.name.compareTo(o.name);
	}
}

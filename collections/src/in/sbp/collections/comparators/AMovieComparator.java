package in.sbp.collections.comparators;

import java.util.Comparator;

import in.sbp.collections.entities.AMovies;

public class AMovieComparator{

	public static Comparator<AMovies> byName = (movie1, movie2) -> 
	movie1.getName().compareTo(movie2.getName());
	
	public static Comparator<AMovies> byYear = (movie1, movie2) -> 
	movie1.getYear().compareTo(movie2.getYear());
	
	public static Comparator<AMovies> byRole = (movie1, movie2) -> 
	movie1.getRole().compareTo(movie2.getRole());
}

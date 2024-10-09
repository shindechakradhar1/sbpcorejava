package in.sbp.collections.set;

import java.util.NavigableSet;
import java.util.TreeSet;

import in.sbp.collections.comparators.AMovieComparator;
import in.sbp.collections.entities.AMovies;

public class MainAMoviesTreeSet {

	public static void main(String[] args) {
		
		NavigableSet<AMovies> aMovieSet = new TreeSet<>(AMovieComparator.byYear);
		
		AMovies firstMovie = new AMovies();
		firstMovie.setYear("1973");
		firstMovie.setName("Zanjeer");
		firstMovie.setRole("Inspector Vijay Khanna");
		
		
		aMovieSet.add(firstMovie);
		aMovieSet.add(new AMovies("1973", "Namak Haraam", "Vicky"));
		aMovieSet.add(new AMovies("1974", "Roti Kapda Aur Makan", "Vijay"));
		aMovieSet.add(new AMovies("1975", "Sholay", "Jay"));
		aMovieSet.add(new AMovies("1990", "Agneepath", "Vijay Dinanath Chauhan"));
		
		System.out.println(aMovieSet);
	}
}

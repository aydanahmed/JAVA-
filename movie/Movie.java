package movie;

import java.util.ArrayList;
import java.util.HashMap;

public class Movie {

	public static enum CATEGORY {
		ACTION, COMEDY, THRILER, DOCUMENTARY, NONE
	}

	private String title;
	private int year;
	private CATEGORY category;
	private static HashMap<CATEGORY, ArrayList<String>> movieCat = new HashMap<CATEGORY, ArrayList<String>>();

	private Movie(String title, int year, CATEGORY category) {
		this.title = title;
		this.year = year;
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public CATEGORY getCategory() {
		return category;
	}

	public int getYear() {
		return year;
	}

	public static Movie createMovie(String title, int year, CATEGORY category) {
		Movie retVal = new Movie(title, year, category);
		addMovieToCategory(retVal.category, retVal.title);
		return retVal;

	}

	private static void addMovieToCategory(CATEGORY category, String title) {

		if (!movieCat.containsKey(category)) {
			movieCat.put(category, new ArrayList<>());
			movieCat.get(category).add(title);
		} else {

			movieCat.get(category).add(title);
		}
	}

	public static ArrayList<String> getMoviesFromCategory(CATEGORY cat) throws NoMoviesException {

		return movieCat.get(cat);
	}

}

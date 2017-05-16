

// this class acts as Proxy
class MoviePlayer implements VideoFunctions {

	Movie movie;
	String name;

	public MoviePlayer(String name) {
		super();
		movie = new Movie(name);
	}

	public void playMovie() {
		movie.playMovie();
	}

	public String getMovieDetails() {
		return movie.getMovieDetails();
	}

	public void deleteMovie(String movieName) {
		System.out.println("Permission denied!!");
	}
}
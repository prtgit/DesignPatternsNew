

public class ProxyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// The movie name has to be "The Prestige"
		VideoFunctions moviePlayer = new MoviePlayer("The Prestige");

		System.out.println(moviePlayer.getMovieDetails());

		moviePlayer.playMovie();
	}

}



// Implementation of video functions. This is implementation of real subject,
// that is objects of which are accessed through proxy
class Movie implements VideoFunctions {

	String name;

	public Movie(String name) {
		super();
		this.name = name;
	}

	public void playMovie() {
		System.out.println("Playing movie: " + this.name + "\n");
	}

	public String getMovieDetails() {
		String details = "";
		if (this.name.equalsIgnoreCase("The Prestige"))
			details = "Name: The Prestige\n Size: 1023MB\n Director: Christopher Nolan\n";
		else
			details = "Details not available.\n";
		return details;
	}
}
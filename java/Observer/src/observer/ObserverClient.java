package observer;

public class ObserverClient {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BreakingNewsFeed breakingNewsFeed = new BreakingNewsFeed();
		
		CNN cnn = new CNN(breakingNewsFeed);
		FoxNews foxNews = new FoxNews(breakingNewsFeed);
		
		
		breakingNewsFeed.setBreakingNews("UK votes to leave EU");
		System.out.println();
		NBCNews nbcNews = new NBCNews(breakingNewsFeed);
		breakingNewsFeed.setBreakingNews("Dow Jones set new record");
	}

}

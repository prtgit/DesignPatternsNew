package observer;

public class FoxNews extends Observer{
	
	public FoxNews(BreakingNewsFeed breakingNewsFeed) {
		super(breakingNewsFeed);
	}
	
	@Override
	public void sendNotification() {
		System.out.println("Fox Alert : " +breakingNewsFeed.getBreakingNews());
	}

}

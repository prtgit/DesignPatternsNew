package observer;

public class NBCNews extends Observer{
	
	public NBCNews(BreakingNewsFeed breakingNewsFeed) {
		super(breakingNewsFeed);
	}
	
	@Override
	public void sendNotification() {
		System.out.println("NBC Breaking News: " + breakingNewsFeed.getBreakingNews());
	}

}

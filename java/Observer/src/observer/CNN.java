package observer;

public class CNN extends Observer{
	
	public CNN(BreakingNewsFeed breakingNewsFeed) {
		super(breakingNewsFeed);
	}
	
	@Override
	public void sendNotification() {
		System.out.println("CNN Breaking News : " + breakingNewsFeed.getBreakingNews());
	}

}

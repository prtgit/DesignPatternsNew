
public class LevelThree extends SupportChain {

	@Override
	public void handleRequest(IssueType issueType) {
		if (issueType == IssueType.Production) {
			System.out.println("Level three support team will reach to you shortly");
		} else {
			supportChain.handleRequest(issueType);
		}
	}

}

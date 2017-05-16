public class LevelTwo extends SupportChain { //> 3

	@Override
	public void handleRequest(IssueType issueType) {
		if (issueType == IssueType.Configuration) {
			System.out.println("Configuration support team will reach to you shortly");
		} else {
			supportChain.handleRequest(issueType);
		}
	}

}

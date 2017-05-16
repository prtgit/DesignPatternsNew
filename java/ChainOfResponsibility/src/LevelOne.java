
public class LevelOne extends SupportChain{
	
	@Override
	public void handleRequest(IssueType issueType) {
		if (issueType == IssueType.General) {
			System.out.println("General support team will reach to you shortly");
		} else {
			supportChain.handleRequest(issueType);
		}
	}
	
}

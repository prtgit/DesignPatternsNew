public abstract class SupportChain {
	
	protected SupportChain supportChain; //> 4
	
	public void setNext(SupportChain supportChain) {
		this.supportChain = supportChain;
	}

	public abstract void handleRequest(IssueType issueType);
}

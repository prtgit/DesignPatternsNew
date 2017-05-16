enum IssueType {
	General, Configuration, Production;
}


public class Client {

	public static void main(String[] args) {
		SupportChain genericSupport = new LevelOne();
		SupportChain configSupport = new LevelTwo();
		SupportChain productionSupport = new LevelThree();
		
		genericSupport.setNext(configSupport); //> 1
		configSupport.setNext(productionSupport); // >2
		
		genericSupport.handleRequest(IssueType.Production);
		genericSupport.handleRequest(IssueType.Configuration);
	}

}

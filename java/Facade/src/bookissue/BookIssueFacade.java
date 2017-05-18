package bookissue;

public class BookIssueFacade {
	
	private int studentId;
	__________________ acctCheck; //>> Blank 1
	__________________ bookCheck; //>> Blank 2
	
	
	public BookIssueFacade(int studentId) {
		this.studentId = studentId;	
		acctCheck = ______________________; //>> Blank 3
		bookCheck = ______________________; //>> Blank 4
	}
	public int getStudentId() {
		return studentId;
	}
	
	public void issueBook(String book){
		if(acctCheck.isStudentIdValid(getStudentId()) && bookCheck.isBookAvailable(book)){
			System.out.println("You have 2 days to return it");
		}
	}

	

}

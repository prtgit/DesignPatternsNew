package memento;

public class HomeTheatre {
	
	private LedTV ledTv;
	private Speaker speaker;
	private static int stateCount = 0;
	
	public HomeTheatre(LedTV ledTv, Speaker speaker) {
		this.ledTv = ledTv;
		this.speaker = speaker;
		stateCount++;
	}

	public LedTV getLedTv() {
		return ledTv;
	}

	public void setLedTv(LedTV ledTv) {
		this.ledTv = ledTv;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public Memento createMemento() {
		return ____________________; //>> 1. Fill in the Blank 
	} 
	
	public void setMemento(Memento memento)
	 {
		ledTv = ____________________; //>> 2. Fill in the Blank           
		speaker = ____________________; //>> 3. Fill in the Blank 
	 }
	
	public static int getStateCount(){
		return stateCount;
	}
	
	@Override
    public String toString() {
     return "HomeTheatre [ledTV = " + ledTv + "Speaker = "+speaker+"]";
    }
}

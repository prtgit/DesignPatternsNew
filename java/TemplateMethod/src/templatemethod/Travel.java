package templatemethod;

public abstract class Travel {
	
	final void travel(){
		identifyDestination();
		identifyTravelDates();
		if (_________________){ //>> 1. Fill in the blank 
			usePrivateVehicle();
		}
		if (isMealAvailable()){
			chooseMeal();
		}
		if (usePublicTransport()){
			bookTicket();
		}	
		____________________; //>> 2. Fill in the blank
	}
	
	

	

	abstract void identifyDestination();
	abstract void identifyTravelDates();
	abstract void chooseMeal();
	abstract void usePrivateVehicle();
	abstract void bookTicket();
	abstract void displayTravelDetails();
	
	boolean isMealAvailable(){return true;}
    boolean usePublicTransport() {return true;}
	

}



//caller
class extractingTool{
	Extractions extraction;
	
	public void setExtraction(Extractions extraction){
		this.extraction = extraction;
	}
	
	public void startExtraction(){
		extraction.callCorrectExtraction();
	}
}
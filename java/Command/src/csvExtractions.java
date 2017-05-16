

class csvExtractions implements Extractions{
	
	Extractor csvExtractor = new csvExtractor();
	
	String file;

	public csvExtractions(String file) {
		super();
		this.file = file;
	}
	
	public void callCorrectExtraction() {
		csvExtractor.extract();
	}
	
}


class tsvExtractions implements Extractions{
	
	Extractor tsvExtractor = new tsvExtractor();
	String file;
	
	public tsvExtractions(String file) {
		super();
		this.file = file;
	}

	public void callCorrectExtraction() {
		tsvExtractor.extract();
	}
	
}
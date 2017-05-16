

class databaseExtractions implements Extractions{

	Extractor dbExtractor = new databaseExtractor();
	String file;
	
	public databaseExtractions(String file) {
		super();
		this.file = file;
	}

	public void callCorrectExtraction() {
		dbExtractor.extract();
	}
	
}
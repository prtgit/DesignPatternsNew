
class TSVExtraction implements Extraction {

	public void extract() {
		// complete the method below
		
		open();
		System.out.println("I will extract by separating row by tabs.");
		close();
	}

	public void open() {
		System.out.println("Opening TSV file");
	}

	public void close() {

		System.out.println("Closing TSV file");
	}
}
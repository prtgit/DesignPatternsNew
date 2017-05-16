
class DatabaseExtraction implements Extraction {

	public void extract() {
		// complete the method below
		
		open();
		System.out.println("I will extract by reading rows and columns.");
		close();
	}

	public void open() {

		System.out.println("Opening database file");
	}

	public void close() {
		System.out.println("Closing database file");
	}
}
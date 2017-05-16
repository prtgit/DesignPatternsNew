
class Database implements Data {

	public String whichDataType() {
		return "Database";
	}

	public void extractData() {

		// blank below
		new DatabaseExtraction().extract();
	}
}
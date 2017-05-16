

class CSVData implements Data {

	public String whichDataType() {
		return "CSV";
	}

	public void extractData() {

		// blank below
		new CSVExtraction().extract();

	}
}

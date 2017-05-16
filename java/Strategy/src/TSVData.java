
class TSVData implements Data {

	public String whichDataType() {
		return "TSV";
	}

	public void extractData() {

		// blank below
		new TSVExtraction().extract();
	}
}

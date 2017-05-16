require_relative 'csv_data'
require_relative 'csv_extraction'

class CSVData < Data
  def type
    "csv"
  end

  def extractData
    CSVExtraction.new.extract
  end

end
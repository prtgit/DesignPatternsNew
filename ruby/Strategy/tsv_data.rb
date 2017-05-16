require_relative 'data_class'
require_relative 'tsv_extraction'

class TSVData < DataClass
  def type
    "tsv"
  end

  def extractData
    TSVExtraction.new.extract
  end
end
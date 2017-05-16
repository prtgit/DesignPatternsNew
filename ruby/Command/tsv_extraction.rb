require_relative 'extraction'
require_relative 'tsv_extractor'

class TSVExtraction < Extraction

  attr_accessor :file

  def initialize (file)
    @file = file;
  end

  def callCorrectExtraction
    TSVExtractor.new.extract
  end

end
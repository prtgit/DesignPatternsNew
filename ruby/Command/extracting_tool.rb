require_relative 'extraction'

class ExtractingTool
  attr_accessor :extraction

  def setExtraction extraction
    @extraction = extraction
  end

  def startExtraction
    extraction.callCorrectExtraction
  end
end
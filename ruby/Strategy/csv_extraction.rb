require_relative 'extraction'

class CSVExtraction < Extraction

  def initialize
  end

  def extract
    open
    print "I will extract by seperating row by commas\n"
    close
  end

  private
  def open
    print "Opening CSV file\n"
  end

  private
  def close
    print "Closing CSV file\n"
  end
end
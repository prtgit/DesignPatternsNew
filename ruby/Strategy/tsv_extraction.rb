require_relative 'extraction'

class TSVExtraction < Extraction

  def initialize
  end

  def extract
    open
    print "I will extract by seperating row by tabs\n"
    close
  end

  private
  def open
    print "Opening TSV file\n"
  end

  private
  def close
    print "Closing TSV file\n"
  end
end
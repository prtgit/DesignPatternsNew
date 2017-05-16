require_relative 'extraction'

class DBExtraction < Extraction

  def initialize
  end

  def extract
    open
    print "I will extract by reading rows and columns\n"
    close
  end

  private
  def open
    print "Opening database file\n"
  end

  private
  def close
    print "Closing database file\n"
  end
end
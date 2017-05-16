require_relative 'data_class'
require_relative 'db_extraction'

class Database < DataClass
  def type
    "database"
  end

  def extractData
    DBExtraction.new.extract
  end
end
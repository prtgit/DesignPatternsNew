class DataClass
  def type
    raise NotImplementedError, "Ask the subclass"
  end

  def extractData
    raise NotImplementedError, "Ask the subclass"
  end

end
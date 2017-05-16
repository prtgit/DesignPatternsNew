class Extraction
  def extract
    raise NotImplementedError, "Implement this method in a child class\n"
  end

  private
  def open
    raise NotImplementedError, "Implement this method in a child class\n"
  end

  private
  def close
    raise NotImplementedError, "Implement this method in a child class\n"
  end
end
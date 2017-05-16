# abstract expression class
class Expression
  def interpret
    raise NotImplementedError, 'Ask the subclass'
  end
end
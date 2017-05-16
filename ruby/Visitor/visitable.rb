class Visitable
  def accept(visitor)
    raise NotImplementedError, 'Ask the subclass'
  end
end
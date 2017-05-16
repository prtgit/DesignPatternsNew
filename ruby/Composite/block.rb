require_relative 'Group'

# Single block
class Block < Group
  attr_accessor :width
  attr_accessor :length
  attr_accessor :parent

  def initialize(width, length)
    @width = width
    @length = length
  end

  # assemble method should treat both single and group of blocks same.
  def assemble
    print "Adding a block of #{@width}X#{@length} \n"
  end
end
# Assume that this class represents database and stores some values
# of initialization attributes of Car object

class CarDB
  attr_accessor :engineCapacity
  attr_accessor :noOfSeats
  attr_accessor :horsePower

  def initialize
    @engineCapacity = 2000
    @noOfSeats = 5
    @horsePower = 150
    print "Accessing database to fetch base values for car object"
  end
end
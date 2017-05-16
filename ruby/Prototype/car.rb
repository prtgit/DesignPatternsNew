class Car < PrototypeCloneable
  private
      attr_accessor :name
      attr_accessor :engineCapacity
      attr_accessor :noOfSeats
      attr_accessor :horsePower
      attr_accessor :cruiseControl
      attr_accessor :automaticClimateControl

  def initialize
    @cruiseControl = false
    @automaticClimateControl = false
    carDB = CarDB.new
    @engineCapacity = carDB.getEngineCapacity
    @noOfSeats = carDB.getNoOfSeats
    @horsePower = carDB.getNoOfSeats
    print "Creating car object..";
  end


  def clone
    print "Cloning Car object.."
    return (Car) super.clone();
  end

  def printDetails
    print "Name: #{@name} \nEngine Capacity: #{@engineCapacity} \nNumber of seats: #{@noOfSeats}
    \nHorse Power: #{@horsePower} \nCruise Control: #{@cruiseControl}
    \nAutomatic Climate Control: #{@automaticClimateControl}"
  end
end
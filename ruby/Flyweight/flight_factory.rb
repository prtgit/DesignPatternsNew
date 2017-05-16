require_relative 'Flight'
class FlightFactory
  def initialize
    @flight_map = Hash.new
  end

  def get_flight (flight_company)
    if @flight_map.has_key?(flight_company) # > 1
      @flight_map[flight_company]
    else
      flights = Flight.new(flight_company)
      @flight_map[flight_company] = flights # > 2
    end
  end
end
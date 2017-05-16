require_relative 'flight_factory'

class FlightWorldMap
  def initialize
    @flights = ["Delta", "American Airlines", "United", "BA", "Air France", "KLM" ]
    @ffactory = FlightFactory.new
  end

  def get_random_latitude
    rand(0..90)
  end

  def get_random_longitude
    rand(0..180)
  end

  def get_random_flight
    return @flights[rand(0..5)]
  end

  def get_random_flight_no
    rand(100..900)
  end

  def display_all_flight
    for i in 1..100000
      flight = @ffactory.get_flight(get_random_flight) # > 3
      flight.draw_on_map(get_random_flight_no(), get_random_latitude(), get_random_longitude());
    end
  end
end
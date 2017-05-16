class Flight
  attr_accessor :company

  def initialize (company)
    @company = company
  end

  def draw_on_map (flight_no,latitude, longitude)
    puts "#{@company}  flight  #{flight_no}  is currently at #{latitude}  latitude  and #{longitude}  longitude"
  end
end
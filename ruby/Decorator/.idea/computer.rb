class Computer
  def getParts
    raise NotImplementedError.new("Implement this method in a subclass")
  end

  def getCost
    raise NotImplementedError.new("Implement this method in a subclass")
  end
end

class BasicComputer < Computer
  def initialize
    @ram = 256
    @rom = 4
  end

  def getParts
    "RAM =#{@ram} MB ROM = #{@rom} GB"
  end

  def getCost
    200
  end
end

class HardwareCustomizer < Computer
  def initialize(newComp)
    _____________________; #>> 1.Fill in the blank
  end

  def getParts
     ____________________; #>> 2.Fill in the blank
  end

  def getCost
    @tempComp.getCost
  end
end

class GamingComputer < HardwareCustomizer
  _____________________ (newComp) #>> 5.Fill in the header for the missing routine
    _________________ #>> 6.Fill in the blank
    @graphics = 2
    @graphicsCost = 10
  end

  def getParts
    "#{_____________________} Graphics Card = #{@graphics} GB" #>> 7.Fill in the blank
  end

  def getCost
    @tempComp.getCost + @graphicsCost
  end
end

class Laptop < HardwareCustomizer
  def initialize(newComp)
    _____________________; #>> 3. Fill in the blank
    @ssd = 200
    @ssdCost = 80
  end

  def getParts
    "#{_______________________} Solid State Drive = #{@ssd} GB" #>> 4.Fill in the blank
  end

  def getCost
    @tempComp.getCost + @ssdCost
  end
end

customizedPC = GamingComputer.new(Laptop.new(BasicComputer.new))
puts "Parts: #{customizedPC.getParts}"
puts "Cost = #{customizedPC.getCost}"

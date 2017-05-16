baseCar = Car.new
baseCar.name = "Focus S"
baseCar.printDetails

print "\n"
otherVersion  = (Car) PrototypeFactory.getInstance(baseCar);
otherVersion.name = "Focus SE"
otherVersion.AutomaticClimateControl = true
otherVersion.CruiseControl = true
otherVersion.printDetails
           

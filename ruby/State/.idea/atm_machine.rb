class AtmMachineState
  def insertCard
    raise NotImplementedError, "Override this method in a subclass"
  end
  def ejectDebitCard
    raise NotImplementedError, "Override this method in a subcalss"
  end
  def withdraw
    raise NotImplementedError, "Override this method in a subcalss"
  end
end

class HasDebitCardState < _________________ # >> 7. Fill in the blank
  def insertCard
    puts "Debit Card is already there,So you cannot insert the Debit Card ..."
  end
  def ejectDebitCard
    puts "Debit Card is ejected..."
  end
  def withdraw
    puts "Pin number has been entered correctly and money has been withdrawn..."
  end
end

class NoDebitCardState < AtmMachineState
  def insertCard
    puts "Card inserted ...."
  end
  def ejectDebitCard
    puts "No Debit Card in ATM Machine slot, so you cannot eject the Debit Card..."
  end
  def withdraw
    puts "No Debit Card in ATM Machine slot, so you cannot enter the pin and withdraw the money..."
  end
end

class AtmMachine < AtmMachineState
  def initialize
    @atmMachineState =NoDebitCardState.new
  end
  def getAtmMachineState
    @atmMachineState;
  end
  def setAtmMachineState(atmMachineState)
    @atmMachineState = atmMachineState;
  end
  def insertCard
    @atmMachineState.insertCard
    if @atmMachineState.instance_of? _______________ #>> 1. Fill in the blank 
      hasDebitCardState = ________________; #>> 2. Fill in the blank
      setAtmMachineState _________________; #>> 3. Fill in the blank
      puts "Now in ATM Machine internal state : #{@atmMachineState.class.to_s}"
    end
  end
  def ejectDebitCard
    @atmMachineState.ejectDebitCard
    if @atmMachineState.instance_of? _______________ #>> 4. Fill in the blank
      noDebitCardState = ___________________; #>> 5. Fill in the blank
      setAtmMachineState __________________; #>> 6. Fill in the blank
      puts "Now in ATM Machine internal state : #{@atmMachineState.class.to_s}"
    end
  end
  def withdraw
    @atmMachineState.withdraw
  end
end

atmMachine = AtmMachine.new;

puts "ATM Machine Current state : #{atmMachine.getAtmMachineState.class.to_s}"

puts
atmMachine.withdraw
atmMachine.ejectDebitCard
atmMachine.insertCard

puts "ATM Machine Current state : #{atmMachine.getAtmMachineState.class.to_s}"
puts

atmMachine.withdraw
atmMachine.insertCard
atmMachine.ejectDebitCard

puts "ATM Machine Current state : #{atmMachine.getAtmMachineState.class.to_s}"
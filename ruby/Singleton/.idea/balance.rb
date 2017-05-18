class Balance
   @@firstInstance = nil
 
   _____________________ #>> 1.Fill in the method definition
     @balance = balance
   end
 
   def self.getInstance
     if (_____________) #>> 2.Fill in the condition
       @@firstInstance = Balance.new(10000)
     end
     @@firstInstance
   end
 
   def withdraw (amount)
     if (@balance>amount)
       @balance -= amount
     else
       puts "Insufficient Balance"
     end
 
   end
 
   def deposit (amount)
     @balance = amount
   end
 
   def getBalance
     @balance
   end
   ___________ :initialize #>> 3.Fill in the blank
 
 end
 
 class FamilyMember
 
   def initialize (name)
     @name = name
     @b = Balance.___________ #>> 4.Fill in the blank
   end
 
   def withdraw (val)
     ________.withdraw val #>> 5.Fill in the blank
   end
 
   def deposit (val)
     ________.deposit val #>> 6.Fill in the blank
   end
 
   def getBalance
     ________.getBalance #>> 7.Fill in the blank
   end
 
 end
 
 father = FamilyMember.new "Father"
 puts "Current family Balance = #{father.getBalance}"
 puts "Father deposits money"
 father.deposit 1000
 puts "Balance after deposit = #{father.getBalance}"
 
 son = FamilyMember.new "Son"
 puts "Son withdraws money"
 son.withdraw 200
 
 puts "Balance after withdrawing =#{son.getBalance}"
 
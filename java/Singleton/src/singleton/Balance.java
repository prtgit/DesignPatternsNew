class Balance {

	____________ ___________ Balance firstInstance = null; //>> 1.Fill in the Keywords
 	private int balance;
	
 	________________________________ { //>> 2.Fill in the header for the missing routine
 		this.balance = balance;
 	}

 	public static Balance getInstance (){
		if (______________________) { //>> 3.Fill in the condition	 
  			firstInstance = new Balance(10000);
  		}
  		return firstInstance;
  	}

  	public void withdraw (int amount){
	  if (balance>amount)
		balance -= amount;
  	  else
  		System.out.println("Insufficient balance");
  	}

  	public void deposit (int amount){
		balance += amount;
  	}

  	public int getBalance (){
		return balance;
  	}
}

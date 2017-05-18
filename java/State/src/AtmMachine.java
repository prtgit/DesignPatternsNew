
public class AtmMachine implements AtmMachineState
{

  private AtmMachineState atmMachineState;

  public AtmMachine()
  {
    atmMachineState = new NoDebitCardState();
  }

  public AtmMachineState getAtmMachineState()
  {
    return atmMachineState;
  }

  public void setAtmMachineState( AtmMachineState atmMachineState )
  {
    this.atmMachineState = atmMachineState;
  }

  @Override
  public void insertCard()
  {
    atmMachineState.insertCard();

    if( atmMachineState instanceof _______________ ) //>> 1. Fill in the blank
    {

      AtmMachineState hasDebitCardState = __________________; //>> 2. Fill in the blank
      setAtmMachineState(_________________); //>> 3. Fill in the blank
      System.out.println("Now in ATM Machine internal state : "
                      + atmMachineState.getClass().getName());
    }

  }

  @Override
  public void ejectDebitCard()
  {
    atmMachineState.ejectDebitCard();

    if( atmMachineState instanceof _________________ ) //>> 4. Fill in the blank
    {

      AtmMachineState noDebitCardState = _____________________; //>> 5. Fill in the blank
      setAtmMachineState(_________________); //>> 6. Fill in the blank
      System.out.println("Now in ATM Machine internal state : "
                      + atmMachineState.getClass().getName());
    }

  }

  @Override
  public void withdraw() 
  {
    atmMachineState.withdraw();    
  }

}
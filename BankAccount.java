class BankAccount{
//declare private variables which are reachable to the rest of the class
  private double beginBalance;
  private double balance;
  private String owner;

  //default constructor
  public BankAccount(){
    beginBalance =0;
    balance =0;
    owner ="";
  }
  //parameter constructor for all variables
  public BankAccount(String owner, double balance, double beginBalance){
    this.owner = owner;
    this.balance = balance;
    this.beginBalance = beginBalance;
    
  }
  //parameter constructor for only owner name
  public BankAccount(String owner){
    this.owner = owner;
  }

  //METHODS

  //accessor to get balance
  public double getBalance(){
    return balance;
  }
  //mutator deposit to take away money
   public double deposit(double amount){
    balance = balance+ amount;
    return balance;
  }
  //mutator withdraw to add money
  public double withdraw(double amount){
    balance = balance- amount;
    return balance;
  }

  //accessor method, returns info in string
  public String toString(){
    String info = owner +" has $"+balance+" in their account";
    return info;
  }
  
}
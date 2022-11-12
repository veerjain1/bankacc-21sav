class Main {
  public static void main(String[] args) {
 //CREATE OBJECT FOR bank account CLASS
    //SEND THE =DATA TO THE CLASS TO BUILD OBJECTS
    BankAccount b1 = new BankAccount("Mark", 100,100);
    BankAccount b2 = new BankAccount("John", 50,10);
    BankAccount b3 = new BankAccount("Mary", 50000,5);

    //Call functions with respect to object and print each result
    
    System.out.println(b1.toString());
    System.out.println(b1.withdraw(10));
    System.out.println(b1.toString());
    System.out.println(b1.deposit(10));
    System.out.println(b1.toString());

System.out.println();
    
    System.out.println(b2.toString());
    System.out.println(b2.withdraw(10));
    System.out.println(b2.toString());
    System.out.println(b2.deposit(10));
    System.out.println(b2.toString());
System.out.println();
    System.out.println(b3.toString());
    System.out.println(b3.withdraw(10));
    System.out.println(b3.toString());
    System.out.println(b3.deposit(10));
    System.out.println(b3.toString());
   

  }
}
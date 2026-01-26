public class BankAccount{
   private String accountID;
   private String name;
   private double balance;
   
   public BankAccount(){
      accountID = "000000";
      name = "John Doe";
      balance = 0;
   }
   public BankAccount(String id, String n, double bal){
      accountID = id;
      name = n;
      balance = bal;
   }
   public String getID(){
      return accountID;
   }
   public String getName(){
      return name;
   }
   public double getBalance(){
      return balance;
   }
   public void setBalance(double b){
      balance = b;
   }
   public void deposit(double amt){
      balance += amt;
   }
   public void withdraw(double amt){
      balance -= amt;
   }
   public String toString(){
      return "Name: " + name + "\nID: " + accountID + " - " + balance;
   }
}
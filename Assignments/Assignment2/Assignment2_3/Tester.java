public class Tester{
   public static void main(String[] args){
      BankAccount user1 = new BankAccount("KS8264", "Katy Selesky", 3460.00);
      BankAccount user2 = new BankAccount("SM1374", "Steve Marriott", 1290.00);
      BankAccount user3 = new BankAccount("SB5647", "Sophia Bradford", 420.00);
      BankAccount user4 = new BankAccount("JG3946", "Joe Giggs", 158.00);
      BankAccount user5 = new BankAccount("SP2891", "Steve Pastor", 5240.00);
      System.out.println(user1.getID());
      System.out.println(user2.getName());
      System.out.println(user3.getBalance());
      user5.setBalance(-230.17);
      user1.deposit(430.35);
      user2.withdraw(111.01);
      System.out.println(user3.toString());
      BankAccount [] acct = {user1, user2, user3, user4, user5};
      double sum = 0;
      for (BankAccount user: acct){
         sum += user.getBalance();
      }
      System.out.println("The total amount of all balances is: " + sum);
      for (int i = 0; i < acct.length; i++){
         if (acct[i].getBalance() > 3500)
            System.out.println(acct[i]);
      }
      for (int i = 0; i < acct.length; i++){
         if (acct[i].getBalance() < 0)
            acct[i] = null;
      }
      for (BankAccount bc : acct){
         if (bc != null && bc.getName().equals("Joe Giggs"))
            System.out.println(bc);
      }
   }
}
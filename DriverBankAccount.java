public class DriverBankAccount {
  public static void main (String[] args) {
    BankAccount b1 = new BankAccount(1000, "random1");
    BankAccount b2 = new BankAccount(1001, "random2");

    System.out.println("Account b1: " + b1.toString());
    System.out.println(b1.getBalance());
    System.out.println(b1.getAccountID());
    b1.setPassword("random3");
    System.out.println(b1.deposit(55));
    System.out.println(b1.getBalance());
    System.out.println(b1.authenticate("random1"));
    System.out.println();

    System.out.println("Account b2: " + b2.toString());
    System.out.println(b2.getBalance());
    System.out.println(b2.getAccountID());
    b2.setPassword("random4");
    System.out.println(b2.deposit(55));
    System.out.println(b2.getBalance());
    System.out.println(b2.authenticate("random1"));
  }
}

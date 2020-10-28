public class BankAccount {
  public double balance;
  public int accountID;
  public String password;

  public BankAccount (int accountID, String password) {
    this.accountID = accountID;
    this.password = password;
  }

  public String toString() {
    return "#" + accountID + "\t$" + balance;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setPassword(String newPass) {
    password = newPass;
  }
}

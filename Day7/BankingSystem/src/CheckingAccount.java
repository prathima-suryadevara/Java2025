public class CheckingAccount extends Account {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
@Override
public void deposit(double amount) {
setBalance(getBalance() + amount);
System.out.println("Deposited " + amount + " into Checking Account");
}
@Override
public void withdraw(double amount) {
if (amount <= getBalance()) {
    setBalance(getBalance() - amount);
    System.out.println("Withdrew $" + amount + " from Checking Account");
    } else {
    System.out.println("Insufficient funds in Checking Account");
    }
    }
@Override
public String toString() {
        return "CheckingAccount{accountNumber='" +getAccountNumber()+ "', balance=" +getBalance() + "}";
    }
}

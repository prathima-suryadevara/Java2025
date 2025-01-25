import java.util.ArrayList;
import java.util.List;
public class Bank {
    private List<Account> accounts;
    public Bank() {
    accounts = new ArrayList<>();
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public double calculateTotalBalance() {
    double totalBalance = 0;
    for (Account account : accounts) {
    totalBalance += account.getBalance();
    }
        return totalBalance;
    }
    public void displayAccounts() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
    public static void main(String[] args) {
    Account savingsAccount = new SavingsAccount("123456", 2300);
    Account checkingAccount = new CheckingAccount("12 456", 500);
    Bank bank = new Bank();
    bank.addAccount(savingsAccount);
    bank.addAccount(checkingAccount);
    savingsAccount.deposit(200);
    checkingAccount.withdraw(100);
    System.out.println("Total Balance in Bank: " + bank.calculateTotalBalance());
    bank.displayAccounts();
    }
}

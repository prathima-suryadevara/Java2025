public class SavingsAccount extends Account{
    public SavingsAccount(String accountNumber,double balance){
        super(accountNumber,balance);
    }
@Override
public void deposit(double amount){
    setBalance(getBalance()+amount);
    System.out.println("Deposited "+amount+"into savings account");
}
@Override
public void withdraw(double amount){
    if(amount <= getBalance()){
        setBalance(getBalance()-amount);
    System.out.println("Withdraw "+amount+"from savings account");    
    }
    else{
    System.out.println("Insufficient balance in savings account");
    }
}
@Override
public String toString(){
    return "SavingsAccount{accountNumber='"+getAccountNumber()+"',balance="+getBalance()+"}";
}
}

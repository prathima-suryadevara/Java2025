public class Customer{
 private String name;
 private String accountNumber;
 private double balance;
 public Customer(String name,String accountNumber,double balance){
    this.name=name;
    this.accountNumber=accountNumber;
    this.balance=balance;
 }   
 public String getName(){
    return name;
 }
 public void setName(String name){
    this.name=name;
 }
 public String getAccountNumer(){
    return accountNumber;
 }
 public void setAccountNumber(String accountNumber){
    this.accountNumber=accountNumber;
 }
 public double getBalance(){
    return balance;
}
public void setBalance(double balance){
    this.balance=balance;
}
@Override
public String toString(){
return "Customer{name='"+name+"',accountNumber='"+accountNumber+"',balance='"+balance+"}";
}
}


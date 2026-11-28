class Customer{
    private int accountNumber;
    private String holderName;
    private double balance;

    Customer(int accountNumber,String holderName, double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getHolderName(){
        return holderName;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        if(balance>=0){
            this.balance=balance;
        }
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
        }
    }

    public void display(){
        System.out.println("Balance:"+this.balance);
    }

}


public class BankAccount {
    public static void main(String[] args) {

        Customer c=new Customer(78798453, "Ananya", 75000);
        c.deposit(5000);
        c.withdraw(2000);
        c.display();
        
    }

    
}

public class Account {
 

 
    private String accountNumber; // Unique identifier for this account
    private String holderName; // Full name of the account holder
    private double balance; // Current balance in pounds
 
   
    public Account(String accountNumber, String holderName, double balance){

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        if(this.balance >= 0){
            this.balance = balance;
        }else{
            balance = 0;
            this.balance = balance;    
        }
    }
    
    public  String getAccountNumber(){
        return accountNumber;
    }
    
    public  String getholderName(){
        return holderName;
    }
    
    public  double getBalance(){
        return balance;
    }
    
    public void setaccountNumber(String newaccountNumber){
        accountNumber = newaccountNumber;
    }

    public void setHolderName(String newholderName){
        if(newholderName != null){
            holderName = newholderName;
        }else{
            System.out.println("holder name cannot be null");
        }
    }
    
    public void setBalance(double newbalance){
        balance = newbalance;
    }
    
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else{
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
    }
 
 
    public void withdraw(double amount){
        double remaining = balance - amount;
        if(amount > 0 && remaining >= 0){
            balance -= amount;
        }else{
            throw new IllegalArgumentException("Amount withdrawn must be greater than 0 and you can not draw out of your account more than you have");
        }

    }

   
    @Override
    public String toString() {
        return String.format("Account[%s | %s | Balance: £%.2f]",
            accountNumber,
            holderName,
            balance
        );
    }
}
 /* 
    // ── QUICK TEST ──────────────────────────────────────────────────────────
    // A main method lets you test your class without a separate test file.
    // Remove or comment this out once you are satisfied the class works.
    public static void main(String[] args) {
        Account acc = new Account("ACC001", "Jane Smith", 250.00);
        System.out.println(acc); // Should print formatted account info
        acc.deposit(100.00);
        System.out.println(acc.getBalance()); // Expected: 350.0
        acc.withdraw(50.00);
        System.out.println(acc.getBalance()); // Expected: 300.0
    }

 */
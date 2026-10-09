public class SavingsAccount extends Account {
 
    private double interestRate; // e.g. 0.03 represents 3% annual interest
 
    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate){
        super(accountNumber, holderName, balance);
        if(interestRate >= 0.0 && interestRate <= 1.0){
            this.interestRate = interestRate;
        }else{
            throw new IllegalArgumentException("Interest Rate must be between 0.0 and 1.0");
        }

    }
    
    public double getInterestRate(){
        return interestRate;
    }
    
    @Override
    public String toString() {
        String accountInfo = super.toString();
        return accountInfo.substring(0, accountInfo.length() - 1)
        + String.format(" | Rate: %.2f%%]", interestRate);
    }
 
    public void applyInterest(){
        double interest = getBalance() * interestRate; 
        deposit(interest);

    }
 
}
 
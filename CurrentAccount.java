public class CurrentAccount extends Account {
 
    private double overdraftLimit; 
 
    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit){
        super(accountNumber, holderName, balance);
        if(overdraftLimit >= 0){
            this.overdraftLimit = overdraftLimit;
        }else{
            throw new IllegalArgumentException("Overdraft limit must be greater than or equal to 0");
        }
    }
    
    public double getOverdraftLimit(){
        return overdraftLimit;
    }
    
    @Override
    public boolean withdraw(double amount) {
        if(amount <= 0 ){
            throw new IllegalArgumentException("Amount must be above 0");
        }
        double theoryBalance = getBalance() - amount;
        double minbalance = 0 - overdraftLimit;

        if(theoryBalance >= minbalance){
            setBalance(theoryBalance);
            return true;
        }else{
            throw new IllegalArgumentException("amount to be withdrawn exceeds account limits");
        }

    }
    
    @Override 
    public void printDetails(){
        super.printDetails();
        System.out.println("Overdraft Limit: £" + overdraftLimit);
    }

    @Override 
    public String getSummary(){
        String summaryInfo = super.getSummary();
        return summaryInfo.substring(0, summaryInfo.length() - 1) + 
        String.format(" | Overdraft Limit: %.2f]", overdraftLimit);
    }


    @Override 
    public String toString(){
        String accountInfo = super.toString();
        return accountInfo.substring(0, accountInfo.length()-1) 
        + String.format(" | OverDraft Limit: %.2f]", overdraftLimit ); 
    }
 
}
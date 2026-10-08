/**
 * Account.java
 *
 * This class models a bank account. It demonstrates the core Java class
 * concepts:
 * - Fields (instance variables): the data an object holds
 * - Constructor: the special method that builds and initialises the object
 * - Encapsulation: fields are private; access is controlled via getters/setters
 * - toString(): produces a human-readable description of the object
 */
public class Account {
 
    // ── FIELDS ──────────────────────────────────────────────────────────────
    // Fields store the STATE of an object — what it knows about itself.
    // Declaring them 'private' means only this class can directly read or change
    // them.
    // This is the core idea of ENCAPSULATION: hide the data, expose controlled
    // behaviour.
 
    private String accountNumber; // Unique identifier for this account
    private String holderName; // Full name of the account holder
    private double balance; // Current balance in pounds
 
    // ── CONSTRUCTOR ─────────────────────────────────────────────────────────
    // A constructor has the SAME name as the class and no return type.
    // It runs once when you do: Account acc = new Account(...);
    // Its job: initialise the object so it is valid from the very first moment.
    // Parameters that match field names are distinguished using 'this.fieldName'.
 
    // TODO 1: Write the constructor that accepts accountNumber, holderName,
    // balance.
    // Use 'this.' to assign each parameter to the corresponding field.
    // Guard against a negative opening balance — if balance < 0, set it to 0.0.
    public Account(String accountNumber, String holderName, double balance){

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;

    }
    // ── GETTERS ─────────────────────────────────────────────────────────────
    // Getters allow controlled READ access to private fields.
    // Because they are methods, you could add validation or logging inside them
    // later.
    // Naming convention in Java: getFieldName()
    public  String getAccountNumber(){
        return accountNumber;
    }
    
    public  String getholderName(){
        return holderName;
    }
    
    public  double getbalance(){
        return balance;
    }
    // TODO 2: Write getAccountNumber(), getHolderName(), and getBalance().
 
    // ── SETTERS ─────────────────────────────────────────────────────────────
    // Setters allow controlled WRITE access to private fields.
    // Unlike direct field access, a setter can VALIDATE the new value before
    // accepting it.
    // This is where your class enforces its own rules — the outside world cannot
    // bypass them.
 
    public void setaccountNumber(String newaccountNumber){
        accountNumber = newaccountNumber;
    }

    public void setHolderName(String newholderName){
        holderName = newholderName;
    }
    
    public void setbalance(double newbalance){
        balance = newbalance;
    }

    // TODO 3: Write setHolderName(String name) — reject null or empty strings.
 
    // TODO 4: Write deposit(double amount).
    // Business rule: amount must be > 0. Throw an IllegalArgumentException if not.
    // WHY IllegalArgumentException? It is an unchecked (runtime) exception used
    // to signal that a caller has passed an obviously invalid argument.
 
    // TODO 5: Write withdraw(double amount).
    // Business rules: amount must be > 0 AND must not exceed the current balance.
    // For now, throw an IllegalArgumentException if either rule is broken.
    // (In Exercise 5 you will replace this with a proper custom exception.)
 
    // ── toString() ──────────────────────────────────────────────────────────
    // toString() is defined in every Java class by default (inherited from Object),
    // but the default version prints something like Account@1b6d3586 — not useful.
    // Overriding it with @Override gives you a human-readable description.
    // Java calls this automatically whenever you print or concatenate an object.
 
    // TODO 6: Override toString() to return a formatted String like:
    // Account[ACC001 | Jane Smith | Balance: £250.00]
    // Hint: use String.format("%.2f", balance) for two decimal places.
    @Override
    public String toString() {
        // TODO: implement
        return "";
    }
 
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
}
 
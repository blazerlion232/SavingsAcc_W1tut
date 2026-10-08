/**
 * SavingsAccount.java
 *
 * Extends Account to represent a savings account.
 * Key concept: 'extends' creates an IS-A relationship.
 * SavingsAccount inherits ALL fields and methods from Account.
 * It does NOT need to redeclare balance, holderName, accountNumber, etc.
 * It only adds what is UNIQUE to savings accounts: an interest rate.
 */
public class SavingsAccount extends Account {
 
    // ── ADDITIONAL FIELD ────────────────────────────────────────────────────
    // This field is UNIQUE to SavingsAccount — Account does not have one.
    // Inherited fields (balance, holderName, etc.) are NOT redeclared here.
 
    private double interestRate; // e.g. 0.03 represents 3% annual interest
 
    // ── CONSTRUCTOR WITH super() ─────────────────────────────────────────────
    // IMPORTANT: when a child class is constructed, it must call the parent's
    // constructor FIRST using super(). This is because the parent's constructor
    // initialises the inherited fields (accountNumber, holderName, balance).
    // super() MUST be the very first statement in the child constructor.
 
    // TODO 1: Write a constructor that accepts accountNumber, holderName,
    // initialBalance, and interestRate.
    // Call super(accountNumber, holderName, initialBalance) first.
    // Then set this.interestRate.
    // Validate: interestRate must be between 0.0 and 1.0 (inclusive).
 
    // ── GETTER ──────────────────────────────────────────────────────────────
    // TODO 2: Write getInterestRate().
 
    // ── METHOD OVERRIDING ───────────────────────────────────────────────────
    // Sometimes a child class needs to CHANGE how an inherited method works.
    // @Override tells the compiler: 'I am intentionally replacing the parent
    // version'.
    // The compiler then checks you have the correct signature — catching typos.
 
    // TODO 3: Override toString() to extend the parent's version:
    // Return: 'SavingsAccount[ACC001 | Jane Smith | Balance: £250.00 | Rate: 3.0%]'
    // Hint: call super.toString() inside your override to reuse the parent's
    // output,
    // then modify or append to it rather than rewriting everything from scratch.
    @Override
    public String toString() {
        // TODO: implement — use super.toString() as your starting point
        return "";
    }
 
    // ── NEW BEHAVIOUR ───────────────────────────────────────────────────────
    // TODO 4: Write applyInterest().
    // It should calculate interest: balance * interestRate,
    // and deposit that amount using the inherited deposit() method.
    // This demonstrates calling an inherited method from the child class.
 
}
 
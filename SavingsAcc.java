public /**
 * Printable.java
 *
 * An interface declares a CONTRACT — a set of methods that any implementing class
 * MUST provide. The interface itself has no fields and no method bodies.
 *
 * Notice: no 'abstract' keyword needed on methods inside an interface.
 *         They are implicitly abstract and public.
 *
 * Any class that 'implements Printable' is making a promise:
 *   'I guarantee I have a printDetails() method.'
 * The compiler enforces this promise.
 */
public interface Printable {
 
    /**
     * Print a full summary of this object to standard output.
     * Implementors decide exactly what is printed.
     */
    void printDetails();
 
    /**
     * Return a single-line summary suitable for use in a report or log.
     * @return a concise String summary
     */
    String getSummary();
 
}

/**
 * Transferable.java
 *
 * A second interface for accounts that can send and receive money.
 * This demonstrates that a class can implement MULTIPLE interfaces,
 * something Java's single-inheritance rule would not allow with classes.
 */
public interface Transferable {
 
    /**
     * Transfer an amount from this account to a target account.
     *
     * @param target  the account to receive the money
     * @param amount  the amount to transfer (must be positive)
     *
     * Note: the parameter type is 'Account', not SavingsAccount or CurrentAccount.
     * This means you can transfer to ANY type of Account — polymorphism at work.
     *
     */
    void transfer(Account target, double amount);
 
}

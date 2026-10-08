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
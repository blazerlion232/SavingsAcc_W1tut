/**
 * CurrentAccount.java
 *
 * Extends Account to represent a current (chequing) account.
 * Unique feature: an overdraft limit — the account holder can go
 * a specified amount below zero. The withdraw() method must be
 * overridden to allow this.
 */
public class CurrentAccount extends Account {
 
    private double overdraftLimit; // Maximum amount the balance can go below 0
 
    // TODO 1: Write the constructor. Call super() first.
    // Validate: overdraftLimit must be >= 0.
 
    // TODO 2: Write getOverdraftLimit().
 
    // ── OVERRIDING WITH CHANGED BEHAVIOUR ───────────────────────────────────
    // The parent's withdraw() rejects any amount that would take balance below 0.
    // For a current account, going below 0 is allowed — up to the overdraft limit.
    // We override withdraw() to apply the current-account rule instead.
 
    // TODO 3: Override withdraw(double amount).
    // New rule: the withdrawal is valid if: balance - amount >= -overdraftLimit
    // If invalid, throw an IllegalArgumentException with a helpful message.
    // If valid, reduce the balance.
    // WHY override instead of creating a new method?
    // Because external code refers to this as an Account. When it calls
    // withdraw() on any Account, it should automatically get the right behaviour.
    @Override
    public void withdraw(double amount) {
        // TODO: implement overdraft-aware withdrawal
    }
 
    // TODO 4: Override toString() to include the overdraft limit.
 
}
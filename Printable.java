/**
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
 
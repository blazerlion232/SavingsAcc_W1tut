public interface Printable {
 
    void printDetails();
 
    /**
     * Return a single-line summary suitable for use in a report or log.
     * @return a concise String summary
     */
    String getSummary();
 
}
 
public class testClass {
    
    public static void main(String args[]){
        
        // test accounts
        Account current = new CurrentAccount("H123", "Jane Smith", 500.00, 500.00 );
        Account savings = new SavingsAccount("H124", "Bob Dylan", 1200.00, 0.05);
        
        // printables test

        System.out.println("--------------------------------------------");

        current.printDetails();
        savings.printDetails();
        
        System.out.println("--------------------------------------------");

        System.out.println(current.getSummary());
        System.out.println(savings.getSummary());
        
        System.out.println("--------------------------------------------");

        // transfer test

       System.out.println("Before transfer");
       System.out.println("Current: " + current.getBalance());
       System.out.println("Savings: " + savings.getBalance());

        System.out.println("--------------------------------------------");

        current.transfer(savings, 100.00);

       System.out.println("After transfer");
       System.out.println("Current: " + current.getBalance());
       System.out.println("Savings: " + savings.getBalance());
    
        // test interest system
        // test going into overdraft
        // 



    }
}

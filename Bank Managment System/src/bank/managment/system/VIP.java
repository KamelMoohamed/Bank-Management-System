package bank.managment.system;

/**
 *
 * @author BONUS BANK TEAM...
 */
public class VIP extends bank_account {
    
    // Constructors 
    public VIP(String fName, String lName, String userName, long password, String eMail, long creditCardNum, boolean VIP)
    {
        super(fName, lName, userName, password, eMail, creditCardNum, VIP);
    }
    public VIP (String fName, String lName, String eMail, long creditCardNum, double balance) {
        super(fName, lName, eMail, creditCardNum, balance);
    }


    public VIP(double balance) {
        super(balance);
    }
    public VIP (double creditBalance, double balance) {
        super(creditBalance, balance);
    }

   
    
    // ---------------------- VIP CREDIT FUNCTION DESCRIPTION ------------------------------------
    // The CREDIT Function of the VIP Account is different from the personal Account in two things
    // 1 - The Limit for the CREDIT is 10,000 rather than 5000
    // 2 - The Payment Time is 3 Months rather than 2
    // -------------------------------------------------------------------------------------------
    
    
    @Override
     public boolean credit(double amount){
        
        if(amount +creditBalance <= 10000){
            creditBalance += amount;
            creditTime=d.plusMonths(3);
            return true;
        }
        else 
            return false;
    
        
    }
}

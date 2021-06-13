package bank.managment.system;

import java.time.LocalDate;


public class bank_account {
    
    // User Data
    private String fName;    
    private String lName;
    private String eMail;
    long creditCardNum;
    
    // Login Data
    private String userName;
    private long password;
    
    // User Financial Data
    double balance ;
    
    // Balance 2 is the Balance of user 2 for the Transfer Function
    double balance2;
    double creditBalance ;   
    private boolean status = false;
    
    // Credit Time Variables
    LocalDate d = LocalDate.now();
    LocalDate creditTime=d;

    boolean VIP = false;

    // User Data Setters    
    public void setfName(String fName){
        this.fName = fName;
    }
    
    public void setlName(String lName){
        this.lName = lName;
    }
    
    public void seteMail(String eMail){
        this.eMail = eMail;
    }

    public void setcreditCardNum(long creditCard){
        creditCardNum = creditCard;
    }
    
    // Login Setters
    
    public void setuserName(String name) {
        userName = name;
    }
  
    public void setPassword (long password){
        this.password = password;
    }
    
    // Financial Data Setters
    public void setBalance(double balance){
          this.balance = balance;
    }
        public void setcreditBalance(double creditBalance){
          this.creditBalance = creditBalance;
    }
    
    

    //Getters       
    public String getfullName (){
        return (fName + lName);
    }
    
    public String getuserName (){
        return userName;
    }
    
    public String geteMail (){
        return eMail;
    }
    
    public long getcreditCardNum (){
        return creditCardNum;
    }

    public double getBalance ()
    {
        return balance;
    }
    
    public double getCreditBalance()
    {
        return creditBalance;
    }
    
    
    // Create Account Constructor
    public bank_account(String fName, String lName, String userName, long password, String eMail, long creditCardNum, boolean VIP) {
        this.fName = fName;
        this.lName = lName;
        this.userName = userName;
        this.password = password;
        this.eMail = eMail;
        this.creditCardNum = creditCardNum;
        this.balance = 0;
        this.VIP = VIP;
    }
    
    // User Data Constructor
    public bank_account(String fName, String lName, String eMail, long creditCardNum, double balance) {
        this.fName = fName;
        this.lName = lName;
        this.eMail = eMail;
        this.creditCardNum = creditCardNum;
        this.balance = balance;
    }
    
    // Deposit and withdraw Constructor
    public bank_account(double balance) {
        this.balance = balance;
    }
    
    // Credit Constructor
    public bank_account(double creditBalance, double balance) {
        this.creditBalance = creditBalance;
        this.balance = balance;
    }
    
    
    // ---------------------- DEPOSIT FUNCTION DESCRIPTION ---------------------------
    // The WITHDRAW Function is a Function of the Type BOOL that apply the Deposit
    // CHECKING if the user need ro pay for a previous credit or NOT
    // AND return The Balance...
    // -------------------------------------------------------------------------------
    public double deposit(double amount)      
    {   
        
        
        // Applying the Deposit
        balance += amount;        
        return balance;
    }
    
    // ---------------------- WITHDRAW FUNCTION DESCRIPTION ---------------------------
    // The WITHDRAW Function is a Function of the Type BOOL that apply the withdraw
    // AND Returns True if the user already have a enough money to withdraw it
    // return False if the user BALANCE Dosn't enough to with draw
    // --------------------------------------------------------------------------------
    
    public boolean withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
            return true;
        }
        else{
            return false;
        }
        
    }
    
    // ---------------------- CREDIT FUNCTION DESCRIPTION ------------------------------
    // The CREDIT Function is a Function of the Type int that apply the credit
    // AND Returns 3 Value (2 if the user already have a money in his account)
    // (1 if the user credit more that the limit) (0 if the process applied successfully
    // ---------------------------------------------------------------------------------
    public boolean credit(double amount){
        
        if(amount +creditBalance <= 5000){
            creditBalance += amount;
            creditTime=d.plusMonths(2);
            return true;
        }
        else 
            return false;
    
        
    }
    
    
    // ---------------------- TRANSFER FUNCTION DESCRIPTION ---------------------------------
    // The TRANSFER Function is a Function of the Type Boolean that apply the Transfer
    // AND Returns True if the user already have a enough money, and the amount more that ZERO
    // return False if one of the 2 condition dosn't applied...
    // ---------------------------------------------------------------------------------------
    public boolean transferamount (double amount,double balance2)
        {
        if (amount < this.balance && amount > 0){
            balance  -= amount;
            this.balance2=balance2;
            this.balance2 +=amount;
            return true;
            }
        else{
            return false;
            }
        }

 
}


package bank.managment.system;

/**
 *
 * @author BONUS BANK TEAM...
*/

import java.awt.HeadlessException;
import java.sql.*;


public class dataBase {
    public String fName;    
    public String lName;
    public String eMail;
    public long creditCardNum;
   
    
    // Login Data
    public String userName;
    public String password;
    
    // User Financial Data
    public double balance ;       
    public double creditBalance ;   
    public boolean status = false;
    
    // Credit Time Variables
    public String timeLimited;
    public boolean VIP = false;
    int found =0;
    //connection 
   
    Connection con;
    Statement stmt;
    ResultSet rs;
    Statement query=null;
    PreparedStatement pst = null;
    // Constructor
    public dataBase(){
        try{
            String host="jdbc:derby://localhost:1527/DATABASE";
            
            con=DriverManager.getConnection(host);
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String SQL="SELECT * FROM CUSTOMERDATA";
            rs=stmt.executeQuery(SQL);
          
            
        
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
         catch (NumberFormatException e) {
              System.out.print(e.getMessage());

            }
        
    }
    
    
    // setting all the data
    public void setData(String userName,String Fname, String Lname, String Email,String pass,boolean VIP,long ccard){
        // Setting all the data for the create account
       
        try {
                
                String query = "INSERT INTO CUSTOMERDATA VALUES(?,?,?,?,?,?,?,?,?,?,?)";

                pst = con.prepareStatement(query);
                pst.setString(2, Fname);
                pst.setString(3,Lname);
                pst.setString(4,Email);
                pst.setString(1,userName);
                pst.setString(11,pass);
                pst.setBoolean(5, VIP);
                pst.setDouble(8, ccard);
                pst.setDouble(7, 0);
                pst.setString(6, "");
                pst.setBoolean(9, false);
                pst.setDouble(10,0);
                
                
                this.fName=Fname;
                this.lName=Lname;
                this.eMail=Email;
                this.VIP=VIP;
                this.creditCardNum=ccard;
                this.userName=userName;
                this.password=pass;
                this.status=false;
                this.creditBalance=0;
                this.balance=0;
                this.timeLimited="";
                
                
                pst.executeUpdate();
               

                try {

                    con.close();

                } catch (SQLException e) {
                }
            } catch (HeadlessException | SQLException e) {
                 System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        
    }
    
    // Setting the balance only
    public void setBalance(String userName,double Balance){
 try {
                int index = rs.getRow();
                if (index != 0) {
                    
                    rs.updateString("fname", fName);
                    rs.updateString("lname", lName);
                    rs.updateString("username", userName);
                    rs.updateString("passw", password);
                    rs.updateDouble("cbalance", creditBalance);
                    rs.updateString("EMAIL", eMail);
                    rs.updateLong("ccard", creditCardNum);
                    rs.updateBoolean("status", status);
                    rs.updateString("time", timeLimited);
                    rs.updateBoolean("vip", VIP);
                    rs.updateDouble("BALANCE", Balance);

                    rs.updateRow();
                    
                   this.balance= Balance;
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());

            } catch (NumberFormatException e) {
              System.out.print(e.getMessage());

            }
           
        
    }
     public void setCBalance(String userName,double cBalance){
 try {
                int index = rs.getRow();
                if (index != 0) {
                    
                    rs.updateString("fname", fName);
                    rs.updateString("lname", lName);
                    rs.updateString("username", userName);
                    rs.updateString("passw", password);
                    rs.updateDouble("cbalance", cBalance);
                    rs.updateString("EMAIL", eMail);
                    rs.updateLong("ccard", creditCardNum);
                    rs.updateBoolean("status", status);
                    rs.updateString("time", timeLimited);
                    rs.updateBoolean("vip", VIP);
                    rs.updateDouble("BALANCE", balance);

                    rs.updateRow();
                    
                   this.creditBalance= cBalance;
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());

            } catch (NumberFormatException e) {
              System.out.print(e.getMessage());

            }
           
        
    }
    
    public void getAllData(String userName){
    // We will setting all the class variables and acess in the GUI class by . opritor
    try{
        
             while(rs.next())
        {
            if(userName.equals(rs.getString("username"))) 
            { 
                found=1;
                 try{
                                            
             
            this.userName=rs.getString("username");
            password=rs.getString("passw");
            balance=rs.getDouble("balance");
            status=rs.getBoolean("status");
            fName=rs.getString("fname");
            lName=rs.getString("lname");
            eMail=rs.getString("email");
            VIP=rs.getBoolean("vip");
            timeLimited =rs.getString("time");
            creditCardNum=(long)rs.getDouble("ccard");
            creditBalance=rs.getDouble("cbalance");
            
            }
        
        
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
           
            break;
            }
           
        }
         
       }
      catch(SQLException e) {
            System.out.println(e.getMessage());
        }
           
        
    }
    public void setDate(String userName,String time){
 try {
                int index = rs.getRow();
                if (index != 0) {
                    
                    rs.updateString("fname", fName);
                    rs.updateString("lname", lName);
                    rs.updateString("username", userName);
                    rs.updateString("passw", password);
                    rs.updateDouble("cbalance", creditBalance);
                    rs.updateString("EMAIL", eMail);
                    rs.updateLong("ccard", creditCardNum);
                    rs.updateBoolean("status", status);
                    rs.updateString("time", time);
                    rs.updateBoolean("vip", VIP);
                    rs.updateDouble("BALANCE", balance);

                    rs.updateRow();
                    
                   this.timeLimited= time;
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());

            } catch (NumberFormatException e) {
              System.out.print(e.getMessage());

            }  
    }
    public void setStatus(String userName,boolean status){
 try {
                int index = rs.getRow();
                if (index != 0) {
                    
                    rs.updateString("fname", fName);
                    rs.updateString("lname", lName);
                    rs.updateString("username", userName);
                    rs.updateString("passw", password);
                    rs.updateDouble("cbalance", creditBalance);
                    rs.updateString("EMAIL", eMail);
                    rs.updateLong("ccard", creditCardNum);
                    rs.updateBoolean("status", status);
                    rs.updateString("time", timeLimited);
                    rs.updateBoolean("vip", VIP);
                    rs.updateDouble("BALANCE", balance);

                    rs.updateRow();
                    
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());

            } catch (NumberFormatException e) {
              System.out.print(e.getMessage());

            }  
    }
     public void setVIP(String userName,boolean VIP){
 try {
                int index = rs.getRow();
                if (index != 0) {
                    
                    rs.updateString("fname", fName);
                    rs.updateString("lname", lName);
                    rs.updateString("username", userName);
                    rs.updateString("passw", password);
                    rs.updateDouble("cbalance", creditBalance);
                    rs.updateString("EMAIL", eMail);
                    rs.updateLong("ccard", creditCardNum);
                    rs.updateBoolean("status", status);
                    rs.updateString("time", timeLimited);
                    rs.updateBoolean("vip", VIP);
                    rs.updateDouble("BALANCE", balance);

                    rs.updateRow();
                    
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());

            } catch (NumberFormatException e) {
              System.out.print(e.getMessage());

            }  
    }
    
    public void closeConnection(){
         try {
                    
                    rs.close();
                    con.close();

                } catch (SQLException e) {

                }
    }
     
}


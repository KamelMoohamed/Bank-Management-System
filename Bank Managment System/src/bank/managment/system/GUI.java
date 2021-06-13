package bank.managment.system;

import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 * @author BONUS BANK Team...
 */
public class GUI {
// Intializinh the empty connstructor  
    public GUI(){
    
    }
    
// Intializing the 4 Main Frams(Pages)
    public static JFrame mainPanalFram,loginPanal ,creatingPanal,welcomePanal,closedFrame;
    public static login log;
    public static CreatAccount panel3;
    
    public void GUIintro() throws InterruptedException {
        // Setting the Size and Location of tha Welcome Panel
        
        welcomePanal = new JFrame();
        welcomePanal.setSize(788,441);
        welcomePanal.setLocation(500,300);
        
        // Creating the Welcomme Panel and add it to the Fram and Set it visible
        WelcomPanel welcome =new WelcomPanel();
        welcomePanal.add(welcome);
        welcomePanal.setVisible(true);
        
        // Keep tha Welcome panel for 4 second before CLOSING it 
        Thread.sleep(4000);
        GUI.welcomePanal.dispatchEvent(new WindowEvent(GUI.welcomePanal, WindowEvent.WINDOW_CLOSING));

    
    }

    public void GUIsetup() throws InterruptedException {
        
        // Intializing the other 3 panels and set the SIZE and LOCATION for them all..
        mainPanalFram= new JFrame();
        mainPanalFram.setSize(1112, 722);
        mainPanalFram.setLocation(500, 300);
        mainPanalFram.setTitle("Bonus Bank");
        
        loginPanal = new JFrame();
        loginPanal.setSize(523,574);
        loginPanal.setLocation(500, 300);
        loginPanal.setTitle("LogIn");

        
        creatingPanal= new JFrame();
        creatingPanal.setLocation(500, 300);
        creatingPanal.setSize(537,585);
        mainPanalFram.setTitle("Create Account");

        
        // Creating the SIGNUP and LOGIN Panels and ADD the to the Frams
        panel3=new CreatAccount();
        creatingPanal.add(panel3);
        
        log = new login();
        loginPanal.add(log);
        
        // CLOSING the the mainPanel and Opening the Login Page
        mainPanalFram.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);  
        GUI.loginPanal.setVisible(true);
        
    }   
    public static void GUIClosed()throws InterruptedException{
        closedFrame = new JFrame();
        closedFrame.setSize(788,441);
        closedFrame.setLocation(500,300);
        
        // Creating the Welcomme Panel and add it to the Fram and Set it visible
        closingAccount closing =new closingAccount();
        closedFrame.add(closing);
        closedFrame.setVisible(true);
        
        // Keep tha Welcome panel for 4 second before CLOSING it 
        Thread.sleep(4000);
        GUI.closedFrame.dispatchEvent(new WindowEvent(GUI.closedFrame, WindowEvent.WINDOW_CLOSING));
        GUI.loginPanal.setVisible(true);
    }
}
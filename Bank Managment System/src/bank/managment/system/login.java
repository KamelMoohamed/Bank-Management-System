package bank.managment.system;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import javax.swing.UIManager;

public class login extends javax.swing.JPanel {
    /**
     * Creates new form login
     */
    dataBase db;
    public login() {
        initComponents();
        warningL.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passField = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        warningL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(57, 62, 70));

        jButton1.setBackground(new java.awt.Color(57, 62, 70));
        jButton1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LogIn");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 171, 182), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UserName:");

        userField.setBackground(new java.awt.Color(57, 62, 70));
        userField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        userField.setForeground(new java.awt.Color(255, 255, 255));
        userField.setToolTipText("user name");
        userField.setActionCommand("<Not Set>");
        userField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 2, true));
        userField.setCaretColor(new java.awt.Color(255, 255, 255));

        passField.setBackground(new java.awt.Color(57, 62, 71));
        passField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        passField.setForeground(new java.awt.Color(255, 255, 255));
        passField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 171, 182), 2, true));
        passField.setCaretColor(new java.awt.Color(255, 255, 255));

        jButton3.setBackground(new java.awt.Color(57, 62, 70));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 173, 181));
        jButton3.setText("Create account");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        warningL.setForeground(new java.awt.Color(255, 51, 51));
        warningL.setText("user name or password is wrong ,please try again");

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login to your Bonus Bank Account");

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PassWord:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(170, 216, 211));
        jLabel2.setText("By joining, you are agreeing to our Legal Terms and Privacy Policy");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(170, 216, 211));
        jLabel6.setText("If you don't have an Account,");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/managment/system/Login Page logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(warningL))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(passField)
                            .addComponent(userField)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warningL)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Reading Inputs
        Username=userField.getText();
        PassWord=String.valueOf(passField.getPassword());
        
        // Connecting the Data Base
        db = new dataBase();
        db.getAllData(Username);
        if(db.found==1){
        // Checking the username and password validation
        if(db.userName.equals(Username) && db.password.equals(PassWord)){
         
            correctLogin();
            
        }
        
        else {
            loginError(); 
            db.closeConnection();
        }}else
        {
          loginError(); 
          db.closeConnection();  
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       GUI.creatingPanal.setVisible(true);
       GUI.loginPanal.dispatchEvent(new WindowEvent(GUI.loginPanal, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jButton3ActionPerformed

    private  void loginError(){
        warningL.setVisible(true);
        
    }
    private void correctLogin(){
        GUI.mainPanalFram.setVisible(true);
        GUI.loginPanal.dispatchEvent(new WindowEvent(GUI.loginPanal, WindowEvent.WINDOW_CLOSING));
        db.closeConnection();
        String user=userField.getText();
        mainPanel panel2 = new mainPanel(user);
        GUI.mainPanalFram.add(panel2);
        GUI.mainPanalFram.setSize(1112, 721);
        GUI.mainPanalFram.setSize(1112, 722);
        
    }
    public void RemoveData(){
        userField.setText("");
        passField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private static javax.swing.JPasswordField passField;
    private static javax.swing.JTextField userField;
    private static javax.swing.JLabel warningL;
    // End of variables declaration//GEN-END:variables
    private String Username;
    private String PassWord;
    public String getUser(){
    return Username;
    
    }
    public String getPass(){
    return PassWord;
    }

}

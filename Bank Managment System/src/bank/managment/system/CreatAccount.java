package bank.managment.system;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;


/**
 * @author BONUS BANK TEAM...
 */
public class CreatAccount extends javax.swing.JPanel {
    public String correctUserName;

    /**
     * Creates new form CreatAccount
     */
    public CreatAccount() {
        initComponents();
        WarningLabel.setVisible(false);
    }
    
    /**
    * This Part consisting of Functions that's related with every button
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fField = new javax.swing.JTextField();
        lField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        userField = new javax.swing.JTextField();
        passField = new javax.swing.JPasswordField();
        CCField = new javax.swing.JTextField();
        CreateB = new javax.swing.JButton();
        login = new javax.swing.JButton();
        WarningLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(57, 62, 70));

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First name:");

        fField.setBackground(new java.awt.Color(57, 62, 70));
        fField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fField.setForeground(new java.awt.Color(255, 255, 255));
        fField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 171, 182), 2, true));
        fField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fFieldActionPerformed(evt);
            }
        });
        fField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fFieldKeyTyped(evt);
            }
        });

        lField.setBackground(new java.awt.Color(57, 62, 70));
        lField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lField.setForeground(new java.awt.Color(255, 255, 255));
        lField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 171, 182), 2, true));
        lField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lFieldActionPerformed(evt);
            }
        });
        lField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lFieldKeyTyped(evt);
            }
        });

        emailField.setBackground(new java.awt.Color(57, 62, 70));
        emailField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        emailField.setForeground(new java.awt.Color(255, 255, 255));
        emailField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 171, 182), 2, true));

        userField.setBackground(new java.awt.Color(57, 62, 70));
        userField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        userField.setForeground(new java.awt.Color(255, 255, 255));
        userField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 171, 182), 2, true));
        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });
        userField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userFieldKeyTyped(evt);
            }
        });

        passField.setBackground(new java.awt.Color(57, 62, 70));
        passField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        passField.setForeground(new java.awt.Color(255, 255, 255));
        passField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 171, 182), 2, true));
        passField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passFieldKeyTyped(evt);
            }
        });

        CCField.setBackground(new java.awt.Color(57, 62, 70));
        CCField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CCField.setForeground(new java.awt.Color(255, 255, 255));
        CCField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 171, 182), 2, true));
        CCField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CCFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CCFieldKeyTyped(evt);
            }
        });

        CreateB.setBackground(new java.awt.Color(57, 62, 70));
        CreateB.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        CreateB.setForeground(new java.awt.Color(255, 255, 255));
        CreateB.setText("Create");
        CreateB.setToolTipText("");
        CreateB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 171, 182), 2, true));
        CreateB.setEnabled(false);
        CreateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(57, 62, 70));
        login.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        login.setForeground(new java.awt.Color(0, 171, 182));
        login.setText("login");
        login.setBorder(null);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        WarningLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WarningLabel.setForeground(new java.awt.Color(255, 51, 51));
        WarningLabel.setText("Used UserName");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/managment/system/Login Page logo.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Become a Bonus Bank member:");

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PassWord");

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Last name:");

        jLabel11.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("UserName");

        jLabel12.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email");

        jLabel13.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Credit Card");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(170, 216, 211));
        jLabel2.setText("Already have an account,");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CCField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(userField)
                                        .addComponent(fField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel11))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lField)
                                        .addComponent(jLabel10)
                                        .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)))
                                .addComponent(emailField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(37, 37, 37)
                                .addComponent(WarningLabel))
                            .addComponent(CreateB, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(WarningLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lField)
                    .addComponent(fField, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(userField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CCField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(login))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreateB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBActionPerformed
       
       // Getting all the DATA IN
       
       fname=fField.getText();
       lname=lField.getText();
       userName=userField.getText();
       email=emailField.getText();
       password=String.valueOf(passField.getPassword());
       
       // Connecting to the dataBase
       dataBase db1=new dataBase();
       db1.getAllData(userName);
       
       // Checking if the user name is already EXISTED or NOT
       // Found Return 0 if the user name is uniqe and 1 if not.
       
       // -------------------------------------------------------
       // IF THE USER NAME IS UNIQUE
       // -------------------------------------------------------
       
       if(db1.found==0){
       try{
           CCard=Long.parseLong(CCField.getText());
           db1.closeConnection();
           GUI.mainPanalFram.setVisible(true);
           GUI.creatingPanal.dispatchEvent(new WindowEvent(GUI.loginPanal, WindowEvent.WINDOW_CLOSING));
           
           
           // Setting all the data in the dataBase
           dataBase db = new dataBase();
           db.setData(userName, fname, lname, email, password, false, CCard);
           db.closeConnection();
           
           
           GUI.mainPanalFram.setVisible(true);
           correctUserName = userName;
           
           mainPanel panel = new mainPanel(correctUserName);
           GUI.mainPanalFram.add(panel);
           GUI.mainPanalFram.setSize(1112, 721);
           GUI.mainPanalFram.setSize(1112, 722);
       }
       catch(Exception e){
           CCError();
       }
       
       // --------------------------------------------------
       // If the user name Existed before
       // --------------------------------------------------
       
       }
       else{
           db1.closeConnection();
           WarningLabel.setText("Used UserName!");
           WarningLabel.setVisible(true);
       }
    }//GEN-LAST:event_CreateBActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        GUI.loginPanal.setVisible(true);
        GUI.creatingPanal.dispatchEvent(new WindowEvent(GUI.loginPanal, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_loginActionPerformed

    private void fFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fFieldActionPerformed

    }//GEN-LAST:event_fFieldActionPerformed

    private void fFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fFieldKeyTyped
    }//GEN-LAST:event_fFieldKeyTyped

    private void fFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fFieldKeyReleased
        // checking if the field empty,by making a boolean variable for it
        // that check this point...
        
        if(fField.getText().length() == 0 )
            fFilled=false;
        else {
            fFilled=true;
        }
    }//GEN-LAST:event_fFieldKeyReleased

    private void lFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lFieldActionPerformed

    }//GEN-LAST:event_lFieldActionPerformed

    private void lFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lFieldKeyTyped
    }//GEN-LAST:event_lFieldKeyTyped

    private void userFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userFieldKeyTyped
    }//GEN-LAST:event_userFieldKeyTyped

    private void passFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFieldKeyTyped
    }//GEN-LAST:event_passFieldKeyTyped

    private void CCFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CCFieldKeyTyped
        
          
    }//GEN-LAST:event_CCFieldKeyTyped

    private void lFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lFieldKeyReleased
            
            //checking if the field empty,by making many boolean variable 
            // that check this point
            
            if(lField.getText().length() == 0 )
                lFilled=false;

            else
            {
                lFilled=true;
            }
    }//GEN-LAST:event_lFieldKeyReleased

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
    }//GEN-LAST:event_userFieldActionPerformed

    private void userFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userFieldKeyReleased
            // checking if the field empty,by making many boolean variable 
            // that check this point
            
            if(userField.getText().length() == 0 )
                userFilled=false;
            else {
                userFilled=true;
            }      
    }//GEN-LAST:event_userFieldKeyReleased

    private void passFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFieldKeyReleased
            // checking if the field empty,by making many boolean variable 
            // that check this point    
            
            if(String.valueOf(passField.getPassword()).length() == 0 )
                passFilled=false;
            else{
                passFilled=true;
            }        
    }//GEN-LAST:event_passFieldKeyReleased

    private void CCFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CCFieldKeyReleased
        // HERE we check the Last BUTTON filled OR NOT...
        
        if(CCField.getText().length() == 0 )
                CCFilled=false;
        else{
                CCFilled=true;
        }
        
        // CHECKING if the ALL other FIELDs is already Filled OR NOT...
        if(fFilled &&lFilled&&userFilled&&passFilled&&CCFilled){
            CreateB.setEnabled(true);
        }
        else{
            CreateB.setEnabled(false); 
        }
       
    }//GEN-LAST:event_CCFieldKeyReleased
    
    private void userError(){
        
    // Method that's responsible for CREATING an Error if the USER NAME isn't UNIQUE
        userField.setBackground(Color.red);
        WarningLabel.setVisible(true);
        WarningLabel.setText("Used User Name!");
    }
    
    private void CCError(){
        
    // Method that's responsible for CREATING an Error if the user input non Number in the Credit Card Field
    
        CCField.setBackground(Color.red);
        WarningLabel.setVisible(true);
        WarningLabel.setText("WRONG, Please enter a valid Credit card number!");
    }
    public void RemoveData(){
    fField.setText("");
    lField.setText("");
    userField.setText("");
    passField.setText("");
    emailField.setText("");
    CCField.setText("");
    CreateB.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCField;
    private javax.swing.JButton CreateB;
    private javax.swing.JLabel WarningLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField fField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lField;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField passField;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
    private String fname,lname,userName;
    private String email,password;
    private long CCard;
    
     
    //  Variables that Check if Fields is all field or NOT
    //  We Assumed that you must enter all values rather than E-mail
    //  So we decleared a bool Var for every field rather than the E-mail Field
            
    boolean fFilled,lFilled,userFilled,passFilled,CCFilled;
    
    // ------
    private int counter=0;
    
    private boolean IsVip=false;
    

  
}

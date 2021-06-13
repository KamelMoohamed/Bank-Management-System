package bank.managment.system;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * @author BONUS BANK TEAM...
 */
public class CreditPanel extends javax.swing.JPanel {
    public String userName;
    private dataBase db;
    
    /**
     * Creates new form DepositPanel
     */
    public CreditPanel(String userName) {
        this.userName = userName;
        
        initComponents();
        
        // Connecting to data base to READ the DATA
        db = new dataBase();
        db.getAllData(this.userName);
        db.closeConnection();
        
        WithDrawB.setEnabled(false);
        AfterWithDraw.setText("");
        
        // Balance before credit
        currentBalanceValue.setText(Double.toString(db.creditBalance));
        AfterWithDraw.setText(Double.toString(db.creditBalance));
        dateLabel.setText("");
    }

    // METHOD That Intializing the FORM of the PANEL...
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L1 = new javax.swing.JLabel();
        currentBalanceValue = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        WithField = new javax.swing.JTextField();
        L3 = new javax.swing.JLabel();
        AfterWithDraw = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        debositMassege = new javax.swing.JLabel();
        WithDrawB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 238, 238));

        L1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        L1.setForeground(new java.awt.Color(57, 62, 70));
        L1.setText("Current Credit Balance:");

        currentBalanceValue.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        currentBalanceValue.setText("0.0");

        L2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        L2.setForeground(new java.awt.Color(57, 62, 70));
        L2.setText("Last day of payment:");

        WithField.setBackground(new java.awt.Color(57, 62, 70));
        WithField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        WithField.setForeground(new java.awt.Color(255, 255, 255));
        WithField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 171, 182), 2));
        WithField.setCaretColor(new java.awt.Color(255, 255, 255));
        WithField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        WithField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithFieldActionPerformed(evt);
            }
        });
        WithField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                WithFieldKeyReleased(evt);
            }
        });

        L3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        L3.setForeground(new java.awt.Color(57, 62, 70));
        L3.setText("Balance After Credit:");

        AfterWithDraw.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        AfterWithDraw.setText("0.0");

        error.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));

        debositMassege.setBackground(new java.awt.Color(238, 238, 238));
        debositMassege.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        WithDrawB.setBackground(new java.awt.Color(57, 62, 70));
        WithDrawB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        WithDrawB.setForeground(new java.awt.Color(255, 255, 255));
        WithDrawB.setText("WithDraw");
        WithDrawB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 171, 182), 5, true));
        WithDrawB.setBorderPainted(false);
        WithDrawB.setFocusPainted(false);
        WithDrawB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithDrawBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 62, 70));
        jLabel1.setText("Credit Process");

        dateLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        dateLabel.setText("jLabel2");

        L4.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        L4.setForeground(new java.awt.Color(57, 62, 70));
        L4.setText("Credit Amount:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(WithDrawB, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(debositMassege, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(L3)
                            .addGap(27, 27, 27)
                            .addComponent(AfterWithDraw))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(L1)
                            .addGap(50, 50, 50)
                            .addComponent(currentBalanceValue))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(WithField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(L4))
                            .addGap(93, 93, 93)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(L2)
                                .addComponent(dateLabel))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(247, 247, 247)))
                .addContainerGap(267, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentBalanceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WithField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AfterWithDraw))
                        .addGap(44, 44, 44)
                        .addComponent(WithDrawB, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(debositMassege, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(192, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void WithFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithFieldActionPerformed

    }//GEN-LAST:event_WithFieldActionPerformed

    private void WithDrawBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithDrawBActionPerformed
        
    // Calling the DATA BASE...
        dataBase db1 = new dataBase();
        db1.getAllData(userName);
        
    // GETTING the Balance and the Credit  Balance From the Data Base
        double balance =db1.balance;
        double creditBalance=db1.creditBalance;
    
    // GETTING THE Input in the Amount Text Field
        double dep=Double.parseDouble(WithField.getText());
        
    // CHECKING if the ACCOUNT is VIP or NOT...    
        if(!db1.VIP){
            // Personal ACCOUNT
            // CREATING Object from the Bank Account Class to use the class Functions
            
            bank_account user=new bank_account(creditBalance,balance);
            
            // The CREDIT Function in the bank Account is an int function that make the credit condition
            // AND Returns 3 values accourding to their action, BE SURE that you check the function Description
            
        
            if (user.credit(dep)){
                currentBalanceValue.setText(Double.toString(db1.creditBalance));
                AfterWithDraw.setText(Double.toString(user.creditBalance));
                Double balanceAfter = user.creditBalance;
                debositMassege.setText("The process completed successfully.");
                WithDrawB.setEnabled(false);
                if(db1.creditBalance>0){
                dateLabel.setText(db1.timeLimited);

                }else{
                dateLabel.setText(user.creditTime.format(DateTimeFormatter.ISO_LOCAL_DATE).toString());
                db1.setDate(userName, user.creditTime.format(DateTimeFormatter.ISO_LOCAL_DATE).toString());
                }
                // SETTING THE DATE of payment
                db1.setStatus(userName, true);
                db1.setCBalance(userName, balanceAfter);
                db1.closeConnection();
                currentBalanceValue.setText(Double.toString(balanceAfter));
                WithField.setText("");
            } 
            else {
                error.setText("Invalid, You have exceeded the credit limit.");
                db1.closeConnection();
            }
            
        
        }
        else{
            // If the ACCOUNT is VIP
            
            VIP user=new VIP(creditBalance,balance);
            if (user.credit(dep)){
            // If the Process successfully Completed
                currentBalanceValue.setText(Double.toString(db1.creditBalance));
                AfterWithDraw.setText(Double.toString(user.creditBalance));
                Double balanceAfter = user.creditBalance;
                debositMassege.setText("The process completed successfully.");
                WithDrawB.setEnabled(false);
                if(db1.creditBalance>0){
                dateLabel.setText(db1.timeLimited);

                }else{
                dateLabel.setText(user.creditTime.format(DateTimeFormatter.ISO_LOCAL_DATE).toString());
                db1.setDate(userName, user.creditTime.format(DateTimeFormatter.ISO_LOCAL_DATE).toString());
                }
            // Setting the Date of Payment
                
                db1.setCBalance(userName, balanceAfter);
                db1.closeConnection();
                currentBalanceValue.setText(Double.toString(balanceAfter));
                WithField.setText("");
                   
            } 
            else {
                error.setText("Invalid, You have exceeded the credit limit.");
                db1.closeConnection();
            }
            
        }
        
    }//GEN-LAST:event_WithDrawBActionPerformed

    private void WithFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WithFieldKeyReleased
        double m;
        try{
            if(Double.parseDouble( WithField.getText())>0){
                m= Double.parseDouble( WithField.getText());
                AfterWithDraw.setText(Double.toString(Double.parseDouble(currentBalanceValue.getText())+m));
                WithDrawB.setEnabled(true);
                error.setText("");
            }
            else     
                error.setText("please enter a valid number.");
        }
        catch(Exception e){
            error.setText("please enter a valid number.");
        }
        
        
    }//GEN-LAST:event_WithFieldKeyReleased
    /**
     * UPDATE Function used to update the balance in the every label
     * So when we call any button in the main Panel the balance is updated directly
     */
    public void update(){
        dataBase db=new dataBase();
        db.getAllData(userName);
        currentBalanceValue.setText(Double.toString(db.creditBalance));
        AfterWithDraw.setText(Double.toString(db.creditBalance));
        dateLabel.setText(db.timeLimited);
        db.closeConnection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AfterWithDraw;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JButton WithDrawB;
    private javax.swing.JTextField WithField;
    private javax.swing.JLabel currentBalanceValue;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel debositMassege;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

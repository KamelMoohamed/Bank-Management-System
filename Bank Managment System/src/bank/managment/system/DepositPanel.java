package bank.managment.system;


import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * @author BONUS BANK TEAM...
 */
public class DepositPanel extends javax.swing.JPanel {
    public String userName;
    private dataBase db;
    /**
     * Creates new form DepositPanel
     */
    public DepositPanel(String userName) {
        this.userName = userName;
        
        initComponents();
        
        // Connecting to data base
        db = new dataBase();
        db.getAllData(this.userName);
        db.closeConnection();
        
        button1.setEnabled(false);
        button2.setEnabled(false);
        balanceAfterDepositValue.setText("");
        
        // Balance before credit
        currentBalanceValue.setText(Double.toString(db.balance));
        balanceAfterDepositValue.setText(Double.toString(db.balance));
    }

    /**
     * This method is used to display the form of the Deposit Panel
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L1 = new javax.swing.JLabel();
        currentBalanceValue = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        depField = new javax.swing.JTextField();
        L3 = new javax.swing.JLabel();
        balanceAfterDepositValue = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        debositMassege = new javax.swing.JLabel();
        button1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        button2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(238, 238, 238));

        L1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        L1.setForeground(new java.awt.Color(57, 62, 70));
        L1.setText("Current Balance:");

        currentBalanceValue.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        currentBalanceValue.setText("0.0");

        L2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        L2.setForeground(new java.awt.Color(57, 62, 70));
        L2.setText("Deposit Amount:");

        depField.setBackground(new java.awt.Color(57, 62, 70));
        depField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        depField.setForeground(new java.awt.Color(255, 255, 255));
        depField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 171, 182), 2));
        depField.setCaretColor(new java.awt.Color(255, 255, 255));
        depField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        depField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depFieldActionPerformed(evt);
            }
        });
        depField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                depFieldKeyReleased(evt);
            }
        });

        L3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        L3.setForeground(new java.awt.Color(57, 62, 70));
        L3.setText("Balance After Deposit:");

        balanceAfterDepositValue.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        balanceAfterDepositValue.setText("0.0");

        error.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));

        debositMassege.setBackground(new java.awt.Color(238, 238, 238));
        debositMassege.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        button1.setBackground(new java.awt.Color(57, 62, 70));
        button1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Debosit");
        button1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 171, 182), 5, true));
        button1.setBorderPainted(false);
        button1.setFocusPainted(false);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 62, 70));
        jLabel1.setText("Deposit Process");

        button2.setBackground(new java.awt.Color(57, 62, 70));
        button2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("Credit");
        button2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 171, 182), 5, true));
        button2.setBorderPainted(false);
        button2.setFocusPainted(false);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(L2)
                        .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(debositMassege, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(L3)
                            .addGap(27, 27, 27)
                            .addComponent(balanceAfterDepositValue))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(L1)
                            .addGap(65, 65, 65)
                            .addComponent(currentBalanceValue))
                        .addComponent(depField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(depField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(balanceAfterDepositValue))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(debositMassege, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void depFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depFieldActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // Calling The Data Base and Intializing the Balance
        dataBase db1 = new dataBase();
        db1.getAllData(userName);
        double balance =db1.balance;
        
        // GETTING the Data From the Text Field
        double dep=Double.parseDouble(depField.getText());
        
        if (dep> 0){
            currentBalanceValue.setText(Double.toString(balance));
            bank_account user=new bank_account(balance);
            balanceAfterDepositValue.setText(Double.toString(balance+dep));
            Double balanceAfter = user.deposit(dep);
            debositMassege.setText("The process completed successfully.");
            button1.setEnabled(false);
            button2.setEnabled(false);
        // Updating the Data in the Data Base After The Process
            db1.setBalance(userName, balanceAfter);
            db1.closeConnection();
            currentBalanceValue.setText(Double.toString(balanceAfter));
            depField.setText("");
        }
        else{
            error.setText("Unable to deposit this amount.");
            db1.closeConnection();
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void depFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_depFieldKeyReleased
        double m;
        try{
            if(Double.parseDouble( depField.getText())>0){
                m= Double.parseDouble( depField.getText());
                balanceAfterDepositValue.setText(Double.toString(m+Double.parseDouble(currentBalanceValue.getText())));
                error.setText("");
                button1.setEnabled(true);
                button2.setEnabled(true);
            }
            else 
                error.setText("please enter a valid number.");
        
        }
        catch(Exception e){
            error.setText("please enter a valid number.");
            button1.setEnabled(false);
        }
        
        
    }//GEN-LAST:event_depFieldKeyReleased

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
         // Calling The Data Base and Intializing the Balance
        dataBase db1 = new dataBase();
        db1.getAllData(userName);
        double balance =db1.creditBalance;
        
        // GETTING the Data From the Text Field
        double dep=Double.parseDouble(depField.getText());
        bank_account user=new bank_account(balance);
        if (user.withdraw(dep)){
            currentBalanceValue.setText(Double.toString(balance));
            
            balanceAfterDepositValue.setText(Double.toString(balance-dep));
            Double balanceAfter = user.balance;
            debositMassege.setText("The process completed successfully.");
            button1.setEnabled(false);
            button2.setEnabled(false);
        // Updating the Data in the Data Base After The Process
            if (balanceAfter==0){
            db1.setDate(userName, "");
            }
            db1.setStatus(userName, true);
            db1.setCBalance(userName, balanceAfter);
            db1.closeConnection();
            currentBalanceValue.setText(Double.toString(balanceAfter));
            depField.setText("");
        }
        else{
            error.setText("Unable to deposit this amount.");
            db1.closeConnection();
        }
    }//GEN-LAST:event_button2ActionPerformed
    /**
     * UPDATE Function used to update the balance in the every label
     * So when we call any button in the main Panel the balance is updated directly
     */
    public void update(){
    dataBase db=new dataBase();
    db.getAllData(userName);
    currentBalanceValue.setText(Double.toString(db.balance));
    balanceAfterDepositValue.setText(Double.toString(db.balance));
    db.closeConnection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel balanceAfterDepositValue;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JLabel currentBalanceValue;
    private javax.swing.JLabel debositMassege;
    private javax.swing.JTextField depField;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

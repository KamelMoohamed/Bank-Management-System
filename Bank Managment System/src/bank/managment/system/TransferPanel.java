package bank.managment.system;


import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class TransferPanel extends javax.swing.JPanel {
    public String userName;
    private dataBase db;
    /**
     * Creates new form DepositPanel
     */
    public TransferPanel(String userName) {
        this.userName = userName;
        
        initComponents();
        
        // Connecting to data base
        db = new dataBase();
        db.getAllData(this.userName);
        db.closeConnection();
        
        WithDrawB.setEnabled(false);
        AfterWithDraw.setText("");
        
        // Balance before credit
        currentBalanceValue.setText(Double.toString(db.balance));
        AfterWithDraw.setText(Double.toString(db.balance));
    }

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
        L4 = new javax.swing.JLabel();
        UserField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(238, 238, 238));

        L1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        L1.setForeground(new java.awt.Color(57, 62, 70));
        L1.setText("Current Balance:");

        currentBalanceValue.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        currentBalanceValue.setText("0.0");

        L2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        L2.setForeground(new java.awt.Color(57, 62, 70));
        L2.setText("Transfer Amount:");

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
        L3.setText("Balance After Transfer:");

        AfterWithDraw.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        AfterWithDraw.setText("0.0");

        error.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));

        debositMassege.setBackground(new java.awt.Color(238, 238, 238));
        debositMassege.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        WithDrawB.setBackground(new java.awt.Color(57, 62, 70));
        WithDrawB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        WithDrawB.setForeground(new java.awt.Color(255, 255, 255));
        WithDrawB.setText("Transfer");
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
        jLabel1.setText("Transfer Process");

        L4.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        L4.setForeground(new java.awt.Color(57, 62, 70));
        L4.setText("To:");

        UserField.setBackground(new java.awt.Color(57, 62, 70));
        UserField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UserField.setForeground(new java.awt.Color(255, 255, 255));
        UserField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 171, 182), 2));
        UserField.setCaretColor(new java.awt.Color(255, 255, 255));
        UserField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        UserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserFieldActionPerformed(evt);
            }
        });
        UserField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UserFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UserField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(65, 65, 65)
                        .addComponent(currentBalanceValue))
                    .addComponent(WithField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L4))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentBalanceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WithField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AfterWithDraw))
                        .addGap(44, 44, 44)
                        .addComponent(WithDrawB, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(debositMassege, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(191, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void WithFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WithFieldActionPerformed

    private void WithDrawBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithDrawBActionPerformed
        // Connecting to the DataBase with two objects
        dataBase db1 = new dataBase();
        db1.getAllData(userName);
        double balance1 =db1.balance;
        db1.closeConnection();
        
        dataBase db2 = new dataBase();
        db2.getAllData(UserField.getText());
        db2.closeConnection();
        
        if(db2.found!=0 && !db1.userName.equals(db2.userName)){
            double balance2 =db2.balance;
            
            bank_account user=new bank_account(balance1);
            double dep=Double.parseDouble(WithField.getText());
            if (user.transferamount(dep, balance2)){
                currentBalanceValue.setText(Double.toString(balance1));
        
                AfterWithDraw.setText(Double.toString(balance1-dep));
                Double balanceAfter1 = balance1-dep;
                Double balanceAfter2 = balance2+dep;
        
                debositMassege.setText("The process completed successfully.");
                WithDrawB.setEnabled(false);
        
                dataBase db3 = new dataBase();
                db3.getAllData(userName);
                db3.setBalance(userName, balanceAfter1);
                db3.closeConnection();
                dataBase db4 = new dataBase();
                db4.getAllData(UserField.getText());
                db4.setBalance(UserField.getText(), balanceAfter2);
                db4.closeConnection();
                currentBalanceValue.setText(Double.toString(balanceAfter1));
        
                }
        

            else{
                error.setText("Enable to withdraw this amount.");
                }
            }
        else{
        db2.closeConnection();
        error.setText("Wrong UserName");
        error.setVisible(true);
        }
        
    }//GEN-LAST:event_WithDrawBActionPerformed

    private void WithFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WithFieldKeyReleased
        double m;
        try{
            if(Double.parseDouble( WithField.getText())>0){
                
                m= Double.parseDouble( WithField.getText());
                AfterWithDraw.setText(Double.toString(Double.parseDouble(currentBalanceValue.getText())-m));
                error.setText("");}
            else error.setText("please enter a valid number.");
                WithDrawB.setEnabled(true);}
        
        catch(Exception e){
        error.setText("please enter a valid number.");
        }
        
        
    }//GEN-LAST:event_WithFieldKeyReleased

    private void UserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserFieldActionPerformed
    }//GEN-LAST:event_UserFieldActionPerformed

    private void UserFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserFieldKeyReleased
    }//GEN-LAST:event_UserFieldKeyReleased
    /**
     * UPDATE Function used to update the balance in the every label
     * So when we call any button in the main Panel the balance is updated directly
     */
    public void update(){
        dataBase db=new dataBase();
        db.getAllData(userName);
        currentBalanceValue.setText(Double.toString(db.balance));
        AfterWithDraw.setText(Double.toString(db.balance));
        db.closeConnection();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AfterWithDraw;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JTextField UserField;
    private javax.swing.JButton WithDrawB;
    private javax.swing.JTextField WithField;
    private javax.swing.JLabel currentBalanceValue;
    private javax.swing.JLabel debositMassege;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

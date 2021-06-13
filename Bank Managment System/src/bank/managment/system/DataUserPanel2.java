package bank.managment.system;

import java.time.LocalDate;

/**
 * @author BONUS BANK TEAM...
 */
public class DataUserPanel extends javax.swing.JPanel {
    public String userName;
    /**
     * Creates new form Data User Panel
     * This panel used to display all the user's DATA...
     */
    public DataUserPanel(String userName) {
        this.userName = userName;
        dataBase db = new dataBase();
        db.getAllData(userName);
        db.closeConnection();
        
        initComponents();
        
        welcomeUser.setText("Welcome "+ db.fName);
        nameValue.setText(db.fName + " " + db.lName);
        emailValue.setText(db.eMail); 
        creditCardNumperValue.setText(Long.toString(db.creditCardNum));
        balanceValue.setText(Double.toString(db.balance)); 
        updateVIP();
        dataBase db1 = new dataBase();
        db1.getAllData(userName);
        db1.closeConnection();
        if(db1.VIP)
            VipLabel.setText("VIP Account");
        else 
            VipLabel.setText("Personal Account");
        updateStatus();
        if(db1.status){
        StatusLabel.setText("Dept");
        }else{
        StatusLabel.setText("Normal");
        }
        
    }
   
    /**
     * UPDATE Function used to update the balance in the every label
     * So when we call any button in the main Panel the balance is updated directly
     */
    public void update(){
    dataBase db=new dataBase();
    db.getAllData(userName);
    balanceValue.setText(Double.toString(db.balance));
    db.closeConnection();
    updateStatus();
    if(db.status){
        StatusLabel.setText("Dept");
        }else{
        StatusLabel.setText("Normal");
    updateVIP();
        if(db.VIP == true)
            VipLabel.setText("VIP Account");
        else 
            VipLabel.setText("Personal Account");
    
    }
    }
    private void updateStatus(){
    dataBase db=new dataBase();
    db.getAllData(userName);
    try{
    LocalDate date= LocalDate.parse(db.timeLimited);
    if(date.compareTo(LocalDate.now())<0){
    db.setStatus(userName, true);
    db.setStatus(userName, true);
    }else{
    db.setStatus(userName, false);
    db.setStatus(userName, false);
    }
    db.closeConnection();
    }
    catch(Exception e){
    db.setStatus(userName, false);
    db.setStatus(userName, false);
    db.closeConnection();
    }
    }
    private void updateVIP(){
    dataBase db=new dataBase();
    db.getAllData(userName);
    
    double balance=db.balance;
    if(balance>200000){
    db.setVIP(userName, true);
    }else{
    db.setVIP(userName, false);
    }
    db.closeConnection();
    
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L1 = new javax.swing.JLabel();
        nameValue = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        emailValue = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        creditCardNumperValue = new javax.swing.JLabel();
        balanceValue = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        welcomeUser = new javax.swing.JLabel();
        VipLabel = new javax.swing.JLabel();
        StatusLabel = new javax.swing.JLabel();
        L5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 238, 238));

        L1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        L1.setText("Full Name:");

        nameValue.setBackground(new java.awt.Color(255, 255, 255));
        nameValue.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nameValue.setLabelFor(L1);
        nameValue.setText(" Yousef Kadry Anwar");
        nameValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        L2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        L2.setText("Email:");

        emailValue.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        emailValue.setLabelFor(L2);
        emailValue.setText(" ay7aga@gmail.com");
        emailValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        L3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        L3.setText("Credit Card Number:");

        creditCardNumperValue.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        creditCardNumperValue.setLabelFor(L3);
        creditCardNumperValue.setText(" 03165121651321");
        creditCardNumperValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        balanceValue.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        balanceValue.setLabelFor(L4);
        balanceValue.setText(" 1500000");
        balanceValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        L4.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        L4.setText("Balance:");

        welcomeUser.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        welcomeUser.setText("Welcome Yousef");

        VipLabel.setFont(new java.awt.Font("Agency FB", 1, 60)); // NOI18N
        VipLabel.setText("VIP Account");

        StatusLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        StatusLabel.setLabelFor(L4);
        StatusLabel.setText(" 1500000");
        StatusLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        L5.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        L5.setText("Status:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(L1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(L3)
                                .addComponent(L2)
                                .addComponent(L4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(creditCardNumperValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(balanceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(StatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(welcomeUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(VipLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(welcomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L1)
                    .addComponent(nameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L2)
                    .addComponent(emailValue, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L3)
                    .addComponent(creditCardNumperValue, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L4)
                    .addComponent(balanceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L5)
                    .addComponent(StatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JLabel VipLabel;
    private javax.swing.JLabel balanceValue;
    private javax.swing.JLabel creditCardNumperValue;
    private javax.swing.JLabel emailValue;
    private javax.swing.JLabel nameValue;
    private javax.swing.JLabel welcomeUser;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evisitoruser;

import com.sun.glass.events.KeyEvent;
//import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author katys
 */
public class noId extends javax.swing.JFrame {
String gender;
    /**noId
     * Creates new form noId
     */
int insertin;
user reopenUser=new user();
user scannerInpuFrame=new user("need scanner input JTexField");
boolean typeEnabled=false;
public static String idNumber;
static DBCLASS DB=new DBCLASS();
    public noId() {
        initComponents();
        insertin=0;
        
        
        registerButton.setBorderPainted(false);
        registerButton.setFocusPainted(false);
        registerButton.setEnabled(false);
        updateButton.setEnabled(false);
        cancelButton.setEnabled(false);
        int fcs=0;
        while(fcs<250){
        teleTextfield.requestFocus();
        fcs++;
        }
        
    try {
        Thread.sleep(1000);
        
    } catch (InterruptedException ex) {
        Logger.getLogger(noId.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    teleTextfield.requestFocus();
    
    
//                                     if(DB.visitorIsIn("NO PHONE",idNumber)){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(noId.class.getName()).log(Level.SEVERE, null, ex);
//            }
//       JOptionPane.showMessageDialog(null,"Visitor is In");
//       if(DB.exitVisitor("NO PHONE", idNumber)){
//             try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(noId.class.getName()).log(Level.SEVERE, null, ex);
//            }
//           JOptionPane.showMessageDialog(null,"Visitor Exited!!");
//       }
//       this.dispose();
//       return ;
//       }
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        teleTextfield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idNo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Welcome Attendance form of E-Visitors system ");

        jLabel3.setText("Names");

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel6.setText("Telephone :");

        teleTextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                teleTextfieldFocusGained(evt);
            }
        });
        teleTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teleTextfieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                teleTextfieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                teleTextfieldKeyTyped(evt);
            }
        });

        jLabel10.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(idNo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(teleTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(91, 91, 91))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(registerButton)
                        .addGap(46, 46, 46)
                        .addComponent(updateButton)
                        .addGap(42, 42, 42)
                        .addComponent(cancelButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(idNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teleTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(75, 75, 75)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton)
                    .addComponent(updateButton)
                    .addComponent(cancelButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
      
        System.out.println("Let's go");
        registerButtonClicked(null);
    
    }//GEN-LAST:event_registerButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
              String PATTERN ="^[a-zA-Z]{5,30}$";
      Pattern patt =Pattern.compile(PATTERN);
      Matcher match =patt.matcher(jTextField1.getText());
      if(!match.matches()){
        jLabel7.setText("Naming is incorrect!");
      }
      else{
          jLabel7.setText(null);
      }
    }//GEN-LAST:event_jTextField1KeyReleased

    public void registerButtonClicked(String callMethod){
                String inn_out ="1";
                    String fname = jTextField1.getText();
                    //String lname = jTextField2.getText();
                    String tel = teleTextfield.getText();
                    String idNumber=idNo.getText();
                    String Destination=null,Entryequip=null;
              if(callMethod!=null && callMethod.toUpperCase().equals("CTRL")){
              tel="NOT NUMBER";
              }
              
                    if(DB.visitorIsIn(tel, idNumber)){
       JOptionPane.showMessageDialog(null,"Visitor is In");
       if(DB.exitVisitor(tel, idNumber)){
           JOptionPane.showMessageDialog(null,"Visitor Exited Success!!"); 
       
        mainvisitors.userCheckInMainInterface.getScannerInput().setEditable(true);
      mainvisitors.userCheckInMainInterface.getScannerInput().setText("");
      mainvisitors.userCheckInMainInterface.getScannerInput().requestFocus();//
       this.dispose();
       
//       user.userInterface.getscannerInput().setEditable(true);
//       user.userInterface.getscannerInput().setText("");
      
     // user.userInterface.dispose();
//      reopenUser.dispose();
//      reopenUser=new user();
//      reopenUser.setVisible(true);
//         scannerInpuFrame.getscannerInput().setEditable(true);
//      scannerInpuFrame.getscannerInput().requestFocus();
       return ;
       }
       }
         //JOptionPane.showMessageDialog(null, "Equpment now");
         
           JPanel  panel=new JPanel();
          JLabel   labelmessage=new JLabel("Queastion");
          labelmessage.setBounds(2,2, 200, 30);
          panel.setSize(250, 50);
          panel.setLayout(null);
          panel.add(labelmessage);
        //  try {
//        Thread.sleep(1000);
//    } catch (InterruptedException ex) {
//        Logger.getLogger(noId.class.getName()).log(Level.SEVERE, null, ex);
//    }
        int decision=JOptionPane.showConfirmDialog(null,"Do you have Equipment","ASK EQUIPMENT",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    
        if(decision==JOptionPane.YES_OPTION){  
            JTextField equipId=new JTextField();
            equipId.setBounds(2, 2, 100, 20);
            equipId.requestFocus();
            while(equipId.getText().equals("")){
            JOptionPane.showConfirmDialog(this, equipId, "Scan Equipment",JOptionPane.DEFAULT_OPTION);
            equipId.requestFocus();
            }
           // JOptionPane.showMessageDialog(null,"Scanned Equipment:::.."+equipId.getText());
            String idEquipment=equipId.getText();
            String equipmnetName=JOptionPane.showInputDialog("Input Equipment Name","Equipment Name"); 
            Destination=JOptionPane.showInputDialog("Input Destination","Destination");
            Entryequip=equipmnetName;
            
            if(!DB.equipmentExist(idEquipment)){
          if(DB.insertEquipment( idNumber, equipmnetName, equipId.getText(),"VISITOR",0.0)){
          JOptionPane.showMessageDialog(null,"Equipment Added!");
          }
          else{
              JOptionPane.showMessageDialog(null,"Equipment not Added!");
          }
            }
            else{
             JOptionPane.showMessageDialog(null,"Equipment Exist!");
            }
        }
         
        
        try{
                                        Date d = new Date();
                         SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
                         String datee = s.format(d);
                            //System.out.println(dateFormat.format(date));
                         //String datee =(String)jTable1.getValueAt(row, 5);
                      Calendar cal = Calendar.getInstance();
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                    String timee =sdf.format(cal.getTime());

//                   if(DB.checkIfUserExit(tel, idNumber)) {
//                   JOptionPane.showMessageDialog(null,"The user is in the System");
//                   
//                   if(DB.checkInOrOut(tel, idNumber).equals("1")){
//                   JOptionPane.showMessageDialog(null,"User is in Let get them out");
//                   DB.exitVisitor(tel, idNumber);
//                   
//                   }
//                   else if(DB.checkInOrOut(tel, idNumber).equals("0")){
//                   JOptionPane.showMessageDialog(null,"User is Out let get them in");
//                   DB.enterVisitor(tel, idNumber);
//                   
//                   }
//        
//                   }
                   
                  if(!DB.checkIfUserExit(tel, idNumber)){ 
                  if( DB.insertVisitor(tel, fname, idNumber)){
                      JOptionPane.showMessageDialog(null,"Visitor added!");
                  
                if(  DB.insertIntoAttendance(idNumber, Destination,Entryequip))
                   JOptionPane.showMessageDialog(null,"Visitor added!");
                   mainvisitors.userCheckInMainInterface.getScannerInput().setEditable(true);
      mainvisitors.userCheckInMainInterface.getScannerInput().setText("");
      mainvisitors.userCheckInMainInterface.getScannerInput().requestFocus();//
       this.dispose();
                
                  }
                  else{
                   JOptionPane.showMessageDialog(null,"Visitor not added!");
                    user.userInterface.getscannerInput().setEditable(true);
      user.userInterface.getscannerInput().setText("");
                   return ;
                  }
                  }
                  else {
                  JOptionPane.showMessageDialog(null,"User Exist in the System");
                 if(DB.insertIntoAttendance(idNumber, Destination,Entryequip)
                         && DB.enterVisitor(tel, idNumber))//
                     JOptionPane.showMessageDialog(null,"Visitor Entered");
                
      this.dispose();
        user.userInterface.getscannerInput().setEditable(true);
      user.userInterface.getscannerInput().setText("");
      mainvisitors.userCheckInMainInterface.getScannerInput().setEditable(true);
      mainvisitors.userCheckInMainInterface.getScannerInput().setText("");
      mainvisitors.userCheckInMainInterface.getScannerInput().requestFocus();
      
//      user.userInterface.dispose();
//       reopenUser.dispose();
//      reopenUser=new user();
//      reopenUser.setVisible(true);
//      scannerInpuFrame.getscannerInput().setEditable(true);
//      scannerInpuFrame.getscannerInput().requestFocus();
                  return ;
                  }
                   
//           String sql= "Insert into visitors_table(first_name, last_name, sex, id_no,entry_date,entry_time,in_out,tel)"
//                   + " values ('"+fname+"','"+lname+"','"+gender+"','"+idNumber+"','"+datee+"','"+timee+"','"+inn_out+"','"+tel+"')";
//      Connection     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/evisitors", "root","");
//         //PreparedStatement  pst =con.prepareStatement(sql);
//          Statement st=con.createStatement();
//          st.executeUpdate(sql);
//           JOptionPane.showMessageDialog(null, "Inserted successful");
           
                jTextField1.setText("");
         //jTextField2.setText("");
          teleTextfield.setText("");
          
           
       }catch(Exception e){
          JOptionPane.showMessageDialog(this, e);
       }
    }
    
    
    private void teleTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teleTextfieldKeyReleased
//             String PATTERN ="^[0-9]{10,15}$";
//      Pattern patt =Pattern.compile(PATTERN);
//      Matcher match =patt.matcher(teleTextfield.getText());
//            if(!match.matches()){
//        jLabel9.setText("Telephone is incorrect!");
//      }
//      else{
//          jLabel9.setText(null);
//      }

teleTextfield.requestFocus();

    }//GEN-LAST:event_teleTextfieldKeyReleased

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
     
    try {
        java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-visitors", "root", "");
        java.sql.Statement stt = conn.createStatement();
        Date day = new Date();
        SimpleDateFormat sss = new SimpleDateFormat("dd-MM-yyyy");
        String todaydatee = sss.format(day);
        String in_out ="1";
        String tel = teleTextfield.getText();
        String selectQuery="SELECT id_no,entry_date from visitors_table where entry_date ='"+todaydatee+"' AND id_no = '"+tel+"' AND in_out='"+in_out+"'";
        // System.out.println(selectQuery);
        ResultSet rss = stt.executeQuery(selectQuery);
        
        
        if(rss.next()){
            //if to check exit time
            Date ex = new Date();
            SimpleDateFormat ti = new SimpleDateFormat("dd-MM-yyyy  HH:mm:ss");
            String exte = ti.format(ex);
            String inn_out ="0";
            //update visitor set exit time.
            String sqll="UPDATE visitors_table SET exit_time=? ,in_out=? WHERE entry_date ='"+todaydatee+"' AND id_no = '"+tel+"'";
            PreparedStatement pst =conn.prepareStatement(sqll);
            pst.setString(1,exte);
            pst.setString(2, inn_out);
            pst.executeUpdate();
            
            int TIME_VISIBLE = 3000;
            JOptionPane pane = new JOptionPane("Good bye, have nice journey",
                    JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = pane.createDialog(null, "Info");
            dialog.setModal(false);
            dialog.setVisible(true);
                  new Timer(TIME_VISIBLE, (ActionEvent e) -> {
          dialog.setVisible(false);
                 }).start();
                    //JOptionPane.showMessageDialog(this, "Good bye, have nice journry");
                        teleTextfield.setText("");
                       }
    
        
    } catch (SQLException ex) {
        Logger.getLogger(noId.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void teleTextfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teleTextfieldKeyTyped
        char c=evt.getKeyChar(); 
            if(!(Character.isDigit(c)) ||(!typeEnabled)) {
               if(evt.getKeyChar()=='d' || evt.getKeyChar()=='D')
//                   teleTextfield.setText(teleTextfield.getText().substring(0,teleTextfield.getText().length()-1));
               teleTextfield.requestFocus();
               
                if(evt.getKeyChar()==' ' && typeEnabled){
                registerButtonClicked(null);
            }
   evt.consume();
   }
  
      teleTextfield.requestFocus();
    }//GEN-LAST:event_teleTextfieldKeyTyped

    private void teleTextfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teleTextfieldKeyPressed
             if(!typeEnabled && !(evt.getKeyCode()==KeyEvent.VK_CONTROL)){
            evt.consume();
            teleTextfield.requestFocus();
            
            return;
        }
             if(evt.getKeyCode()==KeyEvent.VK_CONTROL){
                 //JOptionPane.showMessageDialog(null,evt.getKeyCode());
             typeEnabled=true;
             registerButton.setEnabled(true);
             updateButton.setEnabled(true);
             cancelButton.setEnabled(true);
             if(DB.checkIfUserExit("NO PHONE",idNo.getText()) && !DB.visitorIsIn("NO PHONE",idNo.getText())){
        registerButtonClicked("ctrl");
             
             }
             
             
       
        char c=evt.getKeyChar();
         if(!(Character.isDigit(c)) ||(!typeEnabled)) {
   evt.consume();
   } 
   
        teleTextfield.requestFocus();



    }//GEN-LAST:event_teleTextfieldKeyPressed
    }
    private void teleTextfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teleTextfieldFocusGained
//       if(DB.checkIfUserExit("NO PHONE",idNo.getText()) && !DB.visitorIsIn("NO PHONE",idNo.getText()) && registerButton.isEnabled()){
//        registerButtonClicked();
//       this .dispose();
  //}
    }//GEN-LAST:event_teleTextfieldFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(noId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(noId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(noId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(noId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
               noId noid= new noId();
                       noid.setVisible(true);
                       
            }
        });
    }
    
    
    public JTextField [] getNoIdTextFields(){
        JTextField [] texFields={idNo,jTextField1};  
        return texFields;
      
    
    }

    public JTextField getIdNo() {
        return idNo;
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField idNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField teleTextfield;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}

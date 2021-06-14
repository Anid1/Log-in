      /*
        -Programi i projektit:Log in
        -Programi ku zhvillohet projekti:NetBeans
        -Anid Bashi
        -Kursi:Informatike 
        -Viti:i dyte
        -Data:14/05/2021
        -Projekti 3(updated)
        -Pershkrimi:Ky program mundson lidhjen mes userave dhe databaseve (specifik) nepermjet login,permban pjesen e regjistrimit te 
         userave si dhe rastin kur harrohet  fjalkalimi.
        */
package projekt7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement; 
/**
 *
 * @author Terra
 */
public class Login extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    public Login() {
        initComponents();
    }

   int clc;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Text1 = new javax.swing.JTextField();
        Text2 = new javax.swing.JPasswordField();
        Hyr = new javax.swing.JButton();
        Regjistrohu = new javax.swing.JButton();
        Sistemi = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Recover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Emri:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Fjalkalimi:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Hyrja");

        Hyr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Hyr.setText("Hyr");
        Hyr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HyrMouseClicked(evt);
            }
        });
        Hyr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HyrActionPerformed(evt);
            }
        });
        Hyr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                HyrKeyPressed(evt);
            }
        });

        Regjistrohu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Regjistrohu.setText("Regjistrohu");
        Regjistrohu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegjistrohuActionPerformed(evt);
            }
        });

        Sistemi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Sistemi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biblioteka", "Nxenesit", "Pedagoget" }));
        Sistemi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SistemiActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Sistemi:");

        Recover.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Recover.setText("Kam harruar fjalkalimin");
        Recover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Sistemi, 0, 89, Short.MAX_VALUE)
                                    .addComponent(Text1)
                                    .addComponent(Text2))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Regjistrohu)
                                    .addComponent(Hyr, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 76, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Recover)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Hyr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sistemi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Regjistrohu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(Recover)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HyrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HyrActionPerformed
        
        try{
       Class.forName("com.mysql.cj.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/admin","root","cimcakez1");
        st=conn.prepareStatement("select * from users where emri=? and passwordi=? and sistemi=?");
        st.setString(1,Text1.getText());
        st.setString(2,Text2.getText());
        st.setString(3,String.valueOf(Sistemi.getSelectedItem()));
        rs=st.executeQuery();
       if (rs.next()){
           JOptionPane.showMessageDialog(this,"Ju hyte me sukses ne sistem");
         if (Sistemi.getSelectedIndex()==0){
          Biblioteka b= new Biblioteka();
        b.setVisible(true);
        this.setVisible(false);
         }
         if (Sistemi.getSelectedIndex()==1){
        Nxenesit n=new Nxenesit();
        n.setVisible(true);
        this.setVisible(false);
         }
         if (Sistemi.getSelectedIndex()==2){
        Pedagoget p=new Pedagoget();
        p.setVisible(true);
        this.setVisible(false);
         } 
       }if(rs.next()==false){
           if(rs.next()==false){
           JOptionPane.showMessageDialog(this,"Emri,fjalekalimi ose sistemi jane shkruar gabim");
         Text1.setText("");
         Text2.setText("");
           clc++;
           }
           if(clc==3 || clc==6){
           int pergjigje=JOptionPane.showConfirmDialog(this,"Ke harruar fjalkalimin?","Rikthejeni",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
         if(pergjigje==JOptionPane.YES_OPTION){
         dispose();
         Recover r =new Recover();
         r.setVisible(true);
         this.setVisible(false);
         if(pergjigje==JOptionPane.NO_OPTION){
         dispose();
         Login l =new Login();
         l.setVisible(true);
         this.setVisible(false);
         }
           }
       }
       }
       conn.close();
      }catch (Exception e){
      System.out.println(e.getMessage());
      }
        
    }//GEN-LAST:event_HyrActionPerformed

    private void SistemiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SistemiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SistemiActionPerformed

    private void RegjistrohuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegjistrohuActionPerformed
        Regjistrimi r=new Regjistrimi();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegjistrohuActionPerformed

    private void RecoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecoverActionPerformed
        Recover r=new Recover();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RecoverActionPerformed

    private void HyrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HyrKeyPressed
        
    }//GEN-LAST:event_HyrKeyPressed

    private void HyrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HyrMouseClicked
 
    }//GEN-LAST:event_HyrMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hyr;
    private javax.swing.JButton Recover;
    private javax.swing.JButton Regjistrohu;
    private javax.swing.JComboBox<String> Sistemi;
    private javax.swing.JTextField Text1;
    private javax.swing.JPasswordField Text2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

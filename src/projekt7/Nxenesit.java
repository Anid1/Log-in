/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt7;

import java.sql.*; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import javax.swing.*; 
import javax.swing.table.DefaultTableModel; 
import java.sql.Connection; 
import java.util.ArrayList;
import java.util.Vector; 
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter; 
public class Nxenesit extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    int q,i,id,deleteItem;

    
    public Nxenesit() {
        initComponents();
        String url ="jdbc:mysql://localhost:3308/sistemet"; 
        String password = "cimcakez1";  
        String username = "root"; 
        try{
            
            conn = DriverManager.getConnection(url,username,password); 
        }catch(Exception ex){
            System.out.println("Error "+ ex.getMessage());
        
        }
        shfaqtabelen(); 
    }
    public void shfaqtabelen(){
    String sql="SELECT * FROM nxenesit"; 
        try{
            PreparedStatement pst=conn.prepareStatement(sql);
            rs = pst.executeQuery(); 
            DefaultTableModel model=(DefaultTableModel)Tabel.getModel();
                    
            while (rs.next()) {  
                model.addRow(new String[]{
                    rs.getString(1), 
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),});
            }
         
        }catch(Exception ex){
            System.out.println("Error : "+ ex.getMessage());
        }
         
        }
        public void Update()  
        {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn= DriverManager.getConnection("jdbc:mysql://localhost:3308/sistemet","root","cimcakez1");
                ps=conn.prepareStatement("select * from nxenesit");
                
                rs=ps.executeQuery();
                ResultSetMetaData stData = rs.getMetaData();
                
                q= stData.getColumnCount();
                
                DefaultTableModel RecordTable=(DefaultTableModel)Tabel.getModel();
                RecordTable.setRowCount(0);
                
                while(rs.next()){
                    Vector columnData=new Vector();
                    
                    for(i= 1;i<=q;i++) 
                    {
                        columnData.add(rs.getString("id"));
                        columnData.add(rs.getString("emri"));
                        columnData.add(rs.getString("mbiemri"));
                        columnData.add(rs.getString("viti"));
                        columnData.add(rs.getString("dega"));
                        columnData.add(rs.getString("grada"));
                        
                    }
                    RecordTable.addRow(columnData);
                }
                
            }catch(Exception ex){
                
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Text1 = new javax.swing.JTextField();
        Text2 = new javax.swing.JTextField();
        Text3 = new javax.swing.JTextField();
        Text4 = new javax.swing.JTextField();
        Text5 = new javax.swing.JTextField();
        Shto = new javax.swing.JButton();
        Edito = new javax.swing.JButton();
        Pastro = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Text6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Text7 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setText("jLabel8");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Nxenesit");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Emri:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mbiemri:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Viti:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Dega:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Grada:");

        Text1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Text2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text2ActionPerformed(evt);
            }
        });

        Text3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Text4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Text5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Shto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Shto.setText("Shtoni nxenesin");
        Shto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShtoActionPerformed(evt);
            }
        });

        Edito.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Edito.setText("Edito");
        Edito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditoActionPerformed(evt);
            }
        });

        Pastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Pastro.setText("Pastro");
        Pastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PastroActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Kerko:");

        Text6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Text6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Text6KeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Id:");

        Text7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Emri", "Mbiemri", "Viti", "Dega", "Grada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TabelMouseEntered(evt);
            }
        });
        jScrollPane4.setViewportView(Tabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Text2)
                                            .addComponent(Text1)
                                            .addComponent(Text7, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(Shto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Edito, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Pastro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(Text4, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                                    .addComponent(Text3))
                                                .addGap(1, 1, 1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Text6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Text5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 120, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(Text7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Text5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Text6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Shto)
                        .addComponent(Edito)
                        .addComponent(Pastro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text2ActionPerformed

    private void ShtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShtoActionPerformed
      try{  
           
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/sistemet","root","cimcakez1");
            ps=conn.prepareStatement("insert into nxenesit values(?,?,?,?,?,?)");
            ps.setInt(1,Integer.parseInt(Text7.getText())); 
            ps.setString(2,Text1.getText());
            ps.setString(3,Text2.getText());
            ps.setInt(4,Integer.parseInt(Text3.getText()));
            ps.setString(5,Text4.getText());
            ps.setString(6,Text5.getText());
            ps.execute();
            Update();
        }catch (Exception ex){
             System.out.println("Error "+ ex.getMessage());
          }   
    }//GEN-LAST:event_ShtoActionPerformed

    private void PastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PastroActionPerformed
         Text1.setText("");
         Text2.setText("");
         Text3.setText("");
         Text4.setText("");
         Text5.setText("");
         Text7.setText("");
    }//GEN-LAST:event_PastroActionPerformed

    private void Text6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Text6KeyReleased
        DefaultTableModel table= (DefaultTableModel)Tabel.getModel();
        String search=Text6.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> s1 = new TableRowSorter<DefaultTableModel>(table);
        Tabel.setRowSorter(s1);
        
        s1.setRowFilter(RowFilter.regexFilter(search));
        
    }//GEN-LAST:event_Text6KeyReleased

    private void EditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditoActionPerformed
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/sistemet","root","cimcakez1");
            ps=conn.prepareStatement("update nxenesit set emri=?,mbiemri=?,viti=?,dega=?,grada=? where id=?");
            ps.setString(6,Text7.getText());
            ps.setString(1,Text1.getText());
            ps.setString(2,Text2.getText());
            ps.setString(3,Text3.getText());
            ps.setString(4,Text4.getText());
            ps.setString(5,Text5.getText());
            
         
            ps.execute();
            
            Update();
        }catch (Exception ex){
             System.out.println("Error "+ ex.getMessage());
          }
    }//GEN-LAST:event_EditoActionPerformed

    private void TabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMouseEntered
       DefaultTableModel RecordTable=(DefaultTableModel)Tabel.getModel();
      int SelectedRows=Tabel.getSelectedRow();
      Text7.setText(RecordTable.getValueAt(SelectedRows,0).toString());
      Text1.setText(RecordTable.getValueAt(SelectedRows,1).toString());
      Text2.setText(RecordTable.getValueAt(SelectedRows,2).toString());
      Text3.setText(RecordTable.getValueAt(SelectedRows,3).toString());
      Text4.setText(RecordTable.getValueAt(SelectedRows,4).toString());
      Text5.setText(RecordTable.getValueAt(SelectedRows,5).toString());
    }//GEN-LAST:event_TabelMouseEntered

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
            java.util.logging.Logger.getLogger(Nxenesit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nxenesit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nxenesit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nxenesit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nxenesit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edito;
    private javax.swing.JButton Pastro;
    private javax.swing.JButton Shto;
    private javax.swing.JTable Tabel;
    private javax.swing.JTextField Text1;
    private javax.swing.JTextField Text2;
    private javax.swing.JTextField Text3;
    private javax.swing.JTextField Text4;
    private javax.swing.JTextField Text5;
    private javax.swing.JTextField Text6;
    private javax.swing.JTextField Text7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}

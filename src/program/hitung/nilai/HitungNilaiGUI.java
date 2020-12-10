/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.hitung.nilai;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Yukino Arata
 */
public class HitungNilaiGUI extends javax.swing.JFrame {
    Connection co = KoneksiDB.Koneksi();
    public DefaultTableModel ModelTab;
    public Statement st;
    public ResultSet rs;
    boolean edit;
    String sNIM;
    
            
    public HitungNilaiGUI() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        judul();
        showdata("");
    }
    
    public final void judul() { // menentukan nama header/judul pada tabel
         Object[] judul = {"NIM", "Nama Mahasiswa", "Tugas", "Quiz", "Mid","Final","Akhir","Huruf Mutu"};
         ModelTab = new DefaultTableModel(null, judul);
         jTable1.setModel(ModelTab);
}
    
   public final void showdata(String where) { 
   try {
      st = co.createStatement();
      ModelTab.getDataVector().removeAllElements();
      ModelTab.fireTableDataChanged();
      rs = st.executeQuery("SELECT * FROM nilai " + where); // memilih seluruh data pada tabel data.

      while (rs.next()) {
      Object[] data = {
        rs.getString("NIM"),
        rs.getString("Nama"),
        rs.getString("nilai_tugas"),
        rs.getString("nilai_quiz"),
        rs.getString("nilai_mid"),
        rs.getString("nilai_final"),
        rs.getString("nilai_akhir"),
        rs.getString("huruf"),
        };
      ModelTab.addRow(data);
    }
    }
    catch(Exception e) {
    e.printStackTrace();
   }
}
   
   public final void RefreshForm() {
       txtNM.setText("");
       txtHF.setText("");
       txtMid.setText("");
       txtNA.setText("");
       txtNF.setText("");
       txtNIM.setText("");
       txtNQ.setText("");
       txtNT.setText("");
       
        btnHitung.setEnabled(true);
        btnSimpan.setEnabled(false);
        btnEdit.setEnabled(true);
        btnHapus.setEnabled(true);
        btnBatal.setEnabled(true);
        btnSimpan.setText("Simpan");

      edit=false;
   }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNM = new javax.swing.JTextField();
        txtNIM = new javax.swing.JTextField();
        txtNT = new javax.swing.JTextField();
        txtNQ = new javax.swing.JTextField();
        txtMid = new javax.swing.JTextField();
        txtHF = new javax.swing.JTextField();
        txtNA = new javax.swing.JTextField();
        txtNF = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnHitung = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("PROGRAM PENGHITUNG NILAI MAHASISWA");

        jLabel2.setText("Nama Mahasiswa");

        jLabel3.setText("NIM");

        jLabel4.setText("Nilai Tugas");

        jLabel5.setText("Nilai Quiz");

        jLabel6.setText("Nilai Mid");

        jLabel7.setText("Nilai Final");

        jLabel8.setText("Nilai Akhir");

        jLabel9.setText("Huruf Mutu");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(btnHitung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNQ, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNT, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNM, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(txtHF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNA, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMid))
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(57, 57, 57))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(38, 38, 38)
                            .addComponent(jLabel3)
                            .addGap(34, 34, 34)
                            .addComponent(jLabel4)
                            .addGap(36, 36, 36)
                            .addComponent(jLabel5))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtNM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(txtNT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(txtNQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtMid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtHF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHitung)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBatal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnKeluar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        this.dispose();
        new Menu_GUI();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        LogicNilai q = new LogicNilai();
        
        if ((txtNF.getText().equals("")) || 
           (txtNIM.getText().equals("")) || 
           (txtNM.getText().equals("")) ||
           (txtNT.getText().equals("")) || 
           (txtNQ.getText().equals("")) ||
           (txtMid.getText().equals(""))) {
           JOptionPane.showMessageDialog(null, "Data Masih Kosong!","Pesan Error",JOptionPane.ERROR_MESSAGE); 
        }else{
        
        q.setNIM(txtNIM.getText());
        q.setNM(txtNM.getText());
        q.setTugas(Double.parseDouble(txtNT.getText()));
        q.setQuiz(Double.parseDouble(txtNQ.getText()));
        q.setMid(Double.parseDouble(txtMid.getText()));
        q.setFinal(Double.parseDouble(txtNF.getText()));
        txtNA.setText(String.valueOf(q.getNA()));
        txtHF.setText(String.valueOf(q.getHM()));
        
        btnHitung.setEnabled(true);
        btnSimpan.setEnabled(true);
        btnEdit.setEnabled(true);
        btnHapus.setEnabled(true);
        btnBatal.setEnabled(true);
        
        }
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
        st = co.createStatement();
        if (edit) { // jika edit bernilai true maka
            st.executeUpdate("UPDATE data set " +"NIM='"+ txtNIM.getText() + "', "
            + "Nama='" + txtNM.getText() + "'," + "nilai_tugas='" + txtNT.getText()+ "', "
            + "nilai_quiz='" + txtNQ.getText()+ "', "+ "nilai_mid='" + txtMid.getText() + "',"
            + "nilai_final='" + txtNF.getText() + "'," + "nilai_akhir='" + txtNA.getText()+ "',"
            + "huruf='" + txtHF.getText()+ "'WHERE NIM ='" + sNIM + "' ");
        }else { 
        st.executeUpdate("INSERT INTO nilai VALUES('"+txtNIM.getText()+"','"+txtNM.getText()+"','"+txtNT.getText()+"','"+txtNQ.getText()
        +"','"+txtMid.getText()+"','"+txtNF.getText()+"','"+txtNA.getText()+"','"+txtHF.getText()+"')");
        }
        showdata("");
        if (edit){ 
            JOptionPane.showMessageDialog(null, "Update Berhasil");
        }
            else { 
            JOptionPane.showMessageDialog(null, "Simpan Berhasil");
        }
            RefreshForm();
        } 
            catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        txtNM.setEnabled(true);
        txtNT.setEnabled(true);
        txtNQ.setEnabled(true);
        txtNIM.setEnabled(true);
        txtMid.setEnabled(true);
        txtNF.setEnabled(true);
        txtHF.setText("");
        txtNA.setText("");
        
        btnSimpan.setText("Update"); 
        btnHitung.setEnabled(true);
        btnSimpan.setEnabled(true);
        btnEdit.setEnabled(true);
        btnHapus.setEnabled(true);
        btnBatal.setEnabled(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
     try {
        int jawab;
        if ((jawab = JOptionPane.showConfirmDialog(null,"Ingin menghapus data?", "konfirmasi",
            JOptionPane.YES_NO_OPTION)) == 0) { 
            st = co.createStatement();
            st.executeUpdate("DELETE FROM nilai WHERE NIM='"+ 
               ModelTab.getValueAt(jTable1.getSelectedRow(), 0) + "'"); 
            showdata(""); // tampil data.
            RefreshForm(); // memanggil metode refresh.
        }
        } catch (Exception e) {
          e.printStackTrace();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        RefreshForm();
    }//GEN-LAST:event_btnBatalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtHF;
    private javax.swing.JTextField txtMid;
    private javax.swing.JTextField txtNA;
    private javax.swing.JTextField txtNF;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtNM;
    private javax.swing.JTextField txtNQ;
    private javax.swing.JTextField txtNT;
    // End of variables declaration//GEN-END:variables
}

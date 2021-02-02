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
    String sId;
    
            
    public HitungNilaiGUI() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        judul();
        showdata("");
    }
    
    public final void judul() { // menentukan nama header/judul pada tabel
         Object[] judul = {"id","NIM", "Nama Mahasiswa", "Tugas", "Quiz", "Mid","Final","Akhir","Huruf Mutu"};
         ModelTab = new DefaultTableModel(null, judul);
         jTable1.setModel(ModelTab);
}
    
   public final void showdata(String where) { 
   try {
      st = co.createStatement();
      ModelTab.getDataVector().removeAllElements();
      ModelTab.fireTableDataChanged();
      rs = st.executeQuery("SELECT * FROM nilai " + where); 

      while (rs.next()) {
      Object[] data = {
        rs.getString("id"),
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
   edit=false;
}
   
   public final void RefreshForm() {
       txtID.setText("");
       txtNM.setText("");
       txtHF.setText("");
       txtMid.setText("");
       txtNA.setText("");
       txtNF.setText("");
       txtNIM.setText("");
       txtNQ.setText("");
       txtNT.setText("");
       
        autoNomor(ModelTab, "", 4, txtID);
        btnTambah.setEnabled(true);
        btnHitung.setEnabled(false);
        btnSimpan.setEnabled(false);
        btnEdit.setEnabled(true);
        btnHapus.setEnabled(true);
        btnBatal.setEnabled(false);
        btnSimpan.setText("Simpan");

      edit=false;
   }
   
    public void autoNomor(DefaultTableModel ModelTab,String strAwal,Integer pnj,javax.swing.JTextField teks){
        String s,s1;
        Integer j;
        s=Integer.toString(ModelTab.getRowCount()+1);
        j=s.length();
        s1="";
        for(int i = 1;i<=pnj-j;i++){
            s1=s1+"0";           
        }
        teks.setText(strAwal+s1+s);
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnTambah = new javax.swing.JButton();
        btnHitung = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNQ = new javax.swing.JTextField();
        txtNT = new javax.swing.JTextField();
        txtNIM = new javax.swing.JTextField();
        txtNM = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtMid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNF = new javax.swing.JTextField();
        txtNA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtHF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("PROGRAM PENGHITUNG NILAI MAHASISWA");

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Masukkan Perubahan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setForeground(new java.awt.Color(255, 204, 204));

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBatal, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setForeground(new java.awt.Color(255, 102, 255));

        jLabel10.setText("No. ID");

        jLabel2.setText("Nama Mahasiswa");

        jLabel3.setText("NIM");

        jLabel4.setText("Nilai Tugas");

        jLabel5.setText("Nilai Quiz");

        txtNQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNQActionPerformed(evt);
            }
        });

        txtNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIMActionPerformed(evt);
            }
        });

        jLabel6.setText("Nilai Mid");

        jLabel7.setText("Nilai Final");

        jLabel8.setText("Nilai Akhir");

        jLabel9.setText("Huruf Mutu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(89, 89, 89)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNQ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(68, 68, 68))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNM, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMid, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtHF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtMid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtHF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
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
        q.setTugas(Double.parseDouble(txtNT.getText()));
        q.setQuiz(Double.parseDouble(txtNQ.getText()));
        q.setMid(Double.parseDouble(txtMid.getText()));
        q.setFinal(Double.parseDouble(txtNF.getText()));
        txtNA.setText(String.valueOf(q.getNA()));
        txtHF.setText(String.valueOf(q.getHM()));
        
        btnHitung.setEnabled(true);
        btnSimpan.setEnabled(true);
        btnEdit.setEnabled(false);
        btnHapus.setEnabled(false);
        btnBatal.setEnabled(true);
        
        }
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
        st = co.createStatement();
        if (edit) { 
            st.executeUpdate("UPDATE nilai SET NIM = '" + txtNIM.getText() + "',"
            + "Nama = '" + txtNM.getText() + "'," + "nilai_tugas = '" + txtNT.getText()+ "', "
            + "nilai_quiz = '" + txtNQ.getText()+ "', "+ "nilai_mid = '" + txtMid.getText() + "',"
            + "nilai_final = '" + txtNF.getText() + "'," + "nilai_akhir = '" + txtNA.getText()+ "',"
            + "huruf = '" + txtHF.getText()+ "'WHERE id = '" +txtID.getText()+ "'");
        } else { 
        st.executeUpdate("INSERT INTO nilai VALUES('"+txtID.getText()+"','"+txtNIM.getText()+"','"+txtNM.getText()+"','"+txtNT.getText()+"','"+txtNQ.getText()
        +"','"+txtMid.getText()+"','"+txtNF.getText()+"','"+txtNA.getText()+"','"+txtHF.getText()+"')");
        }
        showdata("");
        if (edit = true){ 
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
        btnEdit.setEnabled(false);
        edit = true;
        txtNM.setEnabled(true);
        txtNT.setEnabled(true);
        txtNQ.setEnabled(true);
        txtNIM.setEnabled(true);
        txtMid.setEnabled(true);
        txtNF.setEnabled(true);
        btnSimpan.setText("Update");
        
        btnSimpan.setEnabled(false);
        btnHapus.setEnabled(false);
        btnBatal.setEnabled(true);
        btnTambah.setEnabled(false);
        txtNA.setEnabled(false);
        txtHF.setEnabled(false);
        jButton1.setEnabled(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
     try {
        int jawab;
        if ((jawab = JOptionPane.showConfirmDialog(null,"Ingin menghapus data?", "konfirmasi",
            JOptionPane.YES_NO_OPTION)) == 0) { 
            st = co.createStatement();
            st.executeUpdate("DELETE FROM nilai WHERE id='"+ 
               ModelTab.getValueAt(jTable1.getSelectedRow(), 0) + "'"); 
            st.executeUpdate("ALTER TABLE nilai DROP id");
            st.executeUpdate("ALTER TABLE nilai ADD id INT NOT NULL AUTO_INCREMENT PRIMARY KEY FIRST");
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String id = jTable1.getValueAt(baris,0).toString();
        txtID.setText(id);
        String nim = jTable1.getValueAt(baris,1).toString();
        txtNIM.setText(nim);
        String nama = jTable1.getValueAt(baris,2).toString();
        txtNM.setText(nama);
        String tugas = jTable1.getValueAt(baris,3).toString();
        txtNT.setText(tugas);
        String quiz = jTable1.getValueAt(baris,4).toString();
        txtNQ.setText(quiz);
        String mid = jTable1.getValueAt(baris,5).toString();
        txtMid.setText(mid);
        String nfinal = jTable1.getValueAt(baris,6).toString();
        txtNF.setText(nfinal);
        String nakhir = jTable1.getValueAt(baris,7).toString();
        txtNA.setText(nakhir);
        String huruf = jTable1.getValueAt(baris,8).toString();
        txtHF.setText(huruf);
        
        btnHitung.setEnabled(true);
        btnSimpan.setEnabled(false);
        btnHapus.setEnabled(true);
        btnBatal.setEnabled(true);
        btnHitung.setEnabled(false);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIMActionPerformed

    }//GEN-LAST:event_txtNIMActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       btnSimpan.setEnabled(false);
       btnBatal.setEnabled(true);
       btnEdit.setEnabled(false);
       btnHapus.setEnabled(false);
       btnBatal.setEnabled(true);
       btnHitung.setEnabled(true);
        LogicNilai k = new LogicNilai();
        k.setid(txtID.getText());
        k.setNIM(txtNIM.getText());
        k.setNM(txtNM.getText());
        k.setTugas(Double.parseDouble(txtNT.getText()));
        k.setQuiz(Double.parseDouble(txtNQ.getText()));
        k.setMid(Double.parseDouble(txtMid.getText()));
        k.setFinal(Double.parseDouble(txtNF.getText()));
        k.setAkhir(Double.parseDouble(txtNA.getText()));
        k.setHuruf(txtHF.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        btnHitung.setEnabled(false);
        btnSimpan.setEnabled(false);
        btnEdit.setEnabled(true);
        btnHapus.setEnabled(true);
        btnBatal.setEnabled(false);
        btnTambah.setEnabled(true);
        jButton1.setEnabled(false);
        
        autoNomor(ModelTab, "", 4, txtID);
        txtNM.setEnabled(false);
        txtNT.setEnabled(false);
        txtNQ.setEnabled(false);
        txtNIM.setEnabled(false);
        txtMid.setEnabled(false);
        txtNF.setEnabled(false);
        txtNA.setEnabled(false);
        txtHF.setEnabled(false);
        txtID.setEnabled(false);
        edit=false;
    }//GEN-LAST:event_formWindowActivated

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        edit=false;
        RefreshForm();
        btnHitung.setEnabled(true);
        btnSimpan.setEnabled(true);
        btnEdit.setEnabled(false);
        btnHapus.setEnabled(false);
        btnBatal.setEnabled(true);
        btnTambah.setEnabled(true);
        
        txtNM.setEnabled(true);
        txtNT.setEnabled(true);
        txtNQ.setEnabled(true);
        txtNIM.setEnabled(true);
        txtMid.setEnabled(true);
        txtNF.setEnabled(true);
        txtNA.setEnabled(false);
        txtHF.setEnabled(false);
        txtID.setEnabled(false);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtNQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNQActionPerformed

    }//GEN-LAST:event_txtNQActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtHF;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMid;
    private javax.swing.JTextField txtNA;
    private javax.swing.JTextField txtNF;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtNM;
    private javax.swing.JTextField txtNQ;
    private javax.swing.JTextField txtNT;
    // End of variables declaration//GEN-END:variables
}

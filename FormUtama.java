
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anisha
 */
public class FormUtama extends javax.swing.JFrame {
    private DefaultTableModel tablemodel;
    private Connection connection;

    /**
     * Creates new form FormUtama
     */
    public FormUtama() {
        initComponents();
        initTable();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNIM = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        cmbJenis = new javax.swing.JComboBox<>();
        cmbFakultas = new javax.swing.JComboBox<>();
        cmbJurusan = new javax.swing.JComboBox<>();
        cmbAngkatan = new javax.swing.JComboBox<>();

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIM");

        jLabel2.setText("Nama");

        jLabel3.setText("Jenis Kelamin");

        jLabel4.setText("Tanggal Lahir");

        jLabel5.setText("Alamat");

        jLabel6.setText("Fakultas");

        jLabel7.setText("Jurusan");

        jLabel8.setText("Angkatan");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
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

        jLabel9.setText("Cari berdasarkan NIM Mahasiswa");

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        txtTanggal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));

        jButton1.setText("Refresh");

        tblData.setModel(new javax.swing.table.DefaultTableModel(
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
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        cmbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Kelamin", "Laki - Laki", "Perempuan" }));

        cmbFakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Fakultas", "Ekonomi", "Teknik" }));

        cmbJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jurusan", "Teknik Informatika", "Teknik Arsitektur", "Teknik Lingkungan", "Ekonomi Manajemen", "Ekonomi Syari'ah", "Akuntansi" }));

        cmbAngkatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Angkatan", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .addComponent(txtNIM)
                                .addComponent(txtTanggal)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbAngkatan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbJurusan, javax.swing.GroupLayout.Alignment.LEADING, 0, 140, Short.MAX_VALUE)
                                .addComponent(cmbFakultas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCari)))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(cmbFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(cmbJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbAngkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnBatal))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        int pilihan1 = 0;
        int pilihan2 = 0;
        int pilihan3 = 0;
        int pilihan4 = 0;
         //mengambil inputan dari form
        String nim = txtNIM.getText();
        String nama = txtNama.getText();
        String jenis_kelamin = "";
        pilihan1 = cmbJenis.getSelectedIndex();
        if(pilihan1==0){ jenis_kelamin ="";}
        if(pilihan1==1){ jenis_kelamin ="Laki - Laki";}
        if(pilihan1==2){ jenis_kelamin ="Perempuan";}
        Date tanggal = (Date) txtTanggal.getValue();
        String alamat = txtAlamat.getText();
        String fakultas = "";
        pilihan2 = cmbFakultas.getSelectedIndex();
        if(pilihan2==0){ fakultas ="";}
        if(pilihan2==1){ fakultas ="Ekonomi";}
        if(pilihan2==2){ fakultas ="Teknik";}
        String jurusan = "";
        pilihan3 = cmbJurusan.getSelectedIndex();
        if(pilihan3==0){ jurusan ="";}
        if(pilihan3==1){ jurusan ="Teknik Informatika";}
        if(pilihan3==2){ jurusan ="Teknik Arsitektur";}
        if(pilihan3==3){ jurusan ="Teknik Lingkungan";}
        if(pilihan3==4){ jurusan ="Ekonomi Manajemen";}
        if(pilihan3==5){ jurusan ="Ekonomi Syari'ah";}
        if(pilihan3==6){ jurusan ="Akuntansi";}
        String angkatan = "";
        pilihan4 = cmbAngkatan.getSelectedIndex();
        if(pilihan4==0){ angkatan ="";}
        if(pilihan4==1){ angkatan ="2010";}
        if(pilihan4==2){ angkatan ="2011";}
        if(pilihan4==3){ angkatan ="2012";}
        if(pilihan4==4){ angkatan ="2013";}
        if(pilihan4==5){ angkatan ="2014";}
        if(pilihan4==6){ angkatan ="2015";}
        if(pilihan4==7){ angkatan ="2016";}
        if(pilihan4==8){ angkatan ="2017";}
        if(pilihan4==9){ angkatan ="2018";}
        
        //masukkan data ke database
        connection = DBConnection.getconnection();
        String query = "INSERT INTO biodata_mhs"
                + "(nim, nama, jenis_kelamin, tanggal_lahir, alamat, fakultas, jurusan, angkatan)"
                + "VALUES (?,?,?,?,?,?,?,?)";
        try {
          PreparedStatement statement= (PreparedStatement) connection.prepareStatement(query);
          
          statement.setString(1, nim);
          statement.setString(2, nama);
          statement.setString(3, jenis_kelamin);
          statement.setDate(4, new java.sql.Date(tanggal.getTime()));
          statement.setString(5, alamat);
          statement.setString(6, fakultas);
          statement.setString(7, jurusan);
          statement.setString(8, angkatan);
          
          statement.executeUpdate();
        } 
        catch (SQLException ex){
          JOptionPane.showMessageDialog(this, "Terjadi error pada saat input data");
          
        } finally {
          loadData();
          reset();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:

        loadData();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
       int pilihan1 = 0;
       int pilihan2 = 0;
       int pilihan3 = 0;
       int pilihan4 = 0;
        //method untuk menyeleksi data yg akan diubah
        int row = tblData.getSelectedRow();
        if (row==-1){
            return;
        }
        
        //mengambil inputan untuk data yg akan diubah
        String nim = txtNIM.getText();
        String nama = txtNama.getText();
        String jenis_kelamin = "";
        pilihan1 = cmbJenis.getSelectedIndex();
        if(pilihan1==0){ jenis_kelamin ="";}
        if(pilihan1==1){ jenis_kelamin ="Laki - Laki";}
        if(pilihan1==2){ jenis_kelamin ="Perempuan";}
        Date tanggal = (Date) txtTanggal.getValue();
        String alamat = txtAlamat.getText();
        String fakultas = "";
        pilihan2 = cmbFakultas.getSelectedIndex();
        if(pilihan2==0){ fakultas ="";}
        if(pilihan2==1){ fakultas ="Ekonomi";}
        if(pilihan2==2){ fakultas ="Teknik";}
        String jurusan = "";
        pilihan3 = cmbJurusan.getSelectedIndex();
        if(pilihan3==0){ jurusan ="";}
        if(pilihan3==1){ jurusan ="Teknik Informatika";}
        if(pilihan3==2){ jurusan ="Teknik Arsitektur";}
        if(pilihan3==3){ jurusan ="Teknik Lingkungan";}
        if(pilihan3==4){ jurusan ="Ekonomi Manajemen";}
        if(pilihan3==5){ jurusan ="Ekonomi Syari'ah";}
        if(pilihan3==6){ jurusan ="Akuntansi";}
        String angkatan = "";
        pilihan4 = cmbAngkatan.getSelectedIndex();
        if(pilihan4==0){ angkatan ="";}
        if(pilihan4==1){ angkatan ="2010";}
        if(pilihan4==2){ angkatan ="2011";}
        if(pilihan4==3){ angkatan ="2012";}
        if(pilihan4==4){ angkatan ="2013";}
        if(pilihan4==5){ angkatan ="2014";}
        if(pilihan4==6){ angkatan ="2015";}
        if(pilihan4==7){ angkatan ="2016";}
        if(pilihan4==8){ angkatan ="2017";}
        if(pilihan4==9){ angkatan ="2018";}
        
        //lakukan perubahan data ke database
        connection = DBConnection.getconnection();
        String query = "UPDATE biodata_mhs SET "
            + "nama=?,jenis_kelamin=?, tanggal_lahir=?, alamat=?, fakultas=?, jurusan=?, angkatan=?"
            + "WHERE nim=?";
        try {
            PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, nama);
            statement.setString(2, jenis_kelamin);
            statement.setDate(3, new java.sql.Date(tanggal.getTime()));
            statement.setString(4, alamat);
            statement.setString(5, fakultas);
            statement.setString(6, jurusan);
            statement.setString(7, angkatan);
            statement.setString(8, nim);
            
            statement.executeUpdate();
             JOptionPane.showMessageDialog(this, "Data Berhasil di Ubah");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi error pada saat update data");
        } finally {
            loadData();
            reset();
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        //method seleksi data yg akan diubah
        int row = tblData.getSelectedRow();
        if (row==-1){
            return;
        }
        
        //mengambil inputan untuk data yg akan diubah
        String nim = (String) tablemodel.getValueAt(row, 0);
        
        //lakukan perubahan data ke db
        connection = DBConnection.getconnection();
        String query = "DELETE FROM biodata_mhs WHERE nim=?";
        
        try {
            PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, nim);
            statement.executeUpdate();            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi error pada saat delete data");
        } finally {
          loadData();  
          reset();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        // TODO add your handling code here:
        tablemodel.getDataVector().removeAllElements();
        
        //pemberitahuan bahwa tabel telah kosong
        tablemodel.fireTableDataChanged();
        
        try {
          String cari = txtCari.getText();
          
          connection = DBConnection.getconnection();
          String query = "SELECT * FROM biodata_mhs WHERE nim LIKE '%"+cari+"%'";
          
          Statement statement = (Statement) connection.createStatement();
          ResultSet resultSet = statement.executeQuery(query);
          
          while (resultSet.next()){
              Object[] biodata_mhs = new Object[8];
                biodata_mhs[0] = resultSet.getString("nim");
                biodata_mhs[1] = resultSet.getString("nama");
                biodata_mhs[2] = resultSet.getString("jenis_kelamin");
                biodata_mhs[3] = resultSet.getString("tanggal_lahir");
                biodata_mhs[4] = resultSet.getString("alamat");
                biodata_mhs[5] = resultSet.getString("fakultas");
                biodata_mhs[6] = resultSet.getString("jurusan");
                biodata_mhs[7] = resultSet.getString("angkatan");
                tablemodel.addRow(biodata_mhs);
          }
          
          resultSet.close(); //menutup result set
          statement.close(); //menutup statement
          
        } catch (SQLException ex) {
          System.out.println(ex.getMessage());  
        }
    }//GEN-LAST:event_txtCariKeyReleased

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        try {
            //mendapatkan baris yang terseleksi
            int row=tblData.getSelectedRow();
            if (row==-1) {
                return;
            }
        
            //mengambil data dan ditampung
            String nim = (String) tablemodel.getValueAt(row, 0);
            String nama = (String) tablemodel.getValueAt(row, 1);
            String jenis_kelamin = (String) tablemodel.getValueAt(row, 2);
            String tanggal_lahir = (String) tablemodel.getValueAt(row, 3);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date=sdf.parse(tanggal_lahir);
            String alamat = (String) tablemodel.getValueAt(row, 4);
            String fakultas = (String) tablemodel.getValueAt(row, 5);
            String jurusan = (String) tablemodel.getValueAt(row, 6);
            String angkatan = (String) tablemodel.getValueAt(row, 7);
           

            //memberi data di setiap inputan
            txtNIM.setText(nim);
            txtNama.setText(nama);
            cmbJenis.setSelectedItem(tablemodel.getValueAt(row, 2).toString());
            txtTanggal.setValue(date);
            txtAlamat.setText(alamat);
            cmbFakultas.setSelectedItem(tablemodel.getValueAt(row, 5).toString());
            cmbJurusan.setSelectedItem(tablemodel.getValueAt(row, 6).toString());
            cmbAngkatan.setSelectedItem(tablemodel.getValueAt(row, 7).toString());
            
        } catch (ParseException ex) {
            Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblDataMouseClicked

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
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cmbAngkatan;
    private javax.swing.JComboBox<String> cmbFakultas;
    private javax.swing.JComboBox<String> cmbJenis;
    private javax.swing.JComboBox<String> cmbJurusan;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblData;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtNama;
    private javax.swing.JFormattedTextField txtTanggal;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        tablemodel = new DefaultTableModel();
        tblData.setModel(tablemodel);
        tablemodel.addColumn("nim");
        tablemodel.addColumn("nama");
        tablemodel.addColumn("jenis_kelamin");
        tablemodel.addColumn("tanggal_lahir");
        tablemodel.addColumn("alamat");
        tablemodel.addColumn("fakultas");
        tablemodel.addColumn("jurusan");
        tablemodel.addColumn("angkatan");
    }

    private void loadData() {
        //menghapus seluruh data yg ada di tabel
        tablemodel.getDataVector().removeAllElements();
        //pemberitahuan tabel telah kosong
        tablemodel.fireTableDataChanged();
        
        try{
            connection = DBConnection.getconnection();
            String query = "SELECT * FROM biodata_mhs";
            
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            //mengisi tabel dgn data hasil query
            while (resultSet.next()){
                Object[] biodata_mhs = new Object[8];
                biodata_mhs[0] = resultSet.getString("nim");
                biodata_mhs[1] = resultSet.getString("nama");
                biodata_mhs[2] = resultSet.getString("jenis_kelamin");
                biodata_mhs[3] = resultSet.getString("tanggal_lahir");
                biodata_mhs[4] = resultSet.getString("alamat");
                biodata_mhs[5] = resultSet.getString("fakultas");
                biodata_mhs[6] = resultSet.getString("jurusan");
                biodata_mhs[7] = resultSet.getString("angkatan");
                tablemodel.addRow(biodata_mhs);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void reset(){
        txtNIM.setText("");
        txtNama.setText("");
        cmbJenis.setSelectedIndex(0);
        txtTanggal.setValue(new java.util.Date());
        txtAlamat.setText("");
        cmbFakultas.setSelectedIndex(0);
        cmbJurusan.setSelectedIndex(0);
        cmbAngkatan.setSelectedIndex(0);
        txtCari.setText("");
    }
}

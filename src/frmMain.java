
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNIS = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtEmail = new javax.swing.JTextField();
        txtKelas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        txtHobi = new javax.swing.JTextField();
        txtNo = new javax.swing.JTextField();
        btnTKJ = new javax.swing.JRadioButton();
        btnRPL = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel16.setFont(new java.awt.Font("KG Blank Space Solid", 0, 24)); // NOI18N
        jLabel16.setText("FORM BIODATA SISWA");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(210, 10, 340, 70);

        jLabel3.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jLabel3.setText("NIS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 100, 50, 30);

        txtNIS.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtNIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNISActionPerformed(evt);
            }
        });
        getContentPane().add(txtNIS);
        txtNIS.setBounds(120, 100, 210, 30);

        txtNama.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama);
        txtNama.setBounds(120, 140, 210, 30);

        jLabel4.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jLabel4.setText("Nama");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 150, 80, 20);

        jLabel11.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jLabel11.setText("Jenis Kelamin");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 190, 140, 20);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jRadioButton1.setText("Laki-Laki");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(130, 190, 130, 30);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jRadioButton2.setText("Perempuan");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(130, 220, 140, 29);

        txtEmail.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(120, 260, 210, 30);

        txtKelas.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        txtKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKelasActionPerformed(evt);
            }
        });
        getContentPane().add(txtKelas);
        txtKelas.setBounds(120, 300, 210, 30);

        txtAlamat.setColumns(20);
        txtAlamat.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(440, 100, 210, 80);

        jLabel2.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jLabel2.setText("Alamat");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 100, 100, 20);

        jLabel12.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jLabel12.setText("Kelas");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 300, 100, 20);

        jLabel7.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jLabel7.setText("Email");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 260, 100, 20);

        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "NAMA", "JK", "EMAIL", "KELAS", "ALAMAT", "JURUSAN", "NO HP", "HOBI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 410, 690, 170);

        jButton3.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jButton3.setText("SAVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 350, 80, 40);

        jButton1.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 350, 100, 40);

        jButton2.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jButton2.setText("REFRESH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 350, 100, 40);

        jButton4.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(230, 350, 80, 40);

        jButton5.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jButton5.setText("EDIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(430, 350, 80, 40);

        jButton6.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jButton6.setText("QUIT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(530, 350, 80, 40);

        jButton7.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jButton7.setText("PRINT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(620, 350, 80, 40);

        txtHobi.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        txtHobi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHobiActionPerformed(evt);
            }
        });
        getContentPane().add(txtHobi);
        txtHobi.setBounds(440, 300, 210, 30);

        txtNo.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        txtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNo);
        txtNo.setBounds(440, 260, 210, 30);

        buttonGroup2.add(btnTKJ);
        btnTKJ.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        btnTKJ.setText("TKJ");
        btnTKJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKJActionPerformed(evt);
            }
        });
        getContentPane().add(btnTKJ);
        btnTKJ.setBounds(440, 220, 140, 29);

        buttonGroup2.add(btnRPL);
        btnRPL.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        btnRPL.setText("RPL");
        btnRPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRPLActionPerformed(evt);
            }
        });
        getContentPane().add(btnRPL);
        btnRPL.setBounds(440, 190, 130, 30);

        jLabel14.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jLabel14.setText("Jurusan");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(370, 190, 90, 20);

        jLabel15.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jLabel15.setText("No Hp");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(370, 260, 120, 20);

        jLabel6.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jLabel6.setText("Hobi");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(370, 300, 90, 20);

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);
        jPanel4.add(jPanel5);
        jPanel5.setBounds(10, 340, 710, 270);

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);
        jPanel6.add(jPanel7);
        jPanel7.setBounds(10, 340, 710, 270);

        jPanel4.add(jPanel6);
        jPanel6.setBounds(10, 340, 710, 270);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(10, 340, 710, 270);

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(255, 204, 204));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);
        jPanel8.add(jPanel9);
        jPanel9.setBounds(10, 340, 710, 270);

        jPanel10.setBackground(new java.awt.Color(255, 204, 204));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(null);

        jPanel11.setBackground(new java.awt.Color(255, 204, 204));
        jPanel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(null);
        jPanel10.add(jPanel11);
        jPanel11.setBounds(10, 340, 710, 270);

        jPanel8.add(jPanel10);
        jPanel10.setBounds(10, 340, 710, 270);

        jPanel2.add(jPanel8);
        jPanel8.setBounds(10, 340, 710, 270);

        jPanel12.setBackground(new java.awt.Color(204, 255, 255));
        jPanel12.setForeground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(null);
        jPanel2.add(jPanel12);
        jPanel12.setBounds(10, 80, 710, 260);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 740, 620);

        setSize(new java.awt.Dimension(748, 661));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNISActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKelasActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int baris = jTable1.getSelectedRow();
        if (baris != 1) {
            txtNIS.setText(jTable1.getValueAt(baris, 0).toString());
            txtNama.setText(jTable1.getValueAt(baris, 1).toString());
            if ("Laki-Laki".equals(jTable1.getValueAt(baris, 2).toString())) {
                jRadioButton1.setSelected(true);
            } else {
                jRadioButton2.setSelected(true);
            }
            txtKelas.setText(jTable1.getValueAt(baris, 3).toString());
            txtEmail.setText(jTable1.getValueAt(baris, 4).toString());
            txtAlamat.setText(jTable1.getValueAt(baris, 5).toString());
            if ("RPL".equals(jTable1.getValueAt(baris, 6).toString())) {
                btnRPL.setSelected(true);
            } else {
                btnTKJ.setSelected(true);
            }
            txtNo.setText(jTable1.getValueAt(baris, 7).toString());
            txtHobi.setText(jTable1.getValueAt(baris, 8).toString());

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if ("".equals(txtNIS.getText()) || "".equals(txtNama.getText()) || "".equals(txtKelas.getText()) || "".equals(txtAlamat.getText()) || "".equals(txtEmail.getText()) || "".equals(txtNo.getText()) || "".equals(txtHobi.getText())) {
            jOptionPane1.showMessageDialog(this, "Harap Lengkapi Data", "Error", jOptionPane1.WARNING_MESSAGE);
        } else {
            String jk = "";
            if (jRadioButton1.isSelected()) {
                jk = "L";
            } else {
                jk = "P";
            }

            String jurusan = "";
            if (btnRPL.isSelected()) {
                jurusan = "RPL";
            } else {
                jurusan = "TKJ";
            }

            String SQL = "INSERT INTO t_siswa " + "VALUES('" + txtNIS.getText()
            + "','" + txtNama.getText() + "', '"
            + jk + "','"
            + txtKelas.getText()+"','"
            + txtEmail.getText()+"','"
            + txtAlamat.getText()+"','"
            + jurusan + "','"
            + txtNo.getText()+"', '"
            + txtHobi.getText() + "')";

            int status = KoneksiDB.execute(SQL);
            if (status == 1){
                jOptionPane1.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", jOptionPane1.INFORMATION_MESSAGE);
                selectData();
            } else {
                jOptionPane1.showMessageDialog(this, "Data gagal ditambahkan", "Sukses", jOptionPane1.WARNING_MESSAGE);
            }

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int baris = jTable1.getSelectedRow();
        if(baris != -1) {
            String NIS = jTable1.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM t_siswa WHERE NIS='"+NIS+"'";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                jOptionPane1.showMessageDialog(this, "Data berhasil dihapus", "Sukses", jOptionPane1.INFORMATION_MESSAGE);
            } else {
                jOptionPane1.showMessageDialog(this, "Data gagal dihapus", "Gagal", jOptionPane1.WARNING_MESSAGE);
            }
        } else {
            jOptionPane1.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu", "Error", jOptionPane1.WARNING_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        selectData();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        txtNama.setText("");
        txtNIS.setText("");
        txtKelas.setText("");
        buttonGroup1.clearSelection();
        txtEmail.setText("");
        txtAlamat.setText("");
        buttonGroup2.clearSelection();
        txtNo.setText("");
        txtHobi.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    
     public void selectData(){
        String kolom[] = {"NIS","NamaSiswa","JenisKelamin","Kelas","Email","Alamat","Jurusan","NoHP","Hobi"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM t_siswa";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try {
            while(rs.next()){
                
                
                String NIS = rs.getString(1);
                String NamaSiswa = rs.getString(2);
                String JenisKelamin = "";
                if ("L".equals(rs.getString(3))) {
                    JenisKelamin = "Laki-Laki";
                } else {
                    JenisKelamin = "Perempuan";
                }
                String Kelas = rs.getString(4);
                String Email = rs.getString(5);
                String Alamat = rs.getString(6);
                String Jurusan = "";
                if ("RPL".equals(rs.getString(7))) {
                    Jurusan = "RPL";
                } else {
                    Jurusan = "TKJ";
                }
                String NoHP = rs.getString(8);
                String Hobi = rs.getString(9);
                String data[] = {NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat,Jurusan,NoHP,Hobi};
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTable1.setModel(dtm);
    }
     
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if ("".equals(txtNIS.getText()) || "".equals(txtNama.getText()) || "".equals(txtKelas.getText()) || "".equals(txtAlamat.getText()) || "".equals(txtEmail.getText())|| "".equals(txtNo.getText())|| "".equals(txtHobi.getText())) {
            jOptionPane1.showMessageDialog(this, "Harap Lengkapi Data", "Error", jOptionPane1.WARNING_MESSAGE);
        } else {
            String JK = "";
            if (jRadioButton1.isSelected()) {
                JK = "L";
            } else {
                JK = "P";
            }

            String jurusan = "";
            if (btnRPL.isSelected()) {
                jurusan = "RPL";
            } else {
                jurusan = "TKJ";
            }

            String SQL = "UPDATE t_siswa SET "
            + "NamaSiswa='"+txtNama.getText()+"', "
            + "JenisKelamin='"+JK+"', "
            + "Kelas='"+txtKelas.getText()+"', "
            + "Email='"+txtEmail.getText()+"', "
            + "Alamat='"+txtAlamat.getText()+"', "
            + "Jurusan='"+jurusan+"', "
            + "NoHP='"+txtNo.getText()+"', "
            + "Hobi='"+txtHobi.getText()+"' WHERE NIS='"+txtNIS.getText()+"'";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                jOptionPane1.showMessageDialog(this, "Data berhasil diupdate", "Sukses", jOptionPane1.INFORMATION_MESSAGE);
                selectData();
            } else {
                jOptionPane1.showMessageDialog(this, "Data gagal diupdate", "Sukses", jOptionPane1.WARNING_MESSAGE);
            }
        }
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        MessageFormat header = new MessageFormat("Biodata Siswa");
        MessageFormat footer = new MessageFormat("Page (0,number,integer)       ");
        try {
            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot print %s%n", e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtHobiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHobiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHobiActionPerformed

    private void txtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoActionPerformed

    private void btnTKJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTKJActionPerformed

    private void btnRPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRPLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRPLActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnRPL;
    private javax.swing.JRadioButton btnTKJ;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHobi;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNIS;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNo;
    // End of variables declaration//GEN-END:variables
}

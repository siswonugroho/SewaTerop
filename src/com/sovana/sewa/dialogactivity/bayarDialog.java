/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sovana.sewa.dialogactivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.sovana.sewa.connection.Connect;
import com.sovana.sewa.mainactivity.Main;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class bayarDialog extends javax.swing.JDialog {

    /**
     * Creates new form tambahSewaDialog
     */
    public bayarDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        errorInput.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addSewaMain = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        namaTextBayar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        alamatTextBayar = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        telpTextBayar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        errorInput = new javax.swing.JLabel();
        barangTextBayar = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jumlahBarangBayar = new javax.swing.JSpinner();
        totalBiayaBayar = new javax.swing.JTextField();
        hargaSatuanBayar = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jumlahBayar = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        kembalianBayar = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tglKembali = new com.github.lgooddatepicker.components.DatePicker();
        jLabel15 = new javax.swing.JLabel();
        tglSewa = new com.github.lgooddatepicker.components.DatePicker();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tambah sewaan baru");
        getContentPane().setLayout(new java.awt.CardLayout());

        addSewaMain.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setText("Pembayaran sewaan");
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jLabel13.setText("Nama penyewa");
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        namaTextBayar.setEditable(false);

        jLabel14.setText("Barang yang disewa");
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jLabel19.setText("Alamat penyewa");
        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        alamatTextBayar.setEditable(false);
        alamatTextBayar.setColumns(20);
        alamatTextBayar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        alamatTextBayar.setRows(5);
        jScrollPane3.setViewportView(alamatTextBayar);

        jLabel20.setText("No. telp");
        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        telpTextBayar.setEditable(false);

        jButton9.setText("Batal");
        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        btnTambah.setText("Bayar");
        btnTambah.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        errorInput.setText("Jumlah bayar harus angka!");
        errorInput.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        errorInput.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(errorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTambah)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jLabel21.setText("Jumlah");
        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jumlahBarangBayar.setEnabled(false);

        totalBiayaBayar.setEditable(false);
        totalBiayaBayar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        totalBiayaBayar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalBiayaBayar.setText("0");

        hargaSatuanBayar.setEditable(false);
        hargaSatuanBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaSatuanBayarActionPerformed(evt);
            }
        });

        jLabel23.setText("Harga per satuan");
        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jLabel24.setText("Jumlah bayar (Rp)");
        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jumlahBayar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jumlahBayar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jumlahBayar.setText("0");
        jumlahBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jumlahBayarKeyReleased(evt);
            }
        });

        jLabel25.setText("Kembalian (Rp)");
        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        kembalianBayar.setEditable(false);
        kembalianBayar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        kembalianBayar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        kembalianBayar.setText("0");

        jLabel26.setText("Total biaya (Rp)");
        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        tglKembali.setBackground(new java.awt.Color(255, 255, 255));
        tglKembali.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tglKembali.setPreferredSize(new java.awt.Dimension(144, 25));
        tglKembali.setSettings(null);
        tglKembali.setToolTipText("");
        tglKembali.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tglKembaliFocusGained(evt);
            }
        });
        tglKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tglKembaliMouseReleased(evt);
            }
        });

        jLabel15.setText("Tanggal kembali");
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        tglSewa.setDate(LocalDate.of(1970, 01, 01)
        );
        tglSewa.setBackground(new java.awt.Color(255, 255, 255));
        tglSewa.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tglSewa.setPreferredSize(new java.awt.Dimension(144, 25));
        tglSewa.setSettings(null);
        tglSewa.setToolTipText("");
        tglSewa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tglSewaFocusGained(evt);
            }
        });
        tglSewa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tglSewaMouseReleased(evt);
            }
        });

        jLabel16.setText("Tanggal sewa");
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        tglKembali.getComponentToggleCalendarButton().setIcon(new ImageIcon(getClass().getResource("/com/sovana/sewa/images/Calendar-icon.png")));
        tglKembali.getComponentToggleCalendarButton().setText("");
        tglKembali.setLocale(new Locale("id", "ID"));  
        tglKembali.setDateToToday();
        tglSewa.getComponentToggleCalendarButton().setVisible(false);
        tglSewa.getComponentDateTextField().setEditable(false);
        tglSewa.setLocale(new Locale("id", "ID"));

        javax.swing.GroupLayout addSewaMainLayout = new javax.swing.GroupLayout(addSewaMain);
        addSewaMain.setLayout(addSewaMainLayout);
        addSewaMainLayout.setHorizontalGroup(
            addSewaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(addSewaMainLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(addSewaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addSewaMainLayout.createSequentialGroup()
                        .addGroup(addSewaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addSewaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addSewaMainLayout.createSequentialGroup()
                                .addComponent(barangTextBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jumlahBarangBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telpTextBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(addSewaMainLayout.createSequentialGroup()
                        .addGroup(addSewaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addSewaMainLayout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hargaSatuanBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addSewaMainLayout.createSequentialGroup()
                                .addGroup(addSewaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addSewaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(addSewaMainLayout.createSequentialGroup()
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tglSewa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(addSewaMainLayout.createSequentialGroup()
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tglKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(addSewaMainLayout.createSequentialGroup()
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(namaTextBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel10))
                                .addGap(75, 75, 75)
                                .addGroup(addSewaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jumlahBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kembalianBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalBiayaBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(54, 54, Short.MAX_VALUE))))
        );
        addSewaMainLayout.setVerticalGroup(
            addSewaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSewaMainLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addGap(32, 32, 32)
                .addGroup(addSewaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tglSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(addSewaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(addSewaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addSewaMainLayout.createSequentialGroup()
                        .addGroup(addSewaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaTextBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(addSewaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(barangTextBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addSewaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel21)
                                .addComponent(jumlahBarangBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(addSewaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addSewaMainLayout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jumlahBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kembalianBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addSewaMainLayout.createSequentialGroup()
                                .addGroup(addSewaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hargaSatuanBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(addSewaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(addSewaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telpTextBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addSewaMainLayout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalBiayaBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(addSewaMain, "addSewaMain");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//    public void lastIdBayar(){
//            try{
//                String sql = "select max(id) from pembayaran";
//                java.sql.Connection conn=(Connection)Connect.configDB();
//                java.sql.Statement stm=conn.createStatement();
//                java.sql.ResultSet res=stm.executeQuery(sql);
//                while(res.next()){
//                    int nomer = res.getInt("max(id)")+1;
//                    idTextBayar.setText(Integer.toString(nomer));
//                }
//                
//            } catch(SQLException e){
//                JOptionPane.showMessageDialog(this, e.getMessage(), "Error",0);
//            }
//    }
    private void fillHargaBarang() {
        try {
            String sql = "select harga from barang where nama_barang = '" + barangTextBayar.getSelectedItem().toString() + "'";
            java.sql.Connection conn = (Connection) Connect.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                hargaSatuanBayar.setText(res.getString(1));
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        int totalBiaya = Integer.parseInt(hargaSatuanBayar.getText()) * Integer.parseInt(jumlahBarangBayar.getValue().toString());
        totalBiayaBayar.setText(Integer.toString(totalBiaya));
    }

    public void fillFormSewaan(String id_number) {
        try {
            String sql = "select*from sewaan where id = " + id_number;
            java.sql.Connection conn = (Connection) Connect.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                tglSewa.setDate(res.getDate(2).toLocalDate());
                namaTextBayar.setText(res.getString(3));
                barangTextBayar.addItem(res.getString(4));
                jumlahBarangBayar.setValue(Integer.parseInt(res.getString(5)));
                alamatTextBayar.setText(res.getString(6));
                telpTextBayar.setText(res.getString(7));
            }
            fillHargaBarang();
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        try {
            String sql = "INSERT INTO pembayaran (tgl_sewa, tgl_kembali, nama_penyewa, barang_sewaan, jumlah, harga_satuan, alamat, telp, total_biaya, jumlah_bayar, sisa) VALUES "
                    + "('" + tglSewa.getDateStringOrEmptyString()
                    + "','" + tglKembali.getDateStringOrEmptyString()
                    + "','" + namaTextBayar.getText()
                    + "','" + barangTextBayar.getSelectedItem().toString()
                    + "','" + jumlahBarangBayar.getValue().toString()
                    + "','" + hargaSatuanBayar.getText()
                    + "','" + alamatTextBayar.getText()
                    + "','" + telpTextBayar.getText()
                    + "','" + totalBiayaBayar.getText()
                    + "','" + jumlahBayar.getText()
                    + "','" + kembalianBayar.getText()
                    + "')";
            Connection conn = (Connection) Connect.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            conn.prepareStatement("ALTER TABLE pembayaran AUTO_INCREMENT=0").execute();
            pst.execute();

            Object[] labelBtn = {"Tutup", "Riwayat transaksi"};
            int berhasil = JOptionPane.showOptionDialog(null, "Transaksi berhasil.\nUntuk mencetak struk, buka riwayat transaksi.", "Sukses",
                    0, 1, null, labelBtn, null);
            if (berhasil == JOptionPane.NO_OPTION) {
                ((Main) getOwner()).goToPage("riwayat");
                dispose();
            } else if (berhasil == JOptionPane.YES_OPTION) {
                dispose();
            }
            ((Main) getOwner()).deleteSelectedRow();
            ((Main) getOwner()).showSummaryCount();

        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Jumlah bayar harus angka", "Error", 0);
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void hargaSatuanBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaSatuanBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaSatuanBayarActionPerformed

    private void jumlahBayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlahBayarKeyReleased
        try {
            int kembalian = Integer.parseInt(jumlahBayar.getText()) - Integer.parseInt(totalBiayaBayar.getText());
            kembalianBayar.setText(String.valueOf(kembalian));
        } catch (NumberFormatException e) {
            errorInput.setVisible(true);
        }
    }//GEN-LAST:event_jumlahBayarKeyReleased

    private void tglKembaliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tglKembaliFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_tglKembaliFocusGained

    private void tglKembaliMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tglKembaliMouseReleased

    }//GEN-LAST:event_tglKembaliMouseReleased

    private void tglSewaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tglSewaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tglSewaFocusGained

    private void tglSewaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tglSewaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tglSewaMouseReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bayarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bayarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bayarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bayarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                bayarDialog dialog = new bayarDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addSewaMain;
    private javax.swing.JTextArea alamatTextBayar;
    private javax.swing.JComboBox<String> barangTextBayar;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel errorInput;
    private javax.swing.JTextField hargaSatuanBayar;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jumlahBarangBayar;
    private javax.swing.JTextField jumlahBayar;
    private javax.swing.JTextField kembalianBayar;
    private javax.swing.JTextField namaTextBayar;
    private javax.swing.JTextField telpTextBayar;
    private com.github.lgooddatepicker.components.DatePicker tglKembali;
    private com.github.lgooddatepicker.components.DatePicker tglSewa;
    private javax.swing.JTextField totalBiayaBayar;
    // End of variables declaration//GEN-END:variables
}
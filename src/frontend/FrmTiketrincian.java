/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import java.sql.*;
import javax.swing.*;
import backend.*;

public class FrmTiketrincian extends javax.swing.JFrame {

    public FrmTiketrincian(int id_tiket) {
        initComponents();
        this.setLocationRelativeTo(null);
        ambilDataTabel(id_tiket);
    }

    public FrmTiketrincian() {
        initComponents();

    }

    private void ambilDataTabel(int id_tiket) {
        Tiket tiket = new Tiket().getById(id_tiket);
        String bus = "";
        int harga = 0;
        noktp.setText(tiket.getUser().getNo_ktp());
        nama.setText(tiket.getUser().getNama());
        notelp.setText(tiket.getUser().getNo_telp());
        alamat.setText(tiket.getUser().getAlamat());
        kotaawal.setText(tiket.getKotaAwal());
        kotatujuan.setText(tiket.getKotaAkhir());
        tanggal.setText(tiket.getTanggalBerangkat());
        jumlah.setText(String.valueOf(tiket.getJumlah()));
        int ae = tiket.getJumlah();
        if (tiket.getKotaAwal().equals("Malang")) {
            bus = "AKAS";
        } else if (tiket.getKotaAwal().equals("Lumajang")) {
            bus = "LADJU";
        } else {
            bus = "TJIPTO";
        }
        namabus.setText(bus);
        switch (kotaawal.getText()) {
            case "Malang":
                if (kotatujuan.getText().equals("Probolinggo")) {
                    harga = 20000;
                } else {
                    harga = 30000;
                }
                break;
            case "Probolinggo":
                if (kotatujuan.getText().equals("Malang")) {
                    harga = 20000;
                } else {
                    harga = 10000;
                }
                break;
            case "Lumajang":
                if (kotatujuan.getText().equals("Probolinggo")) {
                    harga = 10000;
                } else {
                    harga = 30000;
                }
                case "Semarang":
                if (kotatujuan.getText().equals("Probolinggo")) {
                    harga = 10000;
                } else {
                    harga = 30000;
                }
                break;
        }
        int totall = harga * ae;
        total.setText(Integer.toString(totall));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cetak = new javax.swing.JButton();
        total = new javax.swing.JLabel();
        namabus = new javax.swing.JLabel();
        kotatujuan = new javax.swing.JLabel();
        kotaawal = new javax.swing.JLabel();
        alamat = new javax.swing.JLabel();
        notelp = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        noktp = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jumlah = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nama Bus :");

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tanggal Berangkat :");

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total Estimasi :");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No. Telepon :");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alamat :");

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Dari Kota :");

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nama :");

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Menuju Kota :");

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("No. KTP");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("(!)Harap bawa bukti ini dan serahkan pada loket terminal");

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo4.png"))); // NOI18N
        jLabel4.setText("Rincian Tiket Anda");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        cetak.setBackground(new java.awt.Color(102, 102, 102));
        cetak.setForeground(new java.awt.Color(255, 255, 255));
        cetak.setText("Kembali");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });

        total.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setText("---");

        namabus.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        namabus.setForeground(new java.awt.Color(255, 255, 255));
        namabus.setText("---");

        kotatujuan.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        kotatujuan.setForeground(new java.awt.Color(255, 255, 255));
        kotatujuan.setText("---");

        kotaawal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        kotaawal.setForeground(new java.awt.Color(255, 255, 255));
        kotaawal.setText("---");

        alamat.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        alamat.setForeground(new java.awt.Color(255, 255, 255));
        alamat.setText("---");

        notelp.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        notelp.setForeground(new java.awt.Color(255, 255, 255));
        notelp.setText("---");

        nama.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        nama.setForeground(new java.awt.Color(255, 255, 255));
        nama.setText("---");

        noktp.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        noktp.setForeground(new java.awt.Color(255, 255, 255));
        noktp.setText("---");

        jLabel20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Jumlah Penumpang :");

        jumlah.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jumlah.setForeground(new java.awt.Color(255, 255, 255));
        jumlah.setText("---");

        tanggal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        tanggal.setForeground(new java.awt.Color(255, 255, 255));
        tanggal.setText("---");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(86, 86, 86))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(cetak))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(jLabel18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel16))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namabus)
                            .addComponent(total)
                            .addComponent(jumlah)
                            .addComponent(kotatujuan)
                            .addComponent(kotaawal)
                            .addComponent(alamat)
                            .addComponent(notelp)
                            .addComponent(nama)
                            .addComponent(noktp)
                            .addComponent(tanggal))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(noktp))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(nama))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(notelp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(alamat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(kotaawal))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(kotatujuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tanggal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jumlah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(namabus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(total))
                .addGap(44, 44, 44)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cetak)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
        new FrmHomeAdmin().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_cetakActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTiketrincian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamat;
    private javax.swing.JButton cetak;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jumlah;
    private javax.swing.JLabel kotaawal;
    private javax.swing.JLabel kotatujuan;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel namabus;
    private javax.swing.JLabel noktp;
    private javax.swing.JLabel notelp;
    private javax.swing.JLabel tanggal;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}

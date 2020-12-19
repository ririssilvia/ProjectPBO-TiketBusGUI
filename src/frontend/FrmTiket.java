/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.*;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class FrmTiket extends javax.swing.JFrame {
   
    //private Penumpang user;
    private User user;
    
    public FrmTiket(int id_user) {
        initComponents();
        tampilkanCmbIdbus();
        this.setLocationRelativeTo(null);
       
        this.user = new User().getById(id_user);
        
    }
    
    public FrmTiket() {
        initComponents();
        tampilkanCmbIdbus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kotaawal = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        kotatujuan = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jumlah = new javax.swing.JComboBox<String>();
        pesan = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        batal = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tglBerangkat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbidbus = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-customer-filled-50.png"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Tiket");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(594, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        kotaawal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Kota...", "Malang", "Probolinggo", "Lumajang", "Semarang" }));
        kotaawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotaawalActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kota Asal :");

        kotatujuan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Kota...", "Malang", "Probolinggo", "Lumajang" }));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kota Tujuan :");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tanggal Berangkat :");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jumlah Penumpang :");

        jumlah.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        pesan.setBackground(new java.awt.Color(102, 102, 102));
        pesan.setForeground(new java.awt.Color(255, 255, 255));
        pesan.setText("Pesan");
        pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Format : YYYY/MM/DD");

        batal.setBackground(new java.awt.Color(255, 51, 0));
        batal.setForeground(new java.awt.Color(255, 255, 255));
        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Isikan data destinasi anda!");

        tglBerangkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglBerangkatActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID bus :");

        cmbidbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbidbusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(batal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pesan))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbidbus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tglBerangkat)
                                    .addComponent(kotatujuan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kotaawal, 0, 226, Short.MAX_VALUE))
                                .addGap(13, 13, 13)
                                .addComponent(jLabel8)))))
                .addGap(0, 136, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(282, 282, 282))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kotaawal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kotatujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(tglBerangkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbidbus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesan)
                    .addComponent(batal))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kotaawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotaawalActionPerformed

    }//GEN-LAST:event_kotaawalActionPerformed

     public void tampilkanCmbIdbus(){
//         ArrayList<Bus> listBus = new Bus().getAll();
//         for (int i = 0; i < listBus.size(); i++) {
//            cmbidbus.addItem(listBus.get(i).getIdbus());
          cmbidbus.setModel(new DefaultComboBoxModel(new Supir().getAll().toArray()));
        }
//         cmbIdsupir.setModel(new DefaultComboBoxModel(new Supir().getAll().toArray()));
     
    
    private void pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanActionPerformed

        if (kotaawal.getSelectedItem().toString().equals("Pilih Kota...")){
            JOptionPane.showMessageDialog(this, "Pilih Kota awal!");
        } else if (kotatujuan.getSelectedItem().toString().equals("Pilih Kota...")){
            JOptionPane.showMessageDialog(this, "Pilih Kota tujuan!");
        } else if (tglBerangkat.getText().toString().equals("")){
            JOptionPane.showMessageDialog(this, "Tentukan tanggal(BULAN)!");
        } else if (jumlah.getSelectedItem().toString().equals("0")){
            JOptionPane.showMessageDialog(this, "Tentukan Jumlah Penumpang!");
        } else if (kotaawal.getSelectedItem().toString().equals(kotatujuan.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(this, "Masukkan destinasi antar kota berbeda!");
        }else{
            int jum = Integer.parseInt(jumlah.getSelectedItem().toString());
            int busid = Integer.parseInt(cmbidbus.getSelectedItem().toString());
            Tiket tiket = new Tiket();
            
            tiket.setKotaAwal(kotaawal.getSelectedItem().toString());
            tiket.setKotaAkhir(kotatujuan.getSelectedItem().toString());
            tiket.setBus(new Bus().getById(busid));
            tiket.setUser(new User().getById(this.user.getId_user()));
            tiket.setTanggalBerangkat(tglBerangkat.getText().toString());
            tiket.setJumlah(jum);
            tiket.save();
            
            JOptionPane.showMessageDialog(this, "Data Berhasil Ditambah"+tiket.getIdtiket());

            FrmTiketrincian tr = new FrmTiketrincian(tiket.getIdtiket());
            tr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_pesanActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        Tiket tiket = new Tiket().getById(user.getId_tiket());
        user.delete();
        tiket.delete();
        new FrmSampul().setVisible(true);
        this.dispose();
        
//        JOptionPane.showMessageDialog(this, "Data "+cmbidbus.getSelectedItem().toString());
//        diatas ini code untuk hapus data di database (button batal)
//        kalo pas tiket info dibatalkan jadi kehapus (tapi harus kasih method delete di class tiket nya)
    }//GEN-LAST:event_batalActionPerformed

    private void tglBerangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglBerangkatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglBerangkatActionPerformed

    private void cmbidbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbidbusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbidbusActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTiket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JComboBox cmbidbus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jumlah;
    private javax.swing.JComboBox<String> kotaawal;
    private javax.swing.JComboBox<String> kotatujuan;
    private javax.swing.JButton pesan;
    private javax.swing.JTextField tglBerangkat;
    // End of variables declaration//GEN-END:variables

}

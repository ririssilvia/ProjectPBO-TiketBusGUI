/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backend;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Supir {
    
   private int  idsupir;
   private String  nama;
   private String  alamat;
   private String  telepon;
   
   //konstruktor
    public Supir() {
        
    }
    
    //konstuktor berparamater
    public Supir(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    
    //geter dan setter
    public int getIdsupir() {
        return idsupir;
    }

    public void setIdsupir(int idsupir) {
        this.idsupir = idsupir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    

   //mengambil data sesuai dengan id 
     public Supir getById(int id) {
        Supir sop = new Supir();
        ResultSet rs = DBHelper.selectQuery("select * From supir "
                + "where idsupir = '" + id + "'");

        try {
            while (rs.next()) {
                sop = new Supir();
                  sop.setIdsupir(rs.getInt("idsupir"));
                  sop.setNama(rs.getString("nama"));
                  sop.setAlamat(rs.getString("alamat"));
                  sop.setTelepon(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sop;
    }
     
     //menampilkan data semua
        public ArrayList<Supir> getAll() {
        ArrayList<Supir> ListSopir = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("select * From supir");

        try {
            while (rs.next()) {
                Supir sop = new Supir();
                  sop.setIdsupir(rs.getInt("idsupir"));
                  sop.setNama(rs.getString("nama"));
                  sop.setAlamat(rs.getString("alamat"));
                  sop.setTelepon(rs.getString("telepon"));

                ListSopir.add(sop);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListSopir;
    }
        
     //cari data
        public ArrayList<Supir> search(String keyword) {
        ArrayList<Supir> ListSopir = new ArrayList();
        String sql = "select * from supir where "
                + "nama like '%" + keyword + "%' "
                + "or alamat like '%" + keyword + "%'; ";

        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Supir sop = new Supir();
                  sop.setIdsupir(rs.getInt("idsupir"));
                  sop.setNama(rs.getString("nama"));
                  sop.setAlamat(rs.getString("alamat"));
                  sop.setTelepon(rs.getString("telepon"));

                ListSopir.add(sop);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListSopir;
    }
        
    
        public void save() {
        if (getById(idsupir).getIdsupir() == 0) {
            String sql = "insert into supir ( nama, alamat, telepon) values("
                    + "'" + this.nama + "', "
                    + "'" + this.alamat + "', "
                    + "'" + this.telepon + "' "
                    + ")";
            this.idsupir= DBHelper.insertQueryGetId(sql);
        } else {
            String sql = "update supir set "
                    + "nama = '" + nama + "', "
                    + "alamat = '" + alamat + "', "
                    + "telepon = '" + telepon + "' "
                    + "where idsupir = '" + this.idsupir + "'";
            DBHelper.executeQuery(sql);
        }
    }
    
    public void delete() {
        String SQL = "DELETE FROM supir WHERE idsupir = '" + this.idsupir + "'";
        DBHelper.executeQuery(SQL);
    }
    
    
   @Override
     public String toString(){
        return Integer.toString(idsupir);
    }
}

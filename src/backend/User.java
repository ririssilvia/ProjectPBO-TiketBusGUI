/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backend;
import java.sql.*;
import java.util.*;
/**
 *
 * @author USER
 */
//public class Penumpang
public class User {
  private int id_user;
    private String no_ktp;
    private String nama;
    private String no_telp;
    private String alamat;
    private int id_tiket;
    private Tiket tiket;
    

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNo_ktp() {
        return no_ktp;
    }

    public void setNo_ktp(String no_ktp) {
        this.no_ktp = no_ktp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getId_tiket() {
        return id_tiket;
    }

    public void setId_tiket(int id_tiket) {
        this.id_tiket = id_tiket;
    }

    public Tiket getTiket() {
        return tiket;
    }

    public void setTiket(Tiket tiket) {
        this.tiket = tiket;
    }

    public User() {
    }

    public User(String no_ktp, String nama, String no_telp, String alamat) {
        this.no_ktp = no_ktp;
        this.nama = nama;
        this.no_telp = no_telp;
        this.alamat = alamat;
    }
    
    public User getById(int id){
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM user WHERE id_user = '" + id + "' ");
        return binderOne(rs);
    }
    
    public User getByKtp(String noKtp) {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM user WHERE no_ktp = '" + noKtp + "' ");
        return binderOne(rs);
    }
    
    public ArrayList<User> getAll() {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM user");
        return binderMany(rs);
    }
    
       public ArrayList<User> search(String keyword) {
        ArrayList<User> ListPenumpang = new ArrayList();
        String sql = "select * from penumpang where "
                + "nama like '%" + keyword + "%' "
                + "or no_ktp like '%" + keyword + "%'; ";

        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                User p = new User();
                  p.setId_user(rs.getInt("id_user"));
                  p.setNo_ktp(rs.getString("no_ktp"));
                  p.setNama(rs.getString("nama"));
                  p.setNo_telp(rs.getString("no_telp"));
                  p.setAlamat(rs.getString("alamat"));

                ListPenumpang.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPenumpang;
    }
    
    public void save() {
        if (getById(id_user).getId_user() == 0) {
            
            String SQL = "INSERT into user (no_ktp, nama, no_telp, alamat) VALUES ("
                    + " '" + this.no_ktp + "', "
                    + " '" + this.nama + "', "
                    + " '" + this.no_telp + "', "
                    + " '" + this.alamat + "'"
                    + ")";
            this.id_user = DBHelper.insertQueryGetId(SQL);
        }
    }
    
    public void delete() {
        String SQL = "DELETE FROM user WHERE id_user = '" + this.id_user + "'";
        DBHelper.executeQuery(SQL);
    }
    
    private ArrayList<User> binderMany(ResultSet rs) {
        ArrayList<User> listUser = new ArrayList();
        
        try {
            while (rs.next()) {                
                User user = new User();
                user.setId_user(rs.getInt("id_user"));
                user.setNo_ktp(rs.getString("no_ktp"));
                user.setNama(rs.getString("nama"));
                user.setNo_telp(rs.getString("no_telp"));
                user.setAlamat(rs.getString("alamat"));
                user.setId_tiket(rs.getInt("id_tiket"));
                user.setTiket(new Tiket().getById(user.getId_tiket()));
                listUser.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listUser;
    }
    
    private User binderOne(ResultSet rs) {
       User user = new User(); 
        try {
            while (rs.next()) {                
                user.setId_user(rs.getInt("id_user"));
                user.setNo_ktp(rs.getString("no_ktp"));
                user.setNama(rs.getString("nama"));
                user.setNo_telp(rs.getString("no_telp"));
                user.setAlamat(rs.getString("alamat"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }  
}

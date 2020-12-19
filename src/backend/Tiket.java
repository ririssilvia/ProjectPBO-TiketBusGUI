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
public class Tiket {
    private int idtiket;
    private String kotaAwal;
    private String kotaAkhir;
    private String tanggalBerangkat;
    private int jumlah;
    private User user = new User();
    private Bus bus = new Bus();

    public Tiket() {
        
    }

    public Tiket(Bus bus, String kotaAwal, String kotaAkhir, String tanggalBerangkat, int jumlah, User user) {
        this.bus = bus;
        this.kotaAwal = kotaAwal;
        this.kotaAkhir = kotaAkhir;
        this.tanggalBerangkat = tanggalBerangkat;
        this.jumlah = jumlah;
        this.user = user;
    }

    public int getIdtiket() {
        return idtiket;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    
    
    public void setIdtiket(int idtiket) {
        this.idtiket = idtiket;
    }

    public String getKotaAwal() {
        return kotaAwal;
    }

    public void setKotaAwal(String kotaAwal) {
        this.kotaAwal = kotaAwal;
    }

    public String getKotaAkhir() {
        return kotaAkhir;
    }

    public void setKotaAkhir(String kotaAkhir) {
        this.kotaAkhir = kotaAkhir;
    }

    public String getTanggalBerangkat() {
        return tanggalBerangkat;
    }

    public void setTanggalBerangkat(String tanggalBerangkat) {
        this.tanggalBerangkat = tanggalBerangkat;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

     public Tiket getById(int id) {
        Tiket tik = new Tiket();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                            +"      t.idtiket AS idtiket, "
                                            +"      t.kotaAwal AS kotaAwal, "
                                            +"      t.kotaAkhir AS KotaAkhir, "
                                            +"      t.tanggalBerangkat AS tanggalBerangkat, "
                                            +"      t.jumlah AS jumlah, "
                                            +"      b.idbus AS idbus, "
                                            +"      b.plat AS plat, "
                                            +"      b.kapasitas AS kapasitas, "
                                            +"      b.kelas AS kelas ,"
                                            +"      u.id_user AS id_user ,"
                                            +"      u.no_ktp AS no_ktp ,"
                                            +"      u.nama AS namauser ,"
                                            +"      u.no_telp AS no_telp ,"
                                            +"      u.alamat AS alamat"
                                            +"      FROM tiket t "
                                            +"      INNER JOIN bus b ON t.idbus = b.idbus"
                                            +"      INNER JOIN user u ON u.id_user = t.id_user"
                                            +"      WHERE t.idtiket = '"+ id + "'");
               

        try {
            while (rs.next()) {
                tik = new Tiket();
                tik.setIdtiket(rs.getInt("idtiket"));
                tik.setKotaAwal(rs.getString("kotaAwal"));
                tik.setKotaAkhir(rs.getString("kotaAkhir"));
                tik.setTanggalBerangkat(rs.getString("TanggalBerangkat"));
                tik.setJumlah(rs.getInt("jumlah"));
                tik.getBus().setIdbus(rs.getInt("idbus"));
                tik.getBus().setPlat(rs.getString("Plat"));
                tik.getBus().setKapasitas(rs.getInt("Kapasitas"));
                tik.getBus().setKelas(rs.getString("Kelas"));
                tik.getUser().setId_user(rs.getInt("id_user"));
                tik.getUser().setNo_ktp(rs.getString("no_ktp"));
                tik.getUser().setNama(rs.getString("namauser"));
                tik.getUser().setNo_telp(rs.getString("no_telp"));
                 tik.getUser().setAlamat(rs.getString("alamat"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tik;
    }
     
      public ArrayList<Tiket> getAll() {
        ArrayList<Tiket> ListTiket = new ArrayList();
       ResultSet rs = DBHelper.selectQuery("SELECT "
                                            +"      t.idtiket AS idtiket, "
                                            +"      t.kotaAwal AS kotaAwal, "
                                            +"      t.kotaAkhir AS KotaAkhir, "
                                            +"      t.tanggalBerangkat AS tanggalBerangkat, "
                                            +"      t.jumlah AS jumlah, "
                                            +"      b.idbus AS idbus, "
                                            +"      b.plat AS plat, "
                                            +"      b.kapasitas AS kapasitas, "
                                            +"      b.kelas AS kelas "
                                            +"      FROM tiket t "
                                            +"      LEFT JOIN bus b ON t.idbus = b.idbus ");
                                            
        try {
            while (rs.next()) {
                Tiket tik = new Tiket();
                tik.setIdtiket(rs.getInt("idtiket"));
                tik.setKotaAwal(rs.getString("kotaAwal"));
                tik.setKotaAkhir(rs.getString("kotaAkhir"));
                tik.setTanggalBerangkat(rs.getString("TanggalBerangkat"));
                tik.setJumlah(rs.getInt("jumlah"));
                tik.getBus().setIdbus(rs.getInt("idbus"));
                tik.getBus().setPlat(rs.getString("Plat"));
                tik.getBus().setKapasitas(rs.getInt("Kapasitas"));
                tik.getBus().setKelas(rs.getString("Kelas"));

                ListTiket.add(tik);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListTiket;
    }
    
        public ArrayList<Tiket> search(String keyword) {
        ArrayList<Tiket> ListTiket = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                            +"      t.idtiket AS idtiket, "
                                            +"      t.kotaAwal AS kotaAwal, "
                                            +"      t.kotaAkhir AS KotaAkhir, "
                                            +"      t.tanggalBerangkat AS tanggalBerangkat, "
                                            +"      t.jumlah AS jumlah, "
                                            +"      b.idbus AS idbus, "
                                            +"      b.plat AS plat, "
                                            +"      b.kapasitas AS kapasitas, "
                                            +"      b.kelas AS kelas "
                                            +"      FROM tiket t "
                                            +"      LEFT JOIN bus b ON t.idbus = b.idbus "
                                            +"      WHERE t.kotaAwal like '%" + keyword + "%' "
                                            +"      OR t.kotaAkhir like '%" + keyword + "%' "
                                            +"      OR b.jumlah like '%" + keyword + "%' ");

        try {
            while (rs.next()) {
                Tiket tik = new Tiket();
                tik.setIdtiket(rs.getInt("idtiket"));
                tik.setKotaAwal(rs.getString("kotaAwal"));
                tik.setKotaAkhir(rs.getString("kotaAkhir"));
                tik.setTanggalBerangkat(rs.getString("TanggalBerangkat"));
                tik.setJumlah(rs.getInt("jumlah"));
                tik.getBus().setIdbus(rs.getInt("idbus"));
                tik.getBus().setPlat(rs.getString("Plat"));
                tik.getBus().setKapasitas(rs.getInt("Kapasitas"));
                tik.getBus().setKelas(rs.getString("Kelas"));

                ListTiket.add(tik);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListTiket;
    }
    public void save() {
        if (getById(idtiket).getIdtiket() == 0) {
            String sql = "INSERT INTO tiket (kotaAwal, kotaAkhir, tanggalBerangkat, jumlah, idbus, id_user) VALUES("
                    + "     '" + this.kotaAwal + "', "
                    + "     '" + this.kotaAkhir + "', "
                   + "     '" + this.tanggalBerangkat + "', "
                   + "     '" + this.jumlah + "', "
                   + "     '1',"
                   + "     '" + this.getUser().getId_user() + "' "
                    + "     )";
            this.idtiket = DBHelper.insertQueryGetId(sql);
        } else {
            String sql = "UPDATE tiket SET "
                    + "     kotaAwal =  '" + this.kotaAwal + "', "
                    + "     kotaAkhir = '" + this.kotaAkhir + "', "
                    + "     tanggalBerangkat = '" + this.tanggalBerangkat + "', "
                    + "     jumlah = '" + this.jumlah + "', "
                     + "     id_user = '" + this.getUser().getId_user() + "' ,"
                    + "     idbus =   '" + this.getBus().getIdbus()+ "' "
                    + "     WHERE idtiket = '" + this.idtiket + "'";

            DBHelper.executeQuery(sql);
        }
    }
    
    public void delete() {
        String sql ="DELETE FROM tiket WHERE idtiket = '"+ this.idtiket + "'";
        DBHelper.executeQuery(sql);
    }
//    diatas ini code untuk dipanggil pas delete data yang di tiket
    
 
      
}

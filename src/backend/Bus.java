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
public class Bus {
    
    private int idbus;
    private String plat;
    private int kapasitas;
    private String kelas;
    //relasi ke supir
    private Supir sop = new Supir();

    public Bus() {
        
    }

    public Bus(Supir sop, String plat, int kapasitas, String kelas) {
        this.sop = sop;
        this.plat = plat;
        this.kapasitas = kapasitas;
        this.kelas = kelas;
    }

    public int getIdbus() {
        return idbus;
    }

    public void setIdbus(int idbus) {
        this.idbus = idbus;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public Supir getSop() {
        return sop;
    }

    public void setSop(Supir sop) {
        this.sop = sop;
    }
    
     public Bus getById(int id) {
        Bus bus = new Bus();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                            +"      b.idbus AS idbus, "
                                            +"      b.plat AS plat, "
                                            +"      b.kapasitas AS kapasitas, "
                                            +"      b.kelas AS kelas, "
                                            +"      s.idsupir AS idsupir, "
                                            +"      s.nama AS nama, "
                                            +"      s.alamat AS alamat, "
                                            +"      s.telepon AS telepon "
                                            +"      FROM bus b "
                                            +"      LEFT JOIN supir s ON b.idsupir = s.idsupir "
                                            +"      WHERE b.idbus = '"+ id + "'");
               

        try {
            while (rs.next()) {
                bus = new Bus();
                bus.setIdbus(rs.getInt("idbus"));
                bus.setPlat(rs.getString("plat"));
                bus.setKapasitas(rs.getInt("kapasitas"));
                bus.setKelas(rs.getString("kelas"));
                bus.getSop().setIdsupir(rs.getInt("idsupir"));
                bus.getSop().setNama(rs.getString("nama"));
                bus.getSop().setAlamat(rs.getString("Alamat"));
                bus.getSop().setTelepon(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bus;
    }

    
    public ArrayList<Bus> getAll() {
        ArrayList<Bus> ListBus = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                            +"      b.idbus AS idbus, "
                                            +"      b.plat AS plat, "
                                            +"      b.kapasitas AS kapasitas, "
                                            +"      b.kelas AS kelas, "
                                            +"      s.idsupir AS idsupir, "
                                            +"      s.nama AS nama, "
                                            +"      s.alamat AS alamat, "
                                            +"      s.telepon AS telepon "
                                            +"      FROM bus b "
                                            +"      LEFT JOIN supir s ON b.idsupir = s.idsupir ");
                                            
        try {
            while (rs.next()) {
                Bus bus = new Bus();
                bus.setIdbus(rs.getInt("idbus"));
                bus.setPlat(rs.getString("plat"));
                bus.setKapasitas(rs.getInt("kapasitas"));
                bus.setKelas(rs.getString("kelas"));
                bus.getSop().setIdsupir(rs.getInt("idsupir"));
                bus.getSop().setNama(rs.getString("nama"));
                bus.getSop().setAlamat(rs.getString("Alamat"));
                bus.getSop().setTelepon(rs.getString("telepon"));

                ListBus.add(bus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBus;
    }
    
        public ArrayList<Bus> search(String keyword) {
        ArrayList<Bus> ListBus = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                            +"      b.idbus AS idbus, "
                                            +"      b.plat AS plat, "
                                            +"      b.kapasitas AS kapasitas, "
                                            +"      b.kelas AS kelas, "
                                            +"      s.idsupir AS idsupir, "
                                            +"      s.nama AS nama, "
                                            +"      s.alamat AS alamat, "
                                            +"      s.telepon AS telepon "
                                            +"      FROM bus b "
                                            +"      LEFT JOIN supir s ON b.idsupir = s.idsupir "
                                            +"      WHERE b.plat like '%" + keyword + "%' "
                                            +"      OR b.kapasitas like '%" + keyword + "%' "
                                            +"      OR b.kelas like '%" + keyword + "%' ");

        try {
            while (rs.next()) {
                Bus bus = new Bus();
                bus.setIdbus(rs.getInt("idbus"));
                bus.setPlat(rs.getString("plat"));
                bus.setKapasitas(rs.getInt("kapasitas"));
                bus.setKelas(rs.getString("kelas"));
                bus.getSop().setIdsupir(rs.getInt("idsupir"));
                bus.getSop().setNama(rs.getString("nama"));
                bus.getSop().setAlamat(rs.getString("Alamat"));
                bus.getSop().setTelepon(rs.getString("telepon"));

                ListBus.add(bus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBus;
    }
        
        public void save() {
        if (getById(idbus).getIdbus() == 0) {
            String sql = "INSERT INTO bus (plat, kapasitas, kelas, idsupir) VALUES("
                    + "     '" + this.plat + "', "
                    + "     '" + this.kapasitas + "', "
                    + "     '" + this.kelas + "', "
                    + "     '" + this.getSop().getIdsupir() + "' "
                    + "     )";
            this.idbus = DBHelper.insertQueryGetId(sql);
        } else {
            String sql = "UPDATE bus SET "
                    + "     plat =  '" + this.plat + "', "
                    + "     kapasitas = '" + this.kapasitas + "', "
                    + "     kelas = '" + this.kelas + "', "
                    + "     idsupir =   '" + this.getSop().getIdsupir()+ "' "
                    + "     WHERE idbus = '" + this.idbus + "'";

            DBHelper.executeQuery(sql);
        }

    }
        
    public void delete(){
    String sql ="DELETE FROM bus WHERE idbus = '"+ this.idbus + "'";
    DBHelper.executeQuery(sql);
    
    }
    
//     public int toInt(){
//        return idbus;
//    }
    
    @Override
     public String toString(){
        return Integer.toString(idbus);
    }
}

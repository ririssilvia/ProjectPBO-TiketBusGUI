/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frontend;
import backend.*;
/**
 *
 * @author USER
 */
public class TestTiket {
   public static void main(String[] args) {
        // TODO code application logic here
        Bus bus1 = new Bus().getById(7);
        Bus bus2 = new Bus().getById(5);
        User user1 = new User().getById(7);
        User user2 = new User().getById(8);
        Tiket tik1 = new Tiket(bus1, "Malang", "Bandung", "2020/6/6", 3 ,user1);
        Tiket tik2 = new Tiket(bus2, "Surabaya", "malang", "2021/6/6", 2 ,user2);

// test insert
        tik1.save();
        tik2.save();
        tik2.save();
// test update
       tik2.setJumlah(1);
       tik2.save();
       tik2.save();
// test delete
        tik2.delete();
// test select all
        for (Tiket t : new Tiket().getAll()) {
            System.out.println("ID bus: " + t.getBus().getIdbus() + ", Kota Awal: " + t.getKotaAwal());
        }
// test search
        for (Tiket t : new Tiket() .search("malang")) {
            System.out.println("ID bus: " + t.getBus().getIdbus() + ", Kota Awal: " + t.getKotaAwal());
        }
    }    
}

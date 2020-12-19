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
public class TesBus {
   public static void main(String[] args) {
        // TODO code application logic here
        Supir sup1 = new Supir().getById(8);
        Supir sup2 = new Supir().getById(13);
        Bus bus1 = new Bus(sup1, "N2001", 20 , "Ekonomi");
        Bus bus2 = new Bus(sup2, "N2000", 20 , "Eksekutif");
        
// test insert
        bus1.save();
        bus2.save();
// test update
        bus2.setKapasitas(10);
       bus2.save();
// test delete
        bus2.delete();
// test select all
        for (Bus b : new Bus().getAll()) {
            System.out.println("ID supir: " + b.getSop().getIdsupir() + ", plat: " + b.getPlat());
        }
// test search
        for (Bus b : new Bus().search("N2001")) {
            System.out.println("ID supir: " + b.getSop().getIdsupir() + ", plat: " + b.getPlat());
        }
    }   
}

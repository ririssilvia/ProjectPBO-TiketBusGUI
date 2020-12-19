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
public class TestSupir {
    public static void main(String[] args) {
        Supir sop = new Supir("Yanto", "jl.merpati","085202834111");
//        kategori kat3 = new kategori("Komik", "Komik anak-anak");
// test insert
//        kat1.save();
        sop.save();
//        kat3.save();
// test update
        sop.setNama("Yanto");
        sop.save();
// test delete
//        kat3.delete();
// test select all
        for (Supir s : new Supir().getAll()) {
            System.out.println("Nama : " + s.getNama() + ", alamat : " + s.getAlamat() + ", Telepon : " + s.getTelepon());
        }
// test search
        for (Supir s : new Supir().search("Yanto")) {
             System.out.println("Nama : " + s.getNama() + ", alamat : " + s.getAlamat() + ", Telepon : " + s.getTelepon());
        }

    }
 }
            


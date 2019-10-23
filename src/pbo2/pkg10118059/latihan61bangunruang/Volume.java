/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan61bangunruang;

/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */

public abstract class Volume{
    public abstract double hitungVolume();
    
    public static void main(String[] args) {
        BolaBasket bolabasket = new BolaBasket();
        Tabung tabung = new Tabung();
        Kerucut kerucut = new Kerucut();
        
        bolabasket.setJariJari(7);
        tabung.setJariJari(10);
        tabung.setTinggi(21);
        kerucut.setJariJari(14);
        kerucut.setTinggi(9);
        
        System.out.println("Jari-jari dari sebuah bola basket adalah " + bolabasket.getJariJari() +" cm.");
        System.out.println("V = " + bolabasket.hitungVolume() + "cm3");
        System.out.println("");
        System.out.println("Sebuah tabung memiliki jari-jari berukuran " + tabung.getJariJari() + " cm. Jika tingginya " + tabung.getTinggi() + " cm.");
        System.out.println("V = " + tabung.hitungVolume() + " cm3");
        System.out.println("");
        System.out.println("Diketahui tinggi sebuah kerucut " + kerucut.getTinggi() + " cm. Jika jari-jarinya " + kerucut.getJariJari() + " cm.");
        System.out.println("V = " + kerucut.hitungVolume() + " cm3");
        
    }

    
}
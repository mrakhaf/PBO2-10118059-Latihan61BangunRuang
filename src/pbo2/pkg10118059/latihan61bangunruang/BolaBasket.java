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
public class BolaBasket extends Volume {
    private int jariJari;

    public int getJariJari() {
        return jariJari;
    }

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungVolume() {
        return 4*Math.PI*(jariJari*jariJari*jariJari)/3;
    }
    
    

    

    

    

    
    
    
}

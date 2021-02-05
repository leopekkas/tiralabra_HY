/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureproject;

/**
 * Shakkilauta-luokka, joka sisältää tietoa laudan ruuduista ja niiden sisäkköstä
 */
public class Shakkilauta {
    
    //private static Ruutu[] ruudut = Ruutu.values();
    private static boolean[] varatutRuudut;

    public Shakkilauta() {
        
        varatutRuudut = new boolean[64];
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i <= 1 || i >= 6) {
                    varatutRuudut[i * 8 + j] = true;  
                } else {
                    varatutRuudut[i * 8 + j] = false;
                }
            }
        }
    }
    
    public void liikutaNappulaa(Siirto siirto) {
        String lahtoRuutu = siirto.getAlku();
        String kohdeRuutu = siirto.getLoppu();
        
        int lahtoindeksi = Ruutu.valueOf(lahtoRuutu.toUpperCase()).ordinal();
        int kohdeindeksi = Ruutu.valueOf(kohdeRuutu.toUpperCase()).ordinal();
        
        varatutRuudut[lahtoindeksi] = false;
        varatutRuudut[kohdeindeksi] = true;
                
    }
    
    public boolean onkoLaillinenSiirto(Siirto siirto) {
        String lahtoRuutu = siirto.getAlku();
        String kohdeRuutu = siirto.getLoppu();
        
        int lahtoindeksi = Ruutu.valueOf(lahtoRuutu.toUpperCase()).ordinal();
        int kohdeindeksi = Ruutu.valueOf(kohdeRuutu.toUpperCase()).ordinal();
        
        if (varatutRuudut[kohdeindeksi] || !varatutRuudut[lahtoindeksi]) {
            return false;
        }
        
        return true;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureproject;

/**
 * Shakkilaudalla tapahtuvasta siirrosta vastaava luokka
 */
public class Siirto {
    
    private final String alku;
    private final String loppu;

    public Siirto(String alku, String loppu) {
        this.alku = alku;
        this.loppu = loppu;
    } 

    public String getAlku() {
        return alku;
    }

    public String getLoppu() {
        return loppu;
    }
    
}

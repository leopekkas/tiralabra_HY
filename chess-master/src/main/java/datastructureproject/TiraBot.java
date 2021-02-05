/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureproject;

import chess.bot.ChessBot;
import chess.engine.GameState;
import java.util.Random;

/**
 *
 * @author lbsarast
 */
public class TiraBot implements ChessBot {
    
    public TiraBot() {
        
    }

    @Override
    public String nextMove(GameState gamestate) {
        Shakkilauta lauta = new Shakkilauta();
        
        String retString;
        
        while (true) {
            String kirjaimet = "abcdefgh";
            
            Random r = new Random();
            
            char siirronkirjain = kirjaimet.charAt(r.nextInt(kirjaimet.length()));
            
            String siirtoLahto = siirronkirjain + "7";
            String siirtoLoppu = siirronkirjain + "5";
            
            Siirto siirto = new Siirto(siirtoLahto, siirtoLoppu);
            
            if (lauta.onkoLaillinenSiirto(siirto) == true) {
                String alkuStr = siirto.getAlku();
                String loppuStr = siirto.getLoppu();
        
                retString = siirto.getAlku() + siirto.getLoppu();
                
                lauta.liikutaNappulaa(siirto);
                
                break;
            }
        }
        
        return retString;
    }
    
    
    
}

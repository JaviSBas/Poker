/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Poker;

/**
 *
 * @author Javi
 */
public class Jugador {
    private int id;
    private Carta[] mano = new Carta[5];
    private int victorias;
    
    public Jugador(int id, Carta c, int victorias){
        this.id = id;
        this.mano = new Carta[]{c,c,c,c,c};
        this.victorias = victorias;      
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public Carta[] getMano(){
        return mano;
    }
    
    public void setMano(Carta[] m){
        this.mano = m;
    }
    
    public int getVictorias(){
        return victorias;
    }
    
    public void setVictorias(int victorias){
        this.victorias = victorias;
    }
}

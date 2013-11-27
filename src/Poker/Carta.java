/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Poker;

/**
 *
 * @author Javi
 */
public class Carta {

    private int palo;
    private int numero;

    public Carta(int palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }
    
    public int getPalo(){
        return palo;
    }
    
    public void setPalo(int palo){
        this.palo = palo;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    @Override
    public String toString() {
        return "Carta(Palo " + this.palo + ", numero: " + this.numero + ")";
    }
}

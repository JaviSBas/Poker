/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Poker;

/**
 *
 * @author Javi
 */
public class Baraja {
    private Carta[] cartas = new Carta[52];
    public Baraja(){
        Carta carta = new Carta(1,1);
        int num = 1;
        int palo = 1;
        for (int i = 0;i<52;i++){
            cartas[i] = carta;            
            num++;
            carta = new Carta(palo,num);
            if(i==12 || i==25 || i==38){                
                palo++;
                num=1;
                carta = new Carta(palo,num);
            }            
        }
    }
    public Carta getCarta(int i){
        return this.cartas[i];
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Poker;

/**
 *
 * @author Javi
 */
public class PokerTest {
    public static void main(String[] args){
        Baraja deck = new Baraja();
        int i;
        for(i=0;i<52;i++){
            Carta cards=deck.getCarta(i);
            System.out.println(cards.toString());
        }
    }
}

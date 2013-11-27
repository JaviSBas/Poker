/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Poker;

/**
 *
 * @author Javi
 */
public class Poker {

    private Baraja baraja;
    private Jugador[] jugadores = new Jugador[4];
    private int ronda;
    private Jugador turno;
    private boolean fase;

    public Poker(Baraja baraja, Jugador j, int ronda, Jugador turno) {
        this.baraja = baraja;
        this.jugadores = new Jugador[]{j,j,j,j};
        this.ronda = ronda;
        this.turno = turno;
    }
    
    public Jugador jugar(){
        Jugador ganador;
        this.barajar();
        this.repartir();
        this.descartes();
        this.repartir();
        ganador = this.calcularGanador();
        return ganador;
    }

    public Baraja getBaraja() {
        return this.baraja;
    }

    public void setBaraja(Baraja baraja) {
        this.baraja = baraja;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }
    
    public void setJugadores(Jugador[] jugadores){
        this.jugadores = jugadores;
    }
    
    public int getRonda(){
        return ronda;
    }
    
    public void setRonda(int ronda){
        this.ronda = ronda;
    }
    
    public Jugador getTurno(){
        return turno;
    }
    
    public void setTurno(Jugador turno){
        this.turno = turno;
    }
    
    public boolean getFase(){
        return fase;
    }
    
    public void setFase(boolean fase){
        this.fase = fase;
    }    
}

package com.loiane.cursojava.aula33.labs.ex01;

public class Ex01 {

    public static void main(String[] args) {
        
        Lampada lampada = new Lampada();
        
        lampada.ligar();

        lampada.mostrarEstado();        
        
        lampada.desligar();
        
        lampada.mostrarEstado();        

        lampada.mudarEstado();

        lampada.mostrarEstado();
    }
}

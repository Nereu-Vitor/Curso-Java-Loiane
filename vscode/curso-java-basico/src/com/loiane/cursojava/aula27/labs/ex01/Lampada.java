package com.loiane.cursojava.aula27.labs.ex01;

public class Lampada {

    public String modelo;
    public String tensao;
    public int potencia;
    public String cor;
    public String tipoLuz;
    public int garantiaMeses;
    public String[] tipos;
    public boolean tipoAbajur;

    public boolean ligada;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void mostrarEstado() {
        if (ligada) {
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }

    public void mudarEstado() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }

}

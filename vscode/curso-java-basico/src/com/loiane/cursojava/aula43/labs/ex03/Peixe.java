package com.loiane.cursojava.aula43.labs.ex03;

public class Peixe extends Animal {

    private String caracteristicas;

    public Peixe() {
        super();
        this.numPatas = 0;
        this.setAmbiente("mar");
        this.setCor("cinzento");
        this.caracteristicas = "barbatanas e cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {

        return super.toString() + "\n" +
                "Características: " + caracteristicas;
    }

}

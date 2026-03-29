package com.loiane.cursojava.aula46.labs;

public class Piramide extends Figura3D {

    private double altura;
    private double arestaBase;
    private double apotema;
    private double numPoligonoBase;

    private Figura2D base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getNumPoligonoBase() {
        return numPoligonoBase;
    }

    public void setNumPoligonoBase(double numPoligonoBase) {
        this.numPoligonoBase = numPoligonoBase;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {

        if (base != null) {
            return (numPoligonoBase * (arestaBase * apotema) / 2.0) + base.calcularArea();
        }

        return 0.0;
    }

    @Override
    public double calcularVolume() {

        if (base != null) {
            return (base.calcularArea() * altura) / 3.0;
        }

        return 0.0;
    }

}

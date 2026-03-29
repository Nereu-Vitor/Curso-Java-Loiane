package com.loiane.cursojava.aula46.labs;

public class Teste {

    public static void main(String[] args) {

        Quadrado f1 = new Quadrado();
        f1.setLado(2);
        f1.setNome("Quadrado");

        Circulo f2 = new Circulo();
        f2.setRaio(2);
        f2.setNome("Círculo");

        Triangulo f3 = new Triangulo();
        f3.setBase(3);
        f3.setAltura(2);
        f3.setNome("Triângulo");

        Cubo f4 = new Cubo();
        f4.setLado(5);
        f4.setNome("Cubo");

        Cilindro f5 = new Cilindro();
        f5.setRaio(2);
        f5.setAltura(3);
        f5.setNome("Cilindro");

        Piramide f6 = new Piramide();
        f6.setAltura(3);
        f6.setApotema(4);
        f6.setArestaBase(3);
        f6.setNumPoligonoBase(4);
        f6.setBase(f1);
        f6.setNome("Pirâmide");

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = f1;
        figuras[1] = f2;
        figuras[2] = f3;
        figuras[3] = f4;
        figuras[4] = f5;
        figuras[5] = f6;

        for (FiguraGeometrica figura : figuras) {
            System.out.println("-----------------------");
            System.out.printf("Nome da Figura = %s %n", figura.getNome());

            if (figura instanceof Figura2D) {

                Figura2D f2D = (Figura2D) figura;
                System.out.printf("Área da figura = %.1f %n", f2D.calcularArea());
            }

            if (figura instanceof Figura3D) {

                Figura3D f3D = (Figura3D) figura;
                System.out.printf("Área da figura = %.1f %n", f3D.calcularArea());
                System.out.printf("Volume da figura = %.1f %n", f3D.calcularVolume());
            }
        }

    }
}

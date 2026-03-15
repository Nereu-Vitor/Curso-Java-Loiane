package com.loiane.cursojava.aula17.labs;

import java.text.DecimalFormat;

public class Ex31 {

    public static void main(String[] args) {        

        double salario = 1000;
        double percentual = 1.5;

        salario += (salario * percentual / 100);

        DecimalFormat format = new DecimalFormat("###,###.##");

        for (int i = 1997; i <= 2026; i++) {
            percentual *= 2;
            
            salario += (salario * percentual / 100);

            System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");
        }
    }
}

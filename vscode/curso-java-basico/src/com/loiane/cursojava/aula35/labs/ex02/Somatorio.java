package com.loiane.cursojava.aula35.labs.ex02;

public class Somatorio {

    public static int somarNumeros(int num) {

        if (num == 1) {
            return 1;
        } 

        return num + somarNumeros(num - 1);
    }

}

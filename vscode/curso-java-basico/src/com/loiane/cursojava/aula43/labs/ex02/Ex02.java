package com.loiane.cursojava.aula43.labs.ex02;

public class Ex02 {

    public static void main(String[] args) {

        PessoaFisica p1 = new PessoaFisica("Contribuinte 01", 1000, "583.358.456-62");        

        PessoaJuridica p2 = new PessoaJuridica();
        p2.setNome("Contribuinte 02");
        p2.setRendaBruta(5000);
        p2.setCnpj("91.403.512/0001-54");
        
        PessoaFisica p3 = new PessoaFisica("Contribuinte 03", 2000, "828.277.078-80");        
        
        PessoaJuridica p4 = new PessoaJuridica();
        p4.setNome("Contribuinte 04");
        p4.setRendaBruta(3000);
        p4.setCnpj("10.684.822/0001-92");
        
        PessoaFisica p5 = new PessoaFisica("Contribuinte 05", 3700, "547.653.548-90");        
        
        PessoaJuridica p6 = new PessoaJuridica();
        p6.setNome("Contribuinte 06");
        p6.setRendaBruta(4000);
        p6.setCnpj("35.434.693/0001-05");

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = p1;
        contribuintes[1] = p2;
        contribuintes[2] = p3;
        contribuintes[3] = p4;
        contribuintes[4] = p5;
        contribuintes[5] = p6;

        for (Contribuinte contribuinte : contribuintes) {
            System.out.printf("%s %n", contribuinte.toString());
        }
    }
}

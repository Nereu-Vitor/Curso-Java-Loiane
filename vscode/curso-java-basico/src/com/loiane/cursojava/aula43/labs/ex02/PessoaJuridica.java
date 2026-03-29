package com.loiane.cursojava.aula43.labs.ex02;

public class PessoaJuridica extends Contribuinte {

    private String cnpj;

    public PessoaJuridica() {
        this("Não Registrado", 0.0, "00.000.000/0000-00");
    }

    public PessoaJuridica(String nome, double rendaBruta, String cnpj) {
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {

        String s = "Pessoa Jurídica[";
        s += super.toString() + "; ";
        s += "CNPJ: " + cnpj + "; ";
        s += "Imposto a ser pago: R$ " + calcularImposto();
        s += "]";

        return s;
    }

    @Override
    public double calcularImposto() {
        return this.rendaBruta * 0.1;
    }

}

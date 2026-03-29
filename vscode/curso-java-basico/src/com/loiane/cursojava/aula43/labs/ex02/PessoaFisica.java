package com.loiane.cursojava.aula43.labs.ex02;

public class PessoaFisica extends Contribuinte {

    private String cpf;

    public PessoaFisica() {
        this("Não Registrado", 0.0, "000.000.000-00");
    }

    public PessoaFisica(String nome, double rendaBruta, String cpf) {
        super(nome, rendaBruta);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        
        String s = "Pessoa Física["; 
        s += super.toString() + "; ";
        s += "CPF: " + cpf + "; ";
        s += "Imposto a ser pago: R$ " + calcularImposto();
        s += "]";

        return s;
    }

    @Override
    public double calcularImposto() {

        double renda = this.rendaBruta;

        if (renda <= 1400) {
            return 0.0;
        }

        if (renda <= 2100) {
            return (renda * 0.1) - 100;
        }

        if (renda <= 2800) {
            return (renda * 0.15) - 270;
        }

        if (renda <= 3600) {
            return (renda * 0.25) - 500;
        }

        return (renda * 0.30) - 700;
    }

}

package br.ulbra.banco;

import java.text.DecimalFormat;

public class ContaBancaria {
    DecimalFormat p = new DecimalFormat("0.00");
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double numero) {
        saldo += numero;
        System.out.println("R$" + numero + " depositado com sucesso!!");
    }

    public void sacar(double numero) {

        if (numero > saldo) {
            System.out.println("Voce quer sacar algo que nao possue");
        } else {

            saldo -= numero;
            System.out.println("R$" + numero + " sacado com sucesso!!");
        }
    }

    public void exibir() {
        System.out.println(titular + " voce tem R$" + saldo + " de saldo");
    }

    public void calcularRendimento() {
        double ano = saldo;
        for (int i = 0; i < 12; i++) {
            ano += (ano * 0.1);
        }
        System.out.println("Em um mes no CDB voce teria R$" + (saldo += (saldo * 0.1)));
        System.out.println("Em um ano no CDB voce teria R$" + p.format(ano));
    }

}
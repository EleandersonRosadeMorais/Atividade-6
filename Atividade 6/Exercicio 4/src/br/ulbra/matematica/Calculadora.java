package br.ulbra.matematica;

public class Calculadora {

    private double numero;

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public void calcularSoma(double outroNumero) {
        System.out.println("A soma dos seus numero eh " + (numero + outroNumero));
    }

    public void calcularSubtracao(double outroNumero) {
        System.out.println("A divisao dos seus numero eh " + (numero - outroNumero));
    }

    public void calcularMultiplicacao(double outroNumero) {
        System.out.println("A multiplicacao dos seus numero eh " + (numero * outroNumero));
    }

    public void calcularDivisao(double outroNumero) {
        if (outroNumero == 0) {
            System.out.println("A divisao dos seus numero eh 1");
        } else {

            System.out.println("A divisao dos seus numero eh " + (numero / outroNumero));
        }
    }

    public void calcularRaizQuadrada() {
        System.out.println("A raiz quadrada do seu numero eh " + Math.sqrt(numero));
    }

    public void calcularPotencia(int expoente) {
        System.out.println("A potencia do seu numero eh " + Math.pow(numero, expoente));
    }

    public void calcularFatorial() {
double valor = 0;
        for (int i = 0; i < numero; i++) {
            valor = numero*(numero-1);
        }
        System.out.println("O fatorial de "+ numero + " = "+valor);
        
    }
}

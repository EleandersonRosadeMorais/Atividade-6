package br.ulbra.matematica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner ler = new Scanner(System.in);
        int op = 1;
        System.out.println("-----Bem-vindo a calculadora-----");
        System.out.println("Insira seu numero base");
        calculadora.setNumero(ler.nextDouble());
        while (op != 0) {
            System.out.println("1-Soma");
            System.out.println("2-Subtracao");
            System.out.println("3-Multiplicacao");
            System.out.println("4-Divisao");
            System.out.println("5-Raiz");
            System.out.println("6-Potenciacao");
            System.out.println("7-Fatorial");
            System.out.println("8-Sair");
            System.out.println("Escolha uma opcao");
            switch (ler.nextInt()) {
                case 1:
                    System.out.println("Insira o segundo numero a ser calculadora");
                    calculadora.calcularSoma(ler.nextDouble());
                    break;
                case 2:
                    System.out.println("Insira o segundo numero a ser calculadora");
                    calculadora.calcularSubtracao(ler.nextDouble());
                    break;
                case 3:
                    System.out.println("Insira o segundo numero a ser calculadora");
                    calculadora.calcularMultiplicacao(ler.nextDouble());
                    break;
                case 4:
                    System.out.println("Insira o segundo numero a ser calculadora");
                    calculadora.calcularDivisao(ler.nextDouble());
                    break;
                case 5:
                    calculadora.calcularRaizQuadrada();
                    break;
                case 6:
                    System.out.println("Digite o expoente");
                    calculadora.calcularPotencia(ler.nextInt());
                    break;
                case 7:
                    calculadora.calcularFatorial();
                    break;
                case 8:
                    op = 0;
                    break;
                default:
                    System.out.println("Voce inseriu uma opcao errada!!!");
                    break;
            }

        }
    }

}

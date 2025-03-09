package br.ulbra.banco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Scanner ler = new Scanner(System.in);
        int op = 1;
        System.out.println("---Bem-vindo a sua conta---");
        System.out.println("Informe o titular da conta");
        conta.setTitular(ler.next());
        System.out.println("Informe o seu saldo");
        conta.setSaldo(ler.nextDouble());
        while (op != 0) {
            System.out.println("1-Depositar");
            System.out.println("2-Sacar");
            System.out.println("3-Exibir");
            System.out.println("4-Rendimento");
            System.out.println("5-Sair");
            System.out.println("Escolha uma opcao");
            switch (ler.nextInt()) {
                case 1:
                    System.out.println("Insira o valor a ser depositado");
                    conta.depositar(ler.nextDouble());
                    break;
                case 2:
                    System.out.println("Insira o valor a ser sacado");
                    conta.sacar(ler.nextDouble());
                    break;
                case 3:
                    conta.exibir();
                    break;
                case 4:
                    conta.calcularRendimento();
                case 5:
                    op = 0;
                default:
                    System.out.println("Voce inseriu uma opcao inexistente");
            }
        }

    }

}
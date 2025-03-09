package br.ulbra.estoque;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner ler = new Scanner(System.in);
        int op = 1;
        System.out.println("Qual o nome do produto?");
        produto.setNome(ler.next());
        System.out.println("Qual a quantidade do produto?");
        produto.setQuantidade(ler.nextInt());
        System.out.println("Qual o preco do produto?");
        produto.setPreco(ler.nextDouble());

        while (op != 0) {
            System.out.println("------Bem-vindo ao estoque------");
            System.out.println("1-Adicionar");
            System.out.println("2-Remover");
            System.out.println("3-Exibir");
            System.out.println("4-Calcular Total");
            System.out.println("5-Sair");
            System.out.println("Escolha uma opcao:");
            switch (ler.nextInt()) {
                case 1:
                    System.out.println("Qual quantidade voce quer adicionar?");
                    produto.adicionarQuantidade(ler.nextInt());
                    break;
                case 2:
                    System.out.println("QUal quantidade voce quer remover?");
                    produto.removerQuantidade(ler.nextInt());
                    break;
                case 3:
                    produto.exibirInformacoes();
                    break;
                case 4:
                    System.out.println("O valor total do seus produtos é  R$" + produto.calcularTotal());
                    break;
                case 5:
                    op = 0;
                    break;
                default:
                    System.out.println("Voce selecionou uma opcao invalida");
                    break;
            }
        }

    }

}

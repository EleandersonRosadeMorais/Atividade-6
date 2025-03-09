package br.ulbra.biblioteca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Livro livro = new Livro();
        Scanner ler = new Scanner(System.in);
        int op = 1;
        System.out.println("Qual o titulo do livro?");
        livro.setTitulo(ler.next());
        System.out.println("Qual o autor do livro?");
        livro.setAutor(ler.next());
        System.out.println("Qual o total de paginas do livro?");
        livro.setTotalPaginas(ler.nextInt());
        System.out.println("Qual o total de paginas lidas atualmente");
        livro.setPaginasLidas(ler.nextInt());
        while (op != 0) {
            System.out.println("1-Atualizar");
            System.out.println("2-Exibir");
            System.out.println("3-Sair");
            System.out.println("Escolha uma opcao:");
            switch (ler.nextInt()) {
                case 1:

                    System.out.println("Quantas paginas voce ja leu, desdo ultimo encontro?");
                    livro.atualizar(ler.nextInt());
                    break;
                case 2:
                    livro.exibir();
                    break;
                case 3:
                    System.out.println("Voce saiu!!!");
                    op = 0;
                default:
                    System.out.println("Voce errou a opcao");
                    break;
            }
        }
    }

}

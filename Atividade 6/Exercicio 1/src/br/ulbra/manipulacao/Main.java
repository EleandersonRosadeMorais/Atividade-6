package br.ulbra.manipulacao;

import java.util.Scanner;
// Classe principal

public class Main {

    public static void main(String[] args) {
        // Imports
        ManipulacaoString manipulacao = new ManipulacaoString();
        Scanner ler = new Scanner(System.in);
        // Entrada da palavra
        System.out.println("Informe uma palavra");
        String palavra = ler.next();
        manipulacao.setPalavra(palavra);
        // Metodo para contar os caracteres da palavra
        System.out.println("O numero de caracteres da palavra " + palavra + " tem " + manipulacao.contarPalavra() + " caracteres");
        // Metodo para verificar se a palavra e impar ou par
        System.out.println("A palavra " + palavra + " e " + manipulacao.verificarParImpar());
        // Metodo para inverter a palavra
        System.out.println("A palavra " + palavra + " invertida fica desse jeito: " + manipulacao.mostrarPalavraInvertida());

    }

}

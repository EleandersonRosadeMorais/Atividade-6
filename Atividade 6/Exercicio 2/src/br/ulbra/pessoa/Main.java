package br.ulbra.pessoa;
import java.util.Scanner;
// Classe principal
public class Main {
    // PSVM
    public static void main(String[] args) {
        // Imports
        Pessoa pessoa = new Pessoa();
        Scanner ler = new Scanner(System.in);
        // Entrada de nome, idade e altura
        System.out.println("Qual seu nome?");
        pessoa.setNome(ler.next());
        System.out.println("Qual sua idade?");
        pessoa.setIdade(ler.nextInt());
        System.out.println("Qual sua altura?");
        pessoa.setAltura(ler.nextDouble());
        // Metodo para exibir os dados
        pessoa.exibirDados();
        // Metodo para verificar se eh maior ou menor de idade
        pessoa.verificarMaioral();
        // Metodo para calcular quantos anos faltam para o usuario atingir 100 anos
        pessoa.calcularAnosFaltantes();
    }

}

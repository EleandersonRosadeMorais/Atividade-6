package br.ulbra.aluno;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Insira seu nome");
        aluno.setNome(ler.next());
        System.out.println("Insira sua primeira nota");
        aluno.setNota1(ler.nextDouble());
        System.out.println("Insira sua segunda nota");
        aluno.setNota2(ler.nextDouble());
        
        aluno.calcularMedia();
        aluno.calcularAprovado();
        aluno.exibirDados();
    }

}

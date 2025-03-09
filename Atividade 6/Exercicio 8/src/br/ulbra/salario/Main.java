package br.ulbra.salario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        double porcentagem, salarioMais, total;
        System.out.println("Qual seu nome?");
        funcionario.setNome(ler.next());
        System.out.println("Qual seu salario atual?");
        funcionario.setSalario(ler.nextDouble());
        System.out.println("Qual a porcentagem do reajuste salarial?");
        porcentagem = ler.nextDouble();
        salarioMais = funcionario.getSalario();
        total = funcionario.reajustar(porcentagem);
        System.out.println("Seu salario R$" + funcionario.getSalario() + " aumentou " + porcentagem + "% e com isso aumentou " + (funcionario.getSalario() - salarioMais) + " totalizando R$" + total);
        funcionario.exibir();
        System.out.println("Apos o reajuste seu salario anual sairia de R$" + (salarioMais * 12) + " para R$" + funcionario.calcularAnual(porcentagem));

    }

}

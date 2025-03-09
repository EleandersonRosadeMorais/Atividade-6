package br.ulbra.aluno;

public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void calcularMedia() {
        System.out.println(nome + " A media da sua nota é " + (nota1 + nota2) / 2 + " pontos");
    }

    public void calcularAprovado() {
        double conta = (nota1 + nota2) / 2;
        if (conta >= 7) {
            System.out.println(nome + " Voce foi aprovado!!!");
        } else {
            System.out.println(nome + " Voce foi reprovado!!!");
        }
    }

    public void exibirDados() {
        System.out.println("nome: " + nome);
        System.out.println("primeira nota: " + nota1);
        System.out.println("segunda nota: "+nota2);
        System.out.println("nota: " + (nota1 + nota2) / 2);
    }
}

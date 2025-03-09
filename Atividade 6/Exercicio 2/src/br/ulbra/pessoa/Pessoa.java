package br.ulbra.pessoa;
// Classe pessoa
public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private double altura;
    // Setters and Getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    // Metodo para exibir corretamente os dados inseridos pelo usuario
    public void exibirDados() {
        System.out.println("Seu nome: " + nome);
        System.out.println("Sua idade: " + idade + " anos");
        System.out.println("Sua altura: " + altura+"m");
    }

    // Metodo para verificar se o usuario eh menor ou maior de idade, sendo menor eh expulso
    public void verificarMaioral() {
        if (idade >= 18) {
            System.out.println("Voce com " + idade + " anos, eh maior de idade");
        } else {
            System.out.println("Saia do APP imediatamente, voce nao tem 18 anos ainda");
        }
    }
    // Metodo para ver quantos anos faltam para completar 100 anos
    public void calcularAnosFaltantes() {
        System.out.println("Faltam " + (100 - idade) + " anos, para voce atingar 100 anos");
    }
}

package br.ulbra.estoque;

public class Produto {

    private String nome;
    private int quantidade;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void adicionarQuantidade(int escolha) {
        quantidade += escolha;
        System.out.println("A quantidade requerida foi adicionar perfeitamente com sucesso!");
    }

    public void removerQuantidade(int escolha) {
        if (escolha > quantidade) {
            quantidade -= escolha;
            System.out.println("Quantidade removida com sucesso!");
        } else {
            System.out.println("Voce quer retirar o que nao tem");
        }
    }

    public void exibirInformacoes() {
        System.out.println("-----Informacoes-----");
        System.out.println("nome: " + nome);
        System.out.println("quantidade: " + quantidade);
        System.out.println("Preco: " + preco);
    }

    public double calcularTotal() {
        double valorTotal;
        return valorTotal = quantidade * preco;
    }
}

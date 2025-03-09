package br.ulbra.manipulacao;
// Classe para manipular a palavra
public class ManipulacaoString {
    private String palavra;
    // Setters and Getters
    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
    // Metodo para contar a quantidade de caracteres da palavra
    public int contarPalavra() {
        return this.palavra.length();
    }
    // Metodo para verificar se a palavra e impar ou par
    public String verificarParImpar() {
        String palavra;
        int quantidade = this.palavra.length();
        if (quantidade % 2 == 0) {
            palavra = "par";
        } else {
            palavra = "impar";
        }
        return palavra;
    }
    // metodo para retornar a palavra invertida
    public String mostrarPalavraInvertida() {
        StringBuilder sb = new StringBuilder(this.palavra);
        sb.reverse();
        return sb.toString();
    }
}

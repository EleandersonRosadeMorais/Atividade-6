package br.ulbra.biblioteca;

public class Livro {

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginasLidas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    public void atualizar(int lidas) {
        if ((paginasLidas + lidas)>=totalPaginas) {
            System.out.println("Assim voce leria acima das paginas totais do livro");
        } else {
            this.paginasLidas += lidas;
        }
    }

    public void exibir() {
        if (paginasLidas == totalPaginas) {
            System.out.println("Voce ja leu 100% das paginas de um total de " + totalPaginas + " paginas, do livro: " + titulo + " autor:" + autor);
        } else {
            System.out.println("Voce ja leu" + (((double) totalPaginas / 100) * paginasLidas) + " % de 100% do livro: " + titulo);
        }
    }

}

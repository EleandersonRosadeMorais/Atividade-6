package br.ulbra.salario;

public class Funcionario {

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double reajustar(double porcentagem){
       return salario += salario*(porcentagem/100);
    }
    
    public void exibir(){
        System.out.println("Nome: "+nome);
        System.out.println("Salario: "+salario);
    }
    public double calcularAnual(double porcentagem){
        return reajustar(porcentagem) * 12;
    }
    
}

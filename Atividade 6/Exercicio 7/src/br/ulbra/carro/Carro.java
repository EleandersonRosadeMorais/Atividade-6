package br.ulbra.carro;

public class Carro {

    private String modelo;
    private double consumoPorKm;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumoPorKm() {
        return consumoPorKm;
    }

    public void setConsumoPorKm(double consumoPorKm) {
        this.consumoPorKm = consumoPorKm;
    }

    public double calcularConsumo(double distancia){
        return distancia / consumoPorKm;
    }
    public double calcularGasto(double distancia, double preco){
        return calcularConsumo(distancia) * preco;
    }
}

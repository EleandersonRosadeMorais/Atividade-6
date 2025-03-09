package br.ulbra.carro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Carro carro = new Carro();
        double distancia, preco;
        System.out.println("Qual o modelo do seu veiculo?");
        carro.setModelo(ler.next());
        System.out.println("Quantos litros seu veiculo gasta por KM?");
        carro.setConsumoPorKm(ler.nextDouble());
        System.out.println("Qual o preco da gasolina?");
        preco = ler.nextDouble();
        System.out.println("Quantos KM voce pretende viajar?");
        distancia = ler.nextDouble();

        System.out.println("O modelo de carro: " + carro.getModelo() + " ira consumir " + carro.calcularConsumo(distancia) + "litros de gasolina nessa viajem");
        System.out.println("O modelo de carro: " + carro.getModelo() + " ira gastar em dinheiro: R$" + carro.calcularGasto(distancia, preco) + " nessa viajem");
    }

}

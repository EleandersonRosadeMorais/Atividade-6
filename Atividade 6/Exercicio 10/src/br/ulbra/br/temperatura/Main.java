package br.ulbra.br.temperatura;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual a temperatura?");
        temperatura.setCelsius(ler.nextDouble());
        temperatura.mostrarTemperaturas();
        
    }

}

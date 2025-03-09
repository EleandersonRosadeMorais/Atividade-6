package br.ulbra.br.temperatura;

public class Temperatura {

    private double celsius;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    
    public double converterFahrenheit(){
       return (celsius * 9/5) + 32;
    }
    public double converterKelvin(){
    return celsius + 273.15;
}
    public void mostrarTemperaturas(){
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: "+converterFahrenheit());
        System.out.println("Kelvin: "+converterKelvin());
    }
}

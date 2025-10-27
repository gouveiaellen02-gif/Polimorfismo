package br.edu.fatecpg.polimorfismo.view;

import br.edu.fatecpg.polimorfismo.model.Conversor;

public class MainConversor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Conversor conv = new Conversor();
	       double tempCelsius = 30.0;
	       double tempFahrenheit = conv.converter(tempCelsius);
	       System.out.println("Temperatura: " + tempCelsius + "°C -> " + String.format("%.2f", tempFahrenheit) + "°F");
	       double distanciaKm = 100.0;
	       double distanciaMilhas = conv.converter(distanciaKm, "milhas");
	       System.out.println("Distância: " + distanciaKm + " Km -> " + String.format("%.2f", distanciaMilhas) + " Milhas");
	       String textoOriginal = "Deu certo!";
	       String textoMaiusculo = conv.converter(textoOriginal);
	       System.out.println("Texto: " + textoOriginal + " -> " + textoMaiusculo);
	   }
	}



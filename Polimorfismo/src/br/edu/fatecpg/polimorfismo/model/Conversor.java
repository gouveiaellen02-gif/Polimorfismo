package br.edu.fatecpg.polimorfismo.model;

public class Conversor {
	  public double converter(double celsius) {
	       return celsius * 1.8 + 32;
	   }
	   public double converter(double quilometros, String unidadeDestino) {
	       return quilometros / 1.60934;
	   }
	   public String converter(String texto) {
	       return texto.toUpperCase();
	   }

	}


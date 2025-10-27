package br.edu.fatecpg.polimorfismo.view;

public class Calculadoras {
    public static void main(String[] args) {
        Calculadoras calc = new Calculadoras();

        System.out.println("Soma de 2 inteiros: " + calc.somar(5, 3));
        System.out.println("Soma de 3 inteiros: " + calc.somar(2, 4, 6));
        System.out.println("Soma de 2 doubles: " + calc.somar(2.5, 3.7));
    }

	private String somar(double d, double e) {
		// TODO Auto-generated method stub
		return null;
	}

	private String somar(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}

	private String somar(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}

class Calculadora {


 public int somar(int a, int b) {
     return a + b;
 }


 public int somar(int a, int b, int c) {
     return a + b + c;
 }


 public double somar(double a, double b) {
     return a + b;
 }
}



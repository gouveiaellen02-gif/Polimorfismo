package br.edu.fatecpg.polimorfismo.view;

import br.edu.fatecpg.polimorfismo.model.*;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Bicicleta bicicleta = new Bicicleta();

        carro.mover();
        bicicleta.mover(); 
    }
}

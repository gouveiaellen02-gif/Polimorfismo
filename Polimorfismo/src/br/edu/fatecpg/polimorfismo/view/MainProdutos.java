package br.edu.fatecpg.polimorfismo.view;

public class MainProdutos {
    public static void main(String[] args) {
   
    	        Produtos p1 = new Produtos("Caneta");
    	        Produtos p2 = new Produtos("Caderno", 12.50);
    	        Produtos p3 = new Produtos("Lápis", 2.30, 10);

    	        p1.mostrarInfo();
    	        p2.mostrarInfo();
    	        p3.mostrarInfo();
    	    }
    	}

    	class Produtos {
    	    String nome;
    	    double preco;
    	    int quantidade;

    	    Produtos(String nome) {
    	        this.nome = nome;
    	    }

    	    Produtos(String nome, double preco) {
    	        this.nome = nome;
    	        this.preco = preco;
    	    }

    	    Produtos(String nome, double preco, int quantidade) {
    	        this.nome = nome;
    	        this.preco = preco;
    	        this.quantidade = quantidade;
    	    }

    	    void mostrarInfo() {
    	        System.out.println("Nome: " + nome + ", Preço: " + preco + ", Quantidade: " + quantidade);
    	    }
    	}



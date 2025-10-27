package br.edu.fatecpg.polimorfismo.model;

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


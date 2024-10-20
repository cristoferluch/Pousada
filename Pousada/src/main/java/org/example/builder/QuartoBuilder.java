package org.example.builder;

import org.example.domain.Quarto;

public class QuartoBuilder {

    private int numero;
    private String tipo;
    private double preco;

    public QuartoBuilder setNumero(int numero) {
        this.numero = numero;
        return this;
    }

    public QuartoBuilder setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public QuartoBuilder setPreco(double preco) {
        this.preco = preco;
        return this;
    }

    public Quarto build() {
        return new Quarto(numero, tipo, preco);
    }

}

package org.example.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Quarto {
    private int numero;
    private String tipo;
    private double preco;

    public Quarto(int numero, String tipo, double preco) {
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
    }
}
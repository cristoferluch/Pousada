package org.example.domain;

import lombok.Data;


import java.util.ArrayList;
import java.util.List;
@Data
public class Pousada {
    private List<Quarto> quartos = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();

    public Pousada(String pousadaTeste, String s) {
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void listarQuartos() {
        for (Quarto quarto : quartos) {
            System.out.println("Quarto: " + quarto.getNumero() + ", Tipo: " + quarto.getTipo() + ", Preço: R$ " + quarto.getPreco());
        }
    }

    public void listarReservas() {
        for (Reserva reserva : reservas) {
            System.out.println("Reserva do hóspede: " + reserva.getHospede() + ", Quarto: " + reserva.getQuarto().getNumero());
        }
    }
}
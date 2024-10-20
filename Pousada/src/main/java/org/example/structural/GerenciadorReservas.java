package org.example.structural;

import org.example.domain.Pousada;
import org.example.domain.Quarto;
import org.example.domain.Reserva;

import java.time.LocalDate;

public class GerenciadorReservas {

    private Pousada pousada;

    public GerenciadorReservas(Pousada pousada) {
        this.pousada = pousada;
    }

    public Reserva fazerReserva(int numeroQuarto, String hospede, LocalDate dataEntrada, LocalDate dataSaida) {
        Quarto quarto = encontrarQuarto(numeroQuarto);
        if (quarto != null) {
            Reserva reserva = new Reserva(quarto, dataEntrada, dataSaida, hospede);
            pousada.adicionarReserva(reserva);
            System.out.println("Reserva feita com sucesso para o quarto " + numeroQuarto);
            return reserva;
        } else {
            System.out.println("Quarto não encontrado.");
            return null;
        }
    }

    private Quarto encontrarQuarto(int numeroQuarto) {
        for (Quarto quarto : pousada.getQuartos()) {
            if (quarto.getNumero() == numeroQuarto) {
                return quarto;
            }
        }
        return null;
    }
}

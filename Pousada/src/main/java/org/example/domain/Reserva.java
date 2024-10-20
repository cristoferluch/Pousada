package org.example.domain;

import java.time.LocalDate;
import lombok.Data;

@Data
public class Reserva {
    private Quarto quarto;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private String hospede;

    public Reserva(Quarto quarto, LocalDate dataEntrada, LocalDate dataSaida, String hospede) {
        this.quarto = quarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.hospede = hospede;
    }
}

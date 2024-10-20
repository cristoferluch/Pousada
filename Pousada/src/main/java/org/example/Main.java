package org.example;

import org.example.builder.QuartoBuilder;
import org.example.comportamental.ProcessadorPagamento;
import org.example.comportamental.PagamentoCartao;
import org.example.comportamental.PagamentoDinheiro;
import org.example.domain.Pousada;
import org.example.domain.Quarto;
import org.example.domain.Reserva;
import org.example.singleton.PousadaSingleton;
import org.example.structural.GerenciadorReservas;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pousada pousada = PousadaSingleton.getInstance();

        Quarto quarto1 = new QuartoBuilder().setNumero(101).setTipo("Simples").setPreco(150.0).build();
        Quarto quarto2 = new QuartoBuilder().setNumero(102).setTipo("Luxo").setPreco(300.0).build();
        pousada.adicionarQuarto(quarto1);
        pousada.adicionarQuarto(quarto2);

        System.out.println("Quartos disponíveis:");
        pousada.listarQuartos();

        GerenciadorReservas facadeReserva = new GerenciadorReservas(pousada);
        Reserva reserva = facadeReserva.fazerReserva(101, "Cristofer", LocalDate.now(), LocalDate.now().plusDays(2));

        System.out.println("\n\nReservas:");
        pousada.listarReservas();

        ProcessadorPagamento pagamentoCartao = new PagamentoCartao();
        ProcessadorPagamento pagamentoDinheiro = new PagamentoDinheiro();

        pagamentoCartao.setNext(pagamentoDinheiro);

        double valorReserva = quarto1.getPreco() * 2;
        String formaPagamento = "cartao";
        pagamentoCartao.processarPagamento(formaPagamento, valorReserva);

        System.out.println("\n\nInformações da Reserva:");
        System.out.println("Hóspede: " + reserva.getHospede());
        System.out.println("Quarto: " + reserva.getQuarto().getNumero());
        System.out.println("Valor Total: R$ " + valorReserva);
        System.out.println("Forma de Pagamento: " + formaPagamento);

    }
}
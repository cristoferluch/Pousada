package org.example.comportamental;

public class PagamentoDinheiro extends ProcessadorPagamento {

    @Override
    public void processarPagamento(String tipoPagamento, double valor) {
        if (tipoPagamento.equalsIgnoreCase("dinheiro")) {
            System.out.println("Processando pagamento de R$ " + valor + " em dinheiro.");
        } else {
            super.processarPagamento(tipoPagamento, valor);
        }
    }

}

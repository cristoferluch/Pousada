package org.example.comportamental;

public class PagamentoCartao extends ProcessadorPagamento {

    @Override
    public void processarPagamento(String tipoPagamento, double valor) {
        if (tipoPagamento.equalsIgnoreCase("cartao")) {
            System.out.println("Processando pagamento de R$ " + valor + " no cartão.");
        } else {
            super.processarPagamento(tipoPagamento, valor);
        }
    }

}

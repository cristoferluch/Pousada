package org.example.comportamental;

public class ProcessadorPagamento {

    protected ProcessadorPagamento next;

    public void setNext(ProcessadorPagamento next) {
        this.next = next;
    }

    public void processarPagamento(String tipoPagamento, double valor) {
        if (next != null) {
            next.processarPagamento(tipoPagamento, valor);
        }
    }

}

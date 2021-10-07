package br.com.zup;

public class Fatura {
    private double valor;
    String dataDeVencimento;
    Consumidor consumidor;

    public Fatura(double valor, String dataDeVencimento, Consumidor consumidor) {
        this.valor = valor;
        this.dataDeVencimento = dataDeVencimento;
        this.consumidor = consumidor;
    }
}

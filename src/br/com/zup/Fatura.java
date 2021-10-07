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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n-------Descritivo Fatura-------");
        retorno.append("\n Consumidor: " + consumidor);
        retorno.append("Valor da Fatura: R$ " + valor);
        retorno.append("Data de Vencimento: " + dataDeVencimento);


        return retorno.toString();
    }
}

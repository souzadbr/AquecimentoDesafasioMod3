package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoFatura {


    private static List<Fatura> faturas = new ArrayList<>();

    public static Fatura cadastrarFatura(String email, double valor, String dataVencimento) throws Exception {
        //Percorrer lista de consumidor
        Consumidor consumidor = ServicoConsumidor.pesquisarConsumidorPorEmail(email);

        Fatura fatura = new Fatura(valor, dataVencimento, consumidor);
        faturas.add(fatura);

        return fatura;

    }

    public static List<Fatura> pesquisarFaturaPorEmailConsumidor(String email) {
        //Criar uma lista de faturas

        List<Fatura> faturaUsuario = new ArrayList<>();

        for (Fatura faturaReferencia : faturas) {
            if (faturaReferencia.getConsumidor().getEmail().equals(email)) {
                faturaUsuario.add(faturaReferencia);
            }
        }
        return faturaUsuario;
    }

    public static void listarFaturas() {
        for (Fatura faturasReferencia : faturas) {
            System.out.println(faturasReferencia);
        }
    }
}
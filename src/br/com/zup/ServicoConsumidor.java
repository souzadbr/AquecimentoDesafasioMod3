package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {

    public static List<TipoConsumidor> mostrarTipo() {
        List<TipoConsumidor> tipo = new ArrayList<>();
        for (TipoConsumidor tipoReferencia : TipoConsumidor.values()) {
            tipo.add(tipoReferencia);

        }

        return tipo;
    }

    public static Consumidor cadastrarConsumidor(String nome, String email, String tipo){
        Consumidor consumidor = new Consumidor(nome, email, tipo);
    }
}

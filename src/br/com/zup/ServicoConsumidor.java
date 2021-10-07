package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {

    //Estanciar lista de consumidores
    private static List<Consumidor> consumidores = new ArrayList<>();

    //Método mostrar tipo de consumidores
    public static List<TipoConsumidor> mostrarTipo() {
        List<TipoConsumidor> tipo = new ArrayList<>();
        for (TipoConsumidor tipoReferencia : TipoConsumidor.values()) {
            tipo.add(tipoReferencia);
        }

        return tipo;
    }

    public static TipoConsumidor validarTipoConsumidor (String tipo) throws Exception{

        for (TipoConsumidor tipoReferencia:TipoConsumidor.values()){
            if(tipo.equalsIgnoreCase(String.valueOf(tipoReferencia))){
                return tipoReferencia;
            }
        }
         throw new Exception("Tipo de Consumidor não encontrado.");
    }

    public static Consumidor cadastrarConsumidor(String nome, String email, String tipoRecebido) throws Exception{
        TipoConsumidor tipo = validarTipoConsumidor(tipoRecebido);

        Consumidor consumidor = new Consumidor(nome, email,tipo);
        consumidores.add(consumidor);
        return consumidor;
    }

    public static Consumidor pesquisarConsumidorPorEmail (String email)throws Exception{
        for (Consumidor consumidorReferencia: consumidores) {
            if(consumidorReferencia.getEmail().equals(email)){
                return consumidorReferencia;
            }
        }
        throw new Exception("Consumidor não Cadastrado no sistema");
    }


    public static void listarConsumidores (){
        for (Consumidor consumidoresReferencia:consumidores) {
            System.out.println(consumidores);
        }
    }

}

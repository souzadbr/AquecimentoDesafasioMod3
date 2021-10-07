package br.com.zup;

import java.util.List;
import java.util.Scanner;

public class Sistema {


    private static Scanner capturaDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menuTipo (){
        List<TipoConsumidor>tipo = ServicoConsumidor.mostrarTipo();
        System.out.println("\n Tipo de Consumidores: ");
        // Exibindo a lista de tipo de conhsumidor
        for (int i = 0; i < tipo.size(); i++) {
            System.out.println(tipo.get(i));
        }
    }

    //Cadastrar consumidor
    private static Consumidor cadastrarConsumidor (){
        String nome = capturaDados("Digite o nome do consumidor: ").nextLine();
        String email = capturaDados("Digite o e-mail do consumidor: ").nextLine();
        //menu Tipo do Consumidor
        menuTipo();

    }


    //Cadastrar fatura

}

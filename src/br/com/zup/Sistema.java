package br.com.zup;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Sistema {


    private static Scanner capturaDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menuGeral(){
        System.out.println("Digite 1 para Cadastrar cliente. ");
        System.out.println("Digite 2 para Cadastrar fatura. ");
        System.out.println("Digite 3 para Consultar fatura por email do usuário. ");
    }

    public static void menuTipo() {
        List<TipoConsumidor> tipo = ServicoConsumidor.mostrarTipo();
        System.out.println("\n Tipo de Consumidores: ");
        // Exibindo a lista de tipo de conhsumidor
        for (int i = 0; i < tipo.size(); i++) {
            System.out.println(tipo.get(i));
        }
    }

    //Cadastrar Consumidor
    public static Consumidor cadastrarConsumidor() throws Exception {
        String nome = capturaDados("Digite o nome do consumidor: ").nextLine();
        String email = capturaDados("Digite o e-mail do consumidor: ").nextLine();
        menuTipo();
        String tipo = capturaDados("Por favor, digite o tipo de Pessoa que se encaixa: ").nextLine();


        return ServicoConsumidor.cadastrarConsumidor(nome, email, tipo);
    }


    //Cadastrar fatura
    public static Fatura cadastrarFatura () throws Exception {
        String email = capturaDados("Digite o e-mail do consumidor: ").nextLine();
        double valor = capturaDados("Digite o valor da fatura: ").nextDouble();
        String dataVencimento = capturaDados("Digite data de vencimento da fatura: ").nextLine();

        //FAZER METODO DE CADASTRO DE FATURA NO SERVIÇO FATURA

        return ServicoFatura.cadastrarFatura(email,valor,dataVencimento);
    }

    public static List<Fatura>pesquisarFaturaViaEmailUsuario (){
        String email = capturaDados("Digite o email vinculado a fatura: ").nextLine();
        //validar email
        //chamar metodo validar email da classe ServiçoFatura
        List<Fatura>faturaDoUsuario = ServicoFatura.pesquisarFaturaViaEmailConsumidor(email);

        return faturaDoUsuario;
    }

    public static boolean execultar ()throws Exception{
        boolean continuar = true;

        while (continuar){

            menuGeral();
            int opcaoUsuario = capturaDados("Digite a opção desejada:").nextInt();

            if(opcaoUsuario == 1){
                Consumidor consumidor = cadastrarConsumidor();
                System.out.println(consumidor);
            }
            else if(opcaoUsuario == 2){
                Fatura fatura = cadastrarFatura();
                System.out.println(fatura);
            }
            else if (opcaoUsuario == 3){
                List <Fatura>faturas = pesquisarFaturaViaEmailUsuario();
                System.out.println("Quantidade de faturas cadastradas "+faturas.size());
                System.out.println(faturas);
            }
        }
        return continuar;
    }
}

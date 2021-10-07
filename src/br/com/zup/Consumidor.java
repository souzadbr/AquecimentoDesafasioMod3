package br.com.zup;

public class Consumidor {
    private String nome;
    private String email;
    private TipoConsumidor tipo;

    public Consumidor(String nome, String email, TipoConsumidor tipo) {
        this.nome = nome;
        this.email = email;
        this.tipo = tipo;
    }
}

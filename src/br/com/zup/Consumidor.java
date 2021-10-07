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


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoConsumidor getTipo() {
        return tipo;
    }

    public void setTipo(TipoConsumidor tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome Consumidor: "+nome);
        retorno.append("Email: "+email);
        retorno.append("Tipo de Consumidor: "+ tipo);

        return retorno.toString();
    }
}

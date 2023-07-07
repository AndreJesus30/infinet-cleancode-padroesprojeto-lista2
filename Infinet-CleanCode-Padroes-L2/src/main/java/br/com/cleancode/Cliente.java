package br.com.cleancode;

public class Cliente {
    private String nome;
    private Integer idade;
    private AssinaturaInterface assinatura;

    public Cliente(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public AssinaturaInterface getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(AssinaturaInterface assinatura) {
        this.assinatura = assinatura;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

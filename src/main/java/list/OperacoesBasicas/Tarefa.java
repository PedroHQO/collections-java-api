package main.java.list.OperacoesBasicas;

public class Tarefa {
    //atributos
    private String descricao;

    //construtor para receber descricao
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return  descricao ;
    }
}

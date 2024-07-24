package main.java.set.Pesquisa;

import java.util.Objects;

public class Tarefa {
    //atributos
    private String descricao;
    private boolean resultado;


    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.resultado = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isResultado() {
        return resultado;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Tarefa" +
                "[descricao: " + descricao + '\'' +
                ", resultado: " + resultado +
                ']' + "\n";
    }
}

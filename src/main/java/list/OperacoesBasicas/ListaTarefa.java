package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributos
    private List<Tarefa> tarefaList;

    //Construtor para poder adicionar e remover
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        //Implementacao do objeto tarefasParaRemover
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        //for each que criara uma lista Tarefa 't' vazia dentro de tarefaList
        for(Tarefa t : tarefaList){
            //se getDescricao for igual lista de descricao ela vai ser ignorada e removida
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        //vai remover tudo que tiver dentro da lista tarefas para remover
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();//retorna o tamanho da lista com a quantidade de elemntos dentro
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);//Imprimindo a lista de tarefa
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O numero total de elemntos: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de elemntos: " + listaTarefa.obterNumeroTotalTarefas());

       // listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elemntos: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }

}

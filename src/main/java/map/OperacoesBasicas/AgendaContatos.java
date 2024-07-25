package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Narriman", 123456);
        agendaContatos.adicionarContato("Raquel", 543216);
        agendaContatos.adicionarContato("Ramon", 23242526);
        agendaContatos.adicionarContato("Bruno", 123234345);
        agendaContatos.adicionarContato("Bruno", 987654321);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Raquel");
        agendaContatos.exibirContatos();
//
//        System.out.println("Número Tel: " + agendaContatos.pesquisarPorNome("Narriman"));



    }

}

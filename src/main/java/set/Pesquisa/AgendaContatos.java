package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith((nome))){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);//utilizei o setNumero, pois precisarei atualizar o numero
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Sandra", 98765);
        agendaContatos.adicionarContato("Pedro", 13456);
        agendaContatos.adicionarContato("Gabi", 99226);
        agendaContatos.adicionarContato("Douglas", 2871);
        agendaContatos.adicionarContato("Sandra", 1111111111);

        agendaContatos.exibirContato();



        System.out.println(agendaContatos.pesquisarPorNome("Sandra"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Sandra", 111111));
    }


}

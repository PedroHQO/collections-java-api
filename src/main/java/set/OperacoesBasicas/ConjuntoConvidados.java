package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exebirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Número de convidados é: " + conjuntoConvidados.contarConvidados()
                + " dentro do Set Convidados");

        conjuntoConvidados.adicionarConvidado("Pedro", 121);
        conjuntoConvidados.adicionarConvidado("Gabi", 122);
        conjuntoConvidados.adicionarConvidado("Lucas", 125);
        conjuntoConvidados.adicionarConvidado("Sandra", 124);
        conjuntoConvidados.adicionarConvidado("Valdomiro", 122);

        System.out.println("Número de convidados é : " + conjuntoConvidados.contarConvidados()
                + " dentro do Set Convidados");

        conjuntoConvidados.exebirConvidados();

       conjuntoConvidados.removerConvidadoPorCodigoConvite(121);
        System.out.println("Número de convidados é: " + conjuntoConvidados.contarConvidados()
                + "Dentro do Seto Convidados");

        conjuntoConvidados.exebirConvidados();


    }

}

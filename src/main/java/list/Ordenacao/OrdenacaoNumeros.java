package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //atributo
    private List<ListaNumeros> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(new ListaNumeros(numero));
    }

    public List<ListaNumeros>  ordenarAscendente(){
        List<ListaNumeros> ordemCrescente = new ArrayList<>(numeros);
        Collections.sort(ordemCrescente);
        return ordemCrescente;
    }

    public List<ListaNumeros> ordenarDescendente(){
        List<ListaNumeros> ordemCrescente = new ArrayList<>(numeros);
        ordemCrescente.sort(Collections.reverseOrder());
        return ordemCrescente;
    }

    public void exibirNumers(){
        System.out.println(numeros);
    }


    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(6);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(5);

        System.out.println("Números ordem aleatória");
        ordenacaoNumeros.exibirNumers();


        System.out.println("Ordem crescente");
        System.out.println(ordenacaoNumeros.ordenarAscendente());

        System.out.println("Ordem decrescente");
        System.out.println(ordenacaoNumeros.ordenarDescendente());

    }
}

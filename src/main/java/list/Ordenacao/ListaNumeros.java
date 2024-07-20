package main.java.list.Ordenacao;

import java.util.Comparator;

public class ListaNumeros implements Comparable<ListaNumeros> {
    private int numero;

    public ListaNumeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return '{' + "numero :" + numero +
                '}';
    }

    @Override
    public int compareTo(ListaNumeros o) {
        return Integer.compare(numero, o.getNumero());
    }

}


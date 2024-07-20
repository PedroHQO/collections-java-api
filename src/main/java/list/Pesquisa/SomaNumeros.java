package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    //atributos
    // List faz parte da classe java.util.List e juntamente com ela o .isempty nao funciona sem
    private List<Integer> numeros;

    //construtor
    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(Integer numero: numeros){
                soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE ;
        if(!numeros.isEmpty()){//Returns true if this list contains no elements
            for(Integer numero : numeros){
                if(numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){
            for(Integer numero : numeros){
                if(numero <= menorNumero){
                    menorNumero = numero;
                }
            }
            return menorNumero;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if(!numeros.isEmpty()){
            System.out.println(this.numeros);
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        //instanciando a classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(3);

        //Exibindo numeros
        System.out.println("Números que foram adicionados: ");
        somaNumeros.exibirNumeros();

        //Calculando e exibindo resultado da soma dos nuemros
        System.out.println("Soma total = " + somaNumeros.calcularSoma());

        //exibindo maiorValor
        System.out.println("O maior valor é: " + somaNumeros.encontrarMaiorNumero());

        //exibindo menorValor
        System.out.println("O menor valor é: " + somaNumeros.encontrarMenorNumero());
    }

}

package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //atributo
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }else{
            System.out.println("Palavra não encontrada");
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String definicao = dicionarioMap.get(palavra);
        if(definicao != null){
            return definicao;
        }
        return "Linguagem não encontrada no dicionário.";
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.exibirPalavras();

        dicionario.adicionarPalavra("Amor :", "forte afeição por outra pessoa");
        dicionario.adicionarPalavra("Programação :", "processo de escrita, teste e manutenção de um programa de computador");
        dicionario.adicionarPalavra("Amizade :", "é a relação afetiva entre os indivíduos");
        dicionario.adicionarPalavra("Palavra :", " conjunto de letras ou sons de uma língua, juntamente com a ideia associada a este conjunto");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Amore");

        dicionario.exibirPalavras();

        System.out.println("O significado da palavra Programação: " + dicionario.pesquisarPorPalavra("Programação"));
    }

}

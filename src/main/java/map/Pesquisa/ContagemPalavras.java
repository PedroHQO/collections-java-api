package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemDePalavrasMap;

    public ContagemPalavras() {
        this.contagemDePalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
      //  if (!contagemDePalavrasMap.isEmpty()){
            contagemDePalavrasMap.put(palavra, contagem);
//        }else{
//            System.out.println("Lista se encontra vazia");
//        }
    }

    public void removerPalavra(String palavra){
        if (!contagemDePalavrasMap.isEmpty()){
            contagemDePalavrasMap.remove(palavra);
        }else{
            System.out.println("Palavra não encontrada!");
        }
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for(Map.Entry<String, Integer> entry : contagemDePalavrasMap.entrySet()){
            if(entry.getValue() > maiorContagem){
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for(int contagem : contagemDePalavrasMap.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemPalavras.adicionarPalavra("Java", 3);
        contagemPalavras.adicionarPalavra("Go", 17);
        contagemPalavras.adicionarPalavra("C++", 10);
        contagemPalavras.adicionarPalavra("JavaScript", 5);
        contagemPalavras.adicionarPalavra("Python", 2);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemPalavras.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);

    }

}

package main.java.map.Ordenacao;

import main.java.map.Pesquisa.Produto;

import java.time.LocalDate;
import java.util.*;

public class LivrariaOnline {

    private Map<String, Livro> stringLivroMap;

    public LivrariaOnline() {
        this.stringLivroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro){
        stringLivroMap.put(link, livro);
    }

    public void removerLivro(String titulo){
        List<String> chavesRemover = new ArrayList<>();
        for(Map.Entry<String, Livro> entry : stringLivroMap.entrySet()){
            if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                chavesRemover.add(entry.getKey());
            }
        }
        for (String chave : chavesRemover){
            stringLivroMap.remove(chave);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(stringLivroMap.entrySet());

        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrnadorPorPrecos = new LinkedHashMap<>();

        for(Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco){
            livrosOrnadorPorPrecos.put(entry.getKey(), entry.getValue());
        }
        return livrosOrnadorPorPrecos;
    }

    public Map<String, Livro> exibirLivrosOrdenadorsPorAutor(){
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(stringLivroMap.entrySet());

        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());

        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        for(Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor){
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorAutor;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for(Map.Entry<String, Livro> entry : stringLivroMap.entrySet()){
            Livro livro = entry.getValue();
            if(livro.getAutor().equals(autor)){
                livrosPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrosPorAutor;
    }


    public List<Livro> obterLivroMaisCaro(){
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double maiorPreco = Double.MIN_VALUE;

        if(!stringLivroMap.isEmpty()) {
            for (Livro l : stringLivroMap.values()) {
                if(l.getPreco() > maiorPreco){
                    maiorPreco = l.getPreco();
                }
            }
        }else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for(Map.Entry<String, Livro> entry : stringLivroMap.entrySet()){
            if(entry.getValue().getPreco() == maiorPreco){
                Livro livroComPrecoMaisAlto = stringLivroMap.get(entry.getKey());
                livrosMaisCaros.add((livroComPrecoMaisAlto));
            }
        }
        return  livrosMaisCaros;
    }

    public List<Livro> exibirLivroMaisBarato(){
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double menorPreco = Double.MAX_VALUE;

        if(!stringLivroMap.isEmpty()) {
            for (Livro l : stringLivroMap.values()) {
                if(l.getPreco() > menorPreco){
                    menorPreco = l.getPreco();
                }
            }
        }else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for(Map.Entry<String, Livro> entry : stringLivroMap.entrySet()){
            if(entry.getValue().getPreco() == menorPreco){
                Livro livroComPrecoMaisBaixo = stringLivroMap.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }
        return  livrosMaisBaratos;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", 36d, "Sezar Promu"));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("1384", 36d, "Cezar Promu"));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("1944", 36d, "Sezar Ppromu"));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("1974", 36d, "Sezar Promocao"));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("1914", 36d, "Sezar Priva"));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("19", 36d, "Sezar Promundo"));

        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        //Exibe todos os livros ordenados por autor
        System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadorsPorAutor());

        // Pesquisa livros por autor
        String autorPesquisa = "Josh Malerman";
        livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);

        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisCaro());

        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.stringLivroMap);

    }

}


package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo lista de livros, List e do pacote java.util

    private List<Livro> livroList;

    public CatalogoLivros() {this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        //Criando um livroList que ira receber no parâmentro Titulo, Autor, AnoPublicacao
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    //Retornando a lista de livro, pois pode ter mais de um livro do mesmo autor
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){//se a lista estiver vazia retorna TRUE e nem comecamos o metodo
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    /*se a lista tiver o autor que queremos esse metodo vai adicionar dentro de
                     livrosPorAutor para nos mostrar*/
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPoIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {//se a lista estiver vazia retorna TRUE e nem comecamos o metodo
            for(Livro l : livroList){
                /*se listaLivro que estamos percorrendo for maior ou menor que o ano de Publicacao
                 e a pesquisa for menor ou igual ao ano Final ele vai adicionar o livro a lista que
                 vai estar no intervalo*/
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPoIntervaloAnos.add(l);
                }
            }
        }
        return livrosPoIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;// o laço corta ao encontrar o primeiro livro com o titulo, sem importar com o ano
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Biblia", "Profetas", 900);
        catalogoLivros.adicionarLivro("ArteDeAprender", "James", 2022);
        catalogoLivros.adicionarLivro("3Porquinhos", "AlamPeter", 2000);
        catalogoLivros.adicionarLivro("Homem-Aranha", "PeterPark", 2003);
        catalogoLivros.adicionarLivro("Biblia", "God", 950);
        catalogoLivros.adicionarLivro("Chapeuzinho", "AlamPeter", 1999);

        System.out.println(catalogoLivros.pesquisarPorAutor("God"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(800, 900));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Biblia"));
    }
}

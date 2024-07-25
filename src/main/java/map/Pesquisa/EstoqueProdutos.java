package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributos
    private Map<Long, Produto> estoqueProdutoSMap;

    public EstoqueProdutos() {
        this.estoqueProdutoSMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutoSMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutoSMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutoSMap.isEmpty()){
            //extraindo apenas os valore de dentro do map(produto)
            for(Produto p : estoqueProdutoSMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();

            }
        }
        return  valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutoSMap.isEmpty()) {
            for (Produto p : estoqueProdutoSMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(2L, "Prod-1", 4, 8.9);
        estoqueProdutos.adicionarProduto(5L, "Prod-8", 7, 27.5);
        estoqueProdutos.adicionarProduto(9L, "Prod-6", 3, 43.9);
        estoqueProdutos.adicionarProduto(1L, "Prod-3", 5, 24.9);
        estoqueProdutos.adicionarProduto(6L, "Prod-4", 9, 5.9);
        estoqueProdutos.adicionarProduto(2L, "Prod-2", 1, 3.9);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisCaro());
    }

}

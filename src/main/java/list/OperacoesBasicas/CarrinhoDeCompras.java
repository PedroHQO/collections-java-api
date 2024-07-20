package main.java.list.OperacoesBasicas;


import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    //atributo
    private List<Item> itemList;


    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int qtd){
       Item item = new Item(nome, preco, qtd);
       this.itemList.add(item);
    }

    public void removerItem(String nome) {
        //Implementacao do objeto itemsParaRemover
        List<Item> itensParaRemover = new ArrayList<>();
        //isEmpty retorna um boolean que neste caso seria um true
        if(!itemList.isEmpty()){
            //for each que criara uma lista Tarefa 'i' vazia dentro de tarefaList
            for (Item i : itemList) {
                //se getDescricao for igual lista de descricao ela vai ser ignorada e removida
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            //vai remover tudo que tiver dentro da lista tarefas para remover
            itemList.removeAll(itensParaRemover);
        }else{
            System.out.println("A lista está vazia!");
        }
    }


    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!itemList.isEmpty()){
            for(Item item : itemList){
                double valorItem = item.getPreco() * item.getQtd();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public void exibirItens(){
            if(!itemList.isEmpty()){
                System.out.println(this.itemList);
            }else{
                System.out.println("A lista está vazia!");
            }
        }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itemList +
                '}';
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.adicionarItem("Arroz", 11d, 1);
        carrinhoDeCompras.adicionarItem("Feijao", 8d, 2);
        carrinhoDeCompras.adicionarItem("FilePeixe", 15d, 5);
        carrinhoDeCompras.adicionarItem("Gebel", 5d, 4);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("FilePeixe");

        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra = " + carrinhoDeCompras.calcularValorTotal() + "$");

    }


}

package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    //atributo
    //criando uma lista de Pessoa com o nome pessoaList
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {//iniciando com um ArrayList vazio
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    //Todos os elementos que estao dentro de pessoaList vai ficar
    // dentro da lista e com Collections iremos ordenar
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorALtura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());//Se eu nao instanciar o Collections automaticamente vai usar o Comparable
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome_1", 21, 1.85);
        ordenacaoPessoa.adicionarPessoa("Nome_2", 16, 1.90);
        ordenacaoPessoa.adicionarPessoa("Nome_3", 93, 1.75);
        ordenacaoPessoa.adicionarPessoa("Nome_4", 56, 1.50);

        //System.out.println(ordenacaoPessoa.pessoaList);
        //System.out.println(ordenacaoPessoa.ordenarPorIdade());
        //System.out.println(ordenacaoPessoa.ordenarPorALtura());
    }
}

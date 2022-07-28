package controller;

import model.Produto_Lista1;

import java.text.NumberFormat;
import java.util.*;

public class ProdutoController {

    public static void main(String[] args){

        System.out.println("Teste github");

        /*1
        Constrói instâncias da classe*/
        Produto_Lista1 produto1 = new Produto_Lista1(); //Utilizando o construtor padrão ou vazio
        Produto_Lista1 produto2 = new Produto_Lista1(2,"Feijão", 9.50, 2021); //Utilizando o construtor parametrizado

        //Imprime essas instâncias
        System.out.println("Produtos criados com os construtores padrão e parametrizados");
        System.out.println(produto1);
        System.out.println(produto2);

        //Altera o estado do objeto na memória
        System.out.println("\nAlterando e imprimindo as alterações utilizando os métodos acessores, getters e setters");
        System.out.println("\nInstância de Produto");
        produto1.setId(1);
        produto1.setNome("Arroz");
        produto1.setValor(20.50);
        produto1.setEstoque(10000);
        System.out.println(produto1.getId());
        System.out.println(produto1.getNome());
        System.out.println(NumberFormat.getCurrencyInstance().format(produto1.getValor()));
        System.out.println(produto1.getEstoque());

        System.out.println("\nInstância de produto");
        produto2.setNome("Sal");
        produto2.setValor(2.00);
        produto2.setEstoque(10000);
        System.out.println(produto2.getId());
        System.out.println(produto2.getNome());
        System.out.println(NumberFormat.getCurrencyInstance().format(produto2.getValor()));
        System.out.println(produto2.getEstoque());

        /*2
        Para desenvolver o que foi solicitado no item 2, a classe de modelo recebeu mais um atributo, o id*/
        Produto_Lista1 produto3 = new Produto_Lista1(3, "Batata", 6.00, 7000);
        Produto_Lista1 produto4 = new Produto_Lista1(4, "Uva", 8.00, 9000);
        Produto_Lista1 produto5 = new Produto_Lista1(4, "Uva", 8.00, 9000);

        //Coleção do tipo List
        List<Produto_Lista1> produtosList = new ArrayList<>();
        produtosList.add(produto1);
        produtosList.add(produto2);
        produtosList.add(produto3);
        produtosList.add(produto4);
        produtosList.add(produto5);
        System.out.println("\nColeção do tipo List\n" + produtosList);

        //Pesquisando na coleção (método filter)
        System.out.println();
        System.out.println("Localizando o Produto pela pesquisa (id=3) na coleção do tipo List ....");
        Produto_Lista1 ProdutoFind = produtosList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
        System.out.println(ProdutoFind);

        //Ordenando a coleção do tipo List
        System.out.println();
        produtosList.sort(Comparator.comparing(Produto_Lista1::getId).reversed());
        System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
        System.out.println(produtosList);

        //Coleção do tipo Map
        Map<Integer, Produto_Lista1> produtosMap = new HashMap<>();
        produtosMap.put(produto1.getId(), produto1);
        produtosMap.put(produto2.getId(), produto2);
        produtosMap.put(produto3.getId(), produto3);
        produtosMap.put(produto4.getId(), produto4);
        produtosMap.put(produto5.getId(), produto5);
        System.out.println("\nColeção do tipo Map\n" + produtosMap);

        //Pesquisando na coleção (método filter)
        System.out.println();
        System.out.println("Localizando o Produto pela chave de pesquisa (id=3) na coleção do tipo Map ....");
        System.out.println(produtosMap.get(3));

        //Ordenando a coleção do tipo Map (operação proibida, pois mudaria o conteúdo indexado pela função hash)
    }
}

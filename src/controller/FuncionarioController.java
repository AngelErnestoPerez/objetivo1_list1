package controller;

import model.Funcionario;

import java.text.NumberFormat;
import java.util.*;

public class FuncionarioController {

    public static void  main(String[] args){
        /*1
        Constrói instâncias da classe*/
        Funcionario funcionario1 = new Funcionario(); //Utilizando o construtor padrão ou vazio
        Funcionario funcionario2 = new Funcionario(2, "Heitor", 1500.00); //Utilizando o construtor parametrizado

        //Imprime as instâncias
        System.out.println("Funcionarios criados com construtores padrão e parametrizado");
        System.out.println(funcionario1);
        System.out.println(funcionario2);

        //Altera o estado do objeto na memória
        System.out.println("\nAlterando e imprimindo as alterações utilizando os métodos acessores, getters e setters");
        System.out.println("\nInstância de Funcionario");
        funcionario1.setId(1);
        funcionario1.setNome("Ana");
        funcionario1.setSalario(1600.00);
        System.out.println(funcionario1.getId());
        System.out.println(funcionario1.getNome());
        System.out.println(NumberFormat.getCurrencyInstance().format(funcionario1.getSalario()));

        System.out.println("\nInstância de Funcionario");
        funcionario1.setNome("Helena");
        funcionario1.setSalario(1600.00);
        System.out.println(funcionario1.getId());
        System.out.println(funcionario1.getNome());
        System.out.println(NumberFormat.getCurrencyInstance().format(funcionario2.getSalario()));

        /*2
        Desenvolvendo o que foi solicitado no item 2, a clase de modelo recebeu mais um atributo, o id*/
        Funcionario funcionario3 = new Funcionario(3, "Miguel", 1700.00);
        Funcionario funcionario4 = new Funcionario(4, "Laura", 1800.00);
        Funcionario funcionario5 = new Funcionario(4, "Laura", 1800.00);

        //Coleção do tipo List
        List<Funcionario> funcionariosList = new ArrayList<>();
        funcionariosList.add(funcionario1);
        funcionariosList.add(funcionario2);
        funcionariosList.add(funcionario3);
        funcionariosList.add(funcionario4);
        funcionariosList.add(funcionario5);
        System.out.println("\nColeção do tipo List\n" + funcionariosList);

        //Pesquisando na coleção (método filter)
        System.out.println();
        System.out.println("Localizando o Funcionario pela chave de pesquisa (id=3) na coleção do tipo List ....");
        Funcionario FuncionarioFind = funcionariosList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
        System.out.println(FuncionarioFind);

        //Ordenando a coleção do tipo List
        System.out.println();
        funcionariosList.sort(Comparator.comparing(Funcionario::getId).reversed());
        System.out.println("\nColeção do tipo List em ordem descrescente, chave id");
        System.out.println(funcionariosList);

        //Coleção do tipo Map
        Map<Integer, Funcionario> FuncionariosMap = new HashMap<>();
        FuncionariosMap.put(funcionario1.getId(), funcionario1);
        FuncionariosMap.put(funcionario2.getId(), funcionario2);
        FuncionariosMap.put(funcionario3.getId(), funcionario3);
        FuncionariosMap.put(funcionario4.getId(), funcionario4);
        FuncionariosMap.put(funcionario5.getId(), funcionario5);
        System.out.println("\nColeção do tipo Map\n");

        //Pesquisando na coleção (método filter)
        System.out.println();
        System.out.println("Localizando o Funcionario pela chave de pesquisa (id=3) na coleção do tipo Map ....");
        System.out.println(FuncionariosMap.get(3));

//ordenando a coleçao do tipo Map (operação proibida, pois mudaria o conteúdo indexado pela função hash)
    }
}


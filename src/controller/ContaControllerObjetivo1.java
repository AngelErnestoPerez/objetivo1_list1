package controller;

import model.ContaObjetivo1;
import java.util.*;

public class ContaControllerObjetivo1 {

    public static void main(String[] args){
        /*1
        Constrói instâncias de classe*/
        ContaObjetivo1 conta1 = new ContaObjetivo1();
        ContaObjetivo1 conta2 = new ContaObjetivo1(2, 1500.00);//Utilizando o construtor padrão e parametrizado

        //Imprime essas instâncias
        System.out.println("Contas criadas com os construtores padrão e parametrizado");
        System.out.println(conta1);
        System.out.println(conta2);

        //Altera o estado da memória
        System.out.println("\nAlterando e imprimindo as alterações utilizando os métodos acessores, getters e setters");
        System.out.println("\nInstância da conta");
        conta1.setId(1);
        conta1.deposita(1500.00);
        System.out.println(conta1.getId());
        System.out.println(conta1.getSaldo());

        System.out.println("\nInstância da Conta");
        conta2.deposita(3000.00);
        System.out.println(conta2.getId());
        System.out.println(conta2.getSaldo());

        /*2
        Desenvolvendo o que foi solicitado no item 2, a classe de modelo recebeu mais um atributo, o id*/
        ContaObjetivo1 conta3 = new ContaObjetivo1(3, 1500.00);
        ContaObjetivo1 conta4 = new ContaObjetivo1(4, 400.00);
        ContaObjetivo1 conta5 = new ContaObjetivo1(4, 400.00);

        //Coleção do tipo List
        List<ContaObjetivo1> contasList = new ArrayList<>();
        contasList.add(conta1);
        contasList.add(conta2);
        contasList.add(conta3);
        contasList.add(conta4);
        contasList.add(conta5);
        System.out.println(contasList);

        //Pesquisando na coleção (método filter)
        System.out.println();
        System.out.println("Localizando a Conta pela chave de pesquisa (id=3) na coleção do tipo List ....");
        ContaObjetivo1 ContaFind = contasList.stream().filter(c -> c.getId() == 3).findAny().orElse(new ContaObjetivo1());
        System.out.println(ContaFind);

        //Ordenando a coleção do tipo List
        System.out.println();
        contasList.sort(Comparator.comparing(ContaObjetivo1::getId).reversed());
        System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
        System.out.println(contasList);

        //Coleção do tipo map
        Map<Integer, ContaObjetivo1> contasMap = new HashMap<>();
        contasMap.put(conta1.getId(), conta1);
        contasMap.put(conta2.getId(), conta2);
        contasMap.put(conta3.getId(), conta3);
        contasMap.put(conta4.getId(), conta4);
        contasMap.put(conta5.getId(), conta5);
        System.out.println("\nColeção do tipo Map\n" + contasMap);

        //Pesquisando na coleção (método filter)
        System.out.println();
        System.out.println("Localizando a Conta pela chave de pesquisa (id=3) na coleção do tipo Map....");
        System.out.println(contasMap.get(3));

        //Ordenando a coleção do tipo Map (operação proibida, pois mudaria o conteúdo indexado pela função hash)
    }
}

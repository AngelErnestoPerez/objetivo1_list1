package controller;

import model.Carro;
import java.util.*;

public class CarroController {

    public static void main(String[] args){
        /*1
        Constrói instâncias de classe*/
        Carro carro1 = new Carro(1, "Ferrari", "Roma", 2021);//Utilizando o construtor padrão ou vazio
        Carro carro2 = new Carro(2, "Audi", "TTS", 2018);//Utilizando o construtor parametrizado
        //Imprime essas instâncias
        System.out.println("Carros crados com os construtores padrão e parametrizado");
        System.out.println(carro1);
        System.out.println(carro2);

        //Altera o estado do objeto na memória
        System.out.println("\nAlterando e imprimindo as alterações utilizando os métodos acessores, getters e setters");
        System.out.println("\nInstancia de Carro");
        carro1.setId(1);
        carro1.setMarca("Ferrari");
        carro1.setModelo("Roma");
        carro1.setAnoFabricacao(2021);
        System.out.println(carro1.getId());
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAnoFabricacao());

        System.out.println("\nInstancia de Carro");
        carro2.setId(2);
        carro2.setMarca("Audi");
        carro2.setModelo("TTS");
        carro2.setAnoFabricacao(2018);
        System.out.println(carro2.getId());
        System.out.println(carro2.getMarca());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getAnoFabricacao());

        /*2
        Desenvolvendo o que foi solicitado: adicionar dois objetos iguais (se a coleção permitir)
        Imprima os objetos contidos em cada coleção, e o objeto de id=3 de cada coleção*/
        Carro carro3 = new Carro(3, "Fiat", "Bravo", 2016);
        Carro carro4 = new Carro(4, "Lamborghini", "Murcielago", 2010 );
        Carro carro5 = new Carro(4, "Lamborghini", "Murcielago", 2010 );

        //Coleção do tipo List
        List<Carro> carrosList = new ArrayList<>();
        carrosList.add(carro1);
        carrosList.add(carro2);
        carrosList.add(carro3);
        carrosList.add(carro4);
        carrosList.add(carro5);
        System.out.println("\nColeção do tipo List\n"+ carrosList);

        //Pesquisando na coleção (método filter)
        System.out.println();
        System.out.println("Localizando o carro pela chave de pesquisa id=3, na coleção do tipo List ....");
        Carro carroFind = carrosList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
        System.out.println(carroFind);

        //Ordenando os objetos pelo campo id na ordem decrescente
        System.out.println();
        carrosList.sort(Comparator.comparing(Carro::getId).reversed());
        System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
        System.out.println(carrosList);

        //Coleção do tipo Map
        Map<Integer, Carro> carrosMap = new HashMap<>();
        carrosMap.put(carro1.getId(), carro1);
        carrosMap.put(carro2.getId(), carro2);
        carrosMap.put(carro3.getId(), carro3);
        carrosMap.put(carro4.getId(), carro4);
        carrosMap.put(carro5.getId(), carro5);
        System.out.println("\nColeção do tipo Map\n" + carrosMap);

        //Pesquisando na coleção (método filter)
        System.out.println();
        System.out.println("Localizando o carro pela chave de pesquisa id=3, na coleção do tipo Map ....");
        System.out.println(carrosMap.get(3));

    }
}

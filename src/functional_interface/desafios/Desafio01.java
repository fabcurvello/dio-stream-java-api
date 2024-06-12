package functional_interface.desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Vamos praticar e aprofundar nossos conhecimentos na poderosa Stream API do Java!
    Abaixo, apresentamos uma lista de desafios envolvendo operações com streams para exercitar
    suas habilidades e criatividade.

    Para todos os desafios, utilizem a lista de números inteiros fornecida:

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Desafio 1 - Mostre a lista na ordem numérica:
    Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
 */
public class Desafio01 {
   //Desafio 1 - Mostre a lista na ordem numérica:

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Ordenação da lista utilizando Stream API

        /*
            numeros.stream() converte a lista em um Stream de inteiros.
            .sorted() ordena os elementos do Stream em ordem natural (crescente).
            .collect(Collectors.toList()) coleta os elementos ordenados de volta em uma lista.
         */
        //List<Integer> numerosOrdenados = numeros.stream().sorted().collect(Collectors.toList());
        List<Integer> numerosOrdenados = numeros.stream().sorted().toList(); //Abreviando o que estava acima

        //Exibição da lista
        System.out.println("Lista ordenada: " + numerosOrdenados);


        /*
        OBS: Se você quiser ordenar a lista em ordem decrescente, pode passar um comparador para o método sorted():

        import java.util.Comparator;

        // Ordenação da lista em ordem decrescente
        List<Integer> numerosOrdenadosDesc = numeros.stream()
                                                    .sorted(Comparator.reverseOrder())
                                                    .collect(Collectors.toList());

        System.out.println("Lista ordenada em ordem decrescente: " + numerosOrdenadosDesc);
        Neste caso, o Comparator.reverseOrder() é utilizado para inverter a ordem natural dos elementos, resultando em uma lista ordenada em ordem decrescente.
         */
    }

}

package functional_interface.desafios;

/*
    Vamos praticar e aprofundar nossos conhecimentos na poderosa Stream API do Java!
    Abaixo, apresentamos uma lista de desafios envolvendo operações com streams para exercitar
    suas habilidades e criatividade.

    Para todos os desafios, utilizem a lista de números inteiros fornecida:

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Desafio 2 - Imprima a soma dos números pares da lista:
    Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
*/

import java.util.Arrays;
import java.util.List;

public class Desafio02 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Soma dos pares da lista utilizando Stream API
        /*
            numeros.stream() converte a lista em um Stream de inteiros.
            .filter(n -> n % 2 == 0) filtra os elementos do Stream, mantendo apenas os números pares.
            .mapToInt(Integer::intValue) converte o Stream de Integer para um IntStream, que permite operações como sum().
            .sum() soma todos os elementos do IntStream.
         */
        int somaPares = numeros.stream()
                .filter(n -> n % 2 == 0) // Filtra apenas os números pares
                .mapToInt(Integer::intValue) // Mapeia para um IntStream
                .sum(); // Soma os valores

        System.out.println("Soma dos números pares: " + somaPares);
    }
}

package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

/*
    Vamos praticar e aprofundar nossos conhecimentos na poderosa Stream API do Java!
    Abaixo, apresentamos uma lista de desafios envolvendo operações com streams para exercitar
    suas habilidades e criatividade.

    Para todos os desafios, utilizem a lista de números inteiros fornecida:

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
    Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
*/
public class Desafio11 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaQuadrado = numeros.stream()
                .mapToInt(num -> (int) Math.pow(num, 2))
                .sum();

        System.out.println("A soma dos quadrados dos números da lista é " + somaQuadrado);

    }
}

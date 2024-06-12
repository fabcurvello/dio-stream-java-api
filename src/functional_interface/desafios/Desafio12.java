package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

/*
    Vamos praticar e aprofundar nossos conhecimentos na poderosa Stream API do Java!
    Abaixo, apresentamos uma lista de desafios envolvendo operações com streams para exercitar
    suas habilidades e criatividade.

    Para todos os desafios, utilizem a lista de números inteiros fornecida:

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Desafio 12 - Encontre o produto de todos os números da lista:
    Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
*/
public class Desafio12 {

    public static void main(String[] args) {

        //List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int produto = numeros.stream()
                .reduce(1, (a, b) -> a * b);

        // reduce usa 1 como valor inicial da var acumulador que vai receber a multiplicação de a por b a cada ciclo

        System.out.println("O produto dos números é " + produto);
    }
}

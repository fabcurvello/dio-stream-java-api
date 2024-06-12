package functional_interface.desafios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
    Vamos praticar e aprofundar nossos conhecimentos na poderosa Stream API do Java!
    Abaixo, apresentamos uma lista de desafios envolvendo operações com streams para exercitar
    suas habilidades e criatividade.

    Para todos os desafios, utilizem a lista de números inteiros fornecida:

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
    Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
*/
public class Desafio09 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean isDistinct = numeros.stream()
                .allMatch(new HashSet<>()::add);
        System.out.println("A lista possui todos os números distintos? " + isDistinct);

        /*
        Explicação do código:
            .stream converte a lista em Stream;

            .allMatch(new HashSet<>()::add) usa um Set temporário para tentar adicionar cada elemento da lista.
            O método add de HashSet retorna false se o elemento já estiver presente no conjunto, indicando duplicidade.
         */

    }
}

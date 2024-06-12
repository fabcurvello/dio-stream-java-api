package functional_interface.desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
    Vamos praticar e aprofundar nossos conhecimentos na poderosa Stream API do Java!
    Abaixo, apresentamos uma lista de desafios envolvendo operações com streams para exercitar
    suas habilidades e criatividade.

    Para todos os desafios, utilizem a lista de números inteiros fornecida:

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Desafio 7 - Encontrar o segundo número maior da lista:
    Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
*/
public class Desafio07 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //List<Integer> numeros = Arrays.asList(3,3,3,3);

        Optional<Integer> segundoMaior = numeros.stream() // Optional pois existe a chance de ser nulo. .stream converte em Stream
                .sorted(Comparator.reverseOrder()) // ordena em ordem decrescente
                .distinct() // remove valores repetidos
                .skip(1)// pula o primeiro (que é o maior número)
                .findFirst(); // encontre o primeiro (que é o segundo maior)

        //Como usamos Optional, vamos validar se existe o número:
        if (segundoMaior.isPresent()) {
            System.out.println("O segundo maior número da lista é " + segundoMaior.get());
        } else {
            System.out.println("A lista não possui um segundo maior número");
        }

    }

}

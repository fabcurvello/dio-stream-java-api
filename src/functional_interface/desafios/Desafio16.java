package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Vamos praticar e aprofundar nossos conhecimentos na poderosa Stream API do Java!
    Abaixo, apresentamos uma lista de desafios envolvendo operações com streams para exercitar
    suas habilidades e criatividade.

    Para todos os desafios, utilizem a lista de números inteiros fornecida:

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Desafio 16 - Agrupe os números em pares e ímpares:
    Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo
    os números pares e outra contendo os números ímpares da lista original, e exiba os
    resultados no console.


*/
public class Desafio16 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> agrupados = numeros.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        List<Integer> pares = agrupados.get(true);
        List<Integer> impares = agrupados.get(false);

        System.out.println("Números pares: " + pares);
        System.out.println("Númros ímpares: " + impares);

    }
}

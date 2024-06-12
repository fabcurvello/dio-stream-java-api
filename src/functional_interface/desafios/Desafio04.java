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

    Desafio 4 - Remova todos os valores ímpares:
    Utilize a Stream API para remover os valores ímpares da lista e imprima a lista
    resultante no console.

*/
public class Desafio04 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Abaixo foi feito um filtro buscando os número pares
        List<Integer> pares1 = numeros.stream()
                .filter( num -> num%2 == 0 )
                .collect(Collectors.toList());

        System.out.println("Valores pares na lista 1: " + pares1);

        //Outra solução é a de REMOVER os ímpares, PORÉM, não é utilizando STREAM API
        List<Integer> pares2 = new ArrayList<>(numeros);
        pares2.removeIf(num -> num%2 != 0);

        System.out.println("Valores pares na lista 2: " + pares2);

    }

}

package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

/*
    Vamos praticar e aprofundar nossos conhecimentos na poderosa Stream API do Java!
    Abaixo, apresentamos uma lista de desafios envolvendo operações com streams para exercitar
    suas habilidades e criatividade.

    Para todos os desafios, utilizem a lista de números inteiros fornecida:

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Desafio 5 - Calcule a média dos números maiores que 5:
    Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
*/
public class Desafio05 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaMaioresQue5 = numeros.stream() // Converte números em Stream
                .filter(num -> num > 5) //filtra
                .mapToInt(Integer::intValue) // converte para Int
                .sum(); // soma

        System.out.println("Soma dos números maiores que 5: " + somaMaioresQue5);
    }
}

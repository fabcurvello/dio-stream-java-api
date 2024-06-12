package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
    Vamos praticar e aprofundar nossos conhecimentos na poderosa Stream API do Java!
    Abaixo, apresentamos uma lista de desafios envolvendo operações com streams para exercitar
    suas habilidades e criatividade.

    Para todos os desafios, utilizem a lista de números inteiros fornecida:

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Desafio 13 - Filtrar os números que estão dentro de um intervalo:
    Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico
    (por exemplo, entre 5 e 10) e exiba o resultado no console.
*/
public class Desafio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Informe um número para início de um intervalo");
        int a = scanner.nextInt();

        System.out.println("Informe outro número para fim de um intervalo");
        int b = scanner.nextInt();

        List<Integer> intervalo = numeros.stream()
                .filter( num -> num >= a && num <= b )
                .collect(Collectors.toList());

        System.out.println("Números da lista contidos no intervalo de " + a + " até " + b + ": " + intervalo);

        scanner.close();
    }
}

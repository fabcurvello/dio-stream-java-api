package functional_interface.desafios;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Vamos praticar e aprofundar nossos conhecimentos na poderosa Stream API do Java!
    Abaixo, apresentamos uma lista de desafios envolvendo operações com streams para exercitar
    suas habilidades e criatividade.

    Para todos os desafios, utilizem a lista de números inteiros fornecida:

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Desafio 8 - Somar os dígitos de todos os números da lista:
    Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
*/
public class Desafio08 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDigitos = numeros.stream() // converte a lista em Stream
                .flatMap(num -> String.valueOf(num).chars().mapToObj(digito -> (char) digito)) // Converte cada número para sua representação em String e divide em caracteres
                .mapToInt(Character::getNumericValue) // converte cada caractere para int
                .sum(); // soma

        System.out.println("A soma dos dígitos é " + somaDigitos);

        List<Integer> digitos = numeros.stream() // converte a lista em Stream
                .flatMap(num -> String.valueOf(num).chars().mapToObj(digito -> (char) digito)) // Converte cada número para sua representação em String e divide em caracteres
                .map(Character::getNumericValue) // converte cada caractere para int
                .collect(Collectors.toList()); // converte em List

        System.out.println("Lista de dígitos: " + digitos);
    }

}

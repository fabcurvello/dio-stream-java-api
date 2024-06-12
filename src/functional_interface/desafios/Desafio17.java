package functional_interface.desafios;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
    Vamos praticar e aprofundar nossos conhecimentos na poderosa Stream API do Java!
    Abaixo, apresentamos uma lista de desafios envolvendo operações com streams para exercitar
    suas habilidades e criatividade.

    Para todos os desafios, utilizem a lista de números inteiros fornecida:

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Desafio 17 - Filtrar os números primos da lista:
    Com a ajuda da Stream API, filtre os números primos da lista e
    exiba o resultado no console.
*/
public class Desafio17 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> primos = numeros.stream()
                .filter(Desafio17::isPrimo)
                .collect(Collectors.toList());

        System.out.println("Números primos: " + primos);
    }

    public static boolean isPrimo(int num) {
        if ( num <= 1 ) {
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(num)).allMatch(n -> num % n != 0 );
    }
}

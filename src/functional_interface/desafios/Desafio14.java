package functional_interface.desafios;


import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/*
    Vamos praticar e aprofundar nossos conhecimentos na poderosa Stream API do Java!
    Abaixo, apresentamos uma lista de desafios envolvendo operações com streams para exercitar
    suas habilidades e criatividade.

    Para todos os desafios, utilizem a lista de números inteiros fornecida:

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Desafio 14 - Encontre o maior número primo da lista:
    Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
*/
public class Desafio14 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalInt maiorPrimo = numeros.stream()
                .mapToInt(Integer::intValue)
                .filter(Desafio14::isPrimo)
                .max();

        if (maiorPrimo.isPresent()) {
            System.out.println("O maior número primo é: " + maiorPrimo.getAsInt());
        } else {
            System.out.println("Não há números primos na lista.");
        }
    }

    public static boolean isPrimo(int num) {
        if ( num <= 1 ) {
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(num)).allMatch( n -> num % n != 0 );
    }

    /*
    Verificação de número primo:

    O método isPrimo recebe um número inteiro num e retorna true se o número for primo
    e false caso contrário.
    Um número é considerado primo se ele for maior que 1 e não tiver divisores além de
    1 e ele mesmo. Isso é verificado iterando de 2 até a raiz quadrada do número
    (Math.sqrt(num)) e verificando se algum desses números divide num sem deixar
    resto (num % n != 0).

    Filtragem e obtenção do maior número primo:

    A lista de números é convertida para um Stream usando stream().
    O método mapToInt(Integer::intValue) é usado para converter a Stream<Integer>
    em um IntStream.
    O método filter(MaiorNumeroPrimo::isPrime) filtra o stream para manter apenas
    os números que são primos.
    O método max() retorna um OptionalInt que contém o maior número do stream,
    se ele existir.
     */
}

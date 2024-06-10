package functional_interface.examples;


    /*
    Predicate<T>: Representa uma função que aceita um argumento
    do tipo T e retorna um valor booleano (verdadeiro ou falso).
    É comumente usada para filtrar os elementos do Stream com
    base em alguma condição.
     */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "python", "javascript", "c", "go", "ruby");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDe5Caracteres = palavra -> palavra.length() > 5;

        // Usar o Stream para filtrar as palabvras com mais de 5 caracteres e, em seguida,
        // imprimir cada palavra que passou no filtro
        palavras.stream().filter(maisDe5Caracteres).forEach(palavra -> System.out.println(palavra));

    }
}

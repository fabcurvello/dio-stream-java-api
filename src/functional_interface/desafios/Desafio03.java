package functional_interface.desafios;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Vamos praticar e aprofundar nossos conhecimentos na poderosa Stream API do Java!
    Abaixo, apresentamos uma lista de desafios envolvendo operações com streams para exercitar
    suas habilidades e criatividade.

    Para todos os desafios, utilizem a lista de números inteiros fornecida:

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Desafio 3 - Verifique se todos os números da lista são positivos:
    Com a ajuda da Stream API, verifique se todos os números da lista são positivos e
    exiba o resultado no console.

*/
public class Desafio03 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> positivos = numeros.stream() // converte numeros em stream
                .filter(num -> num >= 0) //faz o filtro pegando os números positivos
                .collect(Collectors.toList()); //converte o resultado em um List

        System.out.println("Números positivos na lista: " + positivos);
    }

}


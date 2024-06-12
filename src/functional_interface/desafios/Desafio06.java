package functional_interface.desafios;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Vamos praticar e aprofundar nossos conhecimentos na poderosa Stream API do Java!
    Abaixo, apresentamos uma lista de desafios envolvendo operações com streams para exercitar
    suas habilidades e criatividade.

    Para todos os desafios, utilizem a lista de números inteiros fornecida:

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Desafio 6 - Verificar se a lista contém algum número maior que 10:
    Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o
    resultado no console.
*/
public class Desafio06 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> maioresQ10 = numeros.stream()
                .filter(num -> num > 10)
                .collect(Collectors.toList());

        System.out.println("Maiores que 10: " + maioresQ10);

        boolean temMaioresQue10 = numeros.stream()
                .anyMatch(num -> num > 10);

        System.out.println("A lista possui números maiores que 10? " + temMaioresQue10);
    }

}

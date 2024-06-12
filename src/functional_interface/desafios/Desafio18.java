package functional_interface.desafios;


import java.util.Arrays;
import java.util.List;

/*
    Vamos praticar e aprofundar nossos conhecimentos na poderosa Stream API do Java!
    Abaixo, apresentamos uma lista de desafios envolvendo operações com streams para exercitar
    suas habilidades e criatividade.

    Para todos os desafios, utilizem a lista de números inteiros fornecida:

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Desafio 18 - Verifique se todos os números da lista são iguais:
    Utilizando a Stream API, verifique se todos os números da lista são iguais e
    exiba o resultado no console.

*/
public class Desafio18 {

    public static void main(String[] args) {

        //List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numeros = Arrays.asList(1, 1, 1, 1, 1, 1);

        boolean isTodosIguais = numeros.stream()
                .allMatch(num -> num.equals(numeros.get(0)));

        if (isTodosIguais) {
            System.out.println("A lista contém " + numeros.size() + " números, mas, na verdade, todos são iguais a " + numeros.get(0));
        } else {
            System.out.println("A lista NÃO contém todos os números iguais");
        }


    }
}

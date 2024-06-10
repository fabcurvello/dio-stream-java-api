package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
    Consumer<T>: Representa uma operação que aceita um argumento do tipo T
    e não retorna nenhum resultado. É utilizada principalmente para realizar
    ações ou efeitos colaterais nos elementos do Stream sem modificar ou
    retornar um valor.
 */

public class ConsumerExample2 {
    public static void main(String[] args) {
        //Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Usar o Consumer com uma classe anônima para imprimir número par
        Consumer<Integer> imprimirNumeroPar = new Consumer<Integer>() {
            @Override
            public void accept(Integer numero) {
                if (numero % 2 == 0) {
                    System.out.println(numero);
                }
            }
        };

        //Usar o Consummer para imprimir números pares
        for (Integer numero : numeros) {
            imprimirNumeroPar.accept(numero);
        }
    }

}

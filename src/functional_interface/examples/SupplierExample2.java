package functional_interface.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
    Supplier<T>: Representa uma operação que não aceita
    nenhum argumento e retorna um resultado do tipo T.
    É comumente usada para criar ou fornecer novos objetos
    de um determinado tipo.
 */
public class SupplierExample2 {

    public static void main(String[] args) {
        //Usar o Supplier com uma classe anônima para fornecer uma saudação personalizada
        Supplier<String> saudacao = new Supplier<String>() {
            @Override
            public String get() {
                return "Olá, seja bem-vindo!";
            }
        };

        //Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = new ArrayList<>();
        for (int cont = 0; cont < 5 ; cont++) {
            listaSaudacoes.add(saudacao.get());
        }

        //Imprimir as saudações geradas
        for (String s : listaSaudacoes) {
            System.out.println(s);
        }

    }
}

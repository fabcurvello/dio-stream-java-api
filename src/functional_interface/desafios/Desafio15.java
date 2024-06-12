package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
    Vamos praticar e aprofundar nossos conhecimentos na poderosa Stream API do Java!
    Abaixo, apresentamos uma lista de desafios envolvendo operações com streams para exercitar
    suas habilidades e criatividade.

    Para todos os desafios, utilizem a lista de números inteiros fornecida:

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
    Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e
    exiba o resultado no console.

*/
public class Desafio15 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -8, -1);

        List<Integer> negativosList = numeros.stream()
                .filter(num -> num < 0)
                .collect(Collectors.toList());

        Optional<List<Integer>> negativosOptional = Optional.ofNullable(negativosList.isEmpty() ? null : negativosList);

        negativosOptional.ifPresentOrElse(
                lista -> System.out.println("Números negativos: " + lista),
                () -> System.out.println("Não há números negativos na lista.")
        );
    }
}

/*
    Filtragem de números negativos:

    A lista de números é convertida para um Stream usando stream().
    O método filter(num -> num < 0) filtra o stream para manter apenas os números que
    são menores que zero (números negativos).
    O método collect(Collectors.toList()) coleta os elementos filtrados em uma nova
    lista numerosNegativos.

    Criação de um Optional:

    Verifica se a lista numerosNegativos está vazia. Se estiver vazia, cria um Optional
    com null usando Optional.ofNullable(numerosNegativos.isEmpty() ? null : numerosNegativos).
    Isso é feito para que o Optional seja vazio se não houver números negativos na lista.

    Exibição do resultado:

    O método ifPresentOrElse do Optional é usado para verificar se há uma lista presente.
    Se houver, exibe os números negativos. Caso contrário, exibe uma mensagem indicando que
    não há números negativos na lista.
 */

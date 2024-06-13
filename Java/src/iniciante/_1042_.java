package iniciante;

import java.io.IOException;
import java.util.Scanner;

import static java.util.Arrays.stream;


public class _1042_ {

    /*
    Beecrowd | 1042
    Sort Simples

    Timelimit: 1
    Leia 3 valores inteiros e ordene-os em ordem crescente.
    No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

    Entrada
    A entrada contem três números inteiros.

    Saída
    Imprima a saída conforme foi especificado.

    Entrada1
    7 21 -14

    Saída1
    -14
    7
    21

    7
    21
    -14

    Entrada1
    -14 21 7

    Saída1
    -14
    7
    21

    -14
    21
    7
 */
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");

        //Pegando os valores e convertendo para int
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int c = Integer.parseInt(line[2]);

        //Chamando a função para ordenar os valores
        sortSimples(a, b, c);
    }

    public static void sortSimples(int a, int b, int c) {
        int[] arr = {a, b, c};

        //Ordenando os valores
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //Imprimindo os valores ordenados
        stream(arr).forEach(System.out::println);
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

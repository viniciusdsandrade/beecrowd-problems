package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class _1021_ {

    /*
    Beecrowd | 1021
    Notas e Moedas

    Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
    A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
    As notas consideradas são de 100, 50, 20, 10, 5, 2.
    As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
    A seguir mostre a relação de notas necessárias.

    Entrada
    O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

    Saída
    Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial,
    conforme exemplo fornecido.

    Obs: Utilize ponto (.) para separar a parte decimal.

    Entrada1
    576.73

    Saída1
    NOTAS:
    5 nota(s) de R$ 100.00
    1 nota(s) de R$ 50.00
    1 nota(s) de R$ 20.00
    0 nota(s) de R$ 10.00
    1 nota(s) de R$ 5.00
    0 nota(s) de R$ 2.00
    MOEDAS:
    1 moeda(s) de R$ 1.00
    1 moeda(s) de R$ 0.50
    0 moeda(s) de R$ 0.25
    2 moeda(s) de R$ 0.10
    0 moeda(s) de R$ 0.05
    3 moeda(s) de R$ 0.01

    Entrada1
    4.00

    Saida1
    NOTAS:
    0 nota(s) de R$ 100.00
    0 nota(s) de R$ 50.00
    0 nota(s) de R$ 20.00
    0 nota(s) de R$ 10.00
    0 nota(s) de R$ 5.00
    2 nota(s) de R$ 2.00
    MOEDAS:
    0 moeda(s) de R$ 1.00
    0 moeda(s) de R$ 0.50
    0 moeda(s) de R$ 0.25
    0 moeda(s) de R$ 0.10
    0 moeda(s) de R$ 0.05
    0 moeda(s) de R$ 0.01

    Entrada1
    91.01

    Saida1
    NOTAS:
    0 nota(s) de R$ 100.00
    1 nota(s) de R$ 50.00
    2 nota(s) de R$ 20.00
    0 nota(s) de R$ 10.00
    0 nota(s) de R$ 5.00
    0 nota(s) de R$ 2.00
    MOEDAS:
    1 moeda(s) de R$ 1.00
    0 moeda(s) de R$ 0.50
    0 moeda(s) de R$ 0.25
    0 moeda(s) de R$ 0.10
    0 moeda(s) de R$ 0.05
    1 moeda(s) de R$ 0.01
     */

    public static void main(String[] args) throws IOException {

        double valor = new Scanner(System.in).nextDouble();
        // Converte o valor para centavos para evitar problemas com precisão de ponto flutuante
        int valorEmCentavos = (int) (valor * 100);

        int[] cedulas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int cedula : cedulas) {
            int qtdCedulas = valorEmCentavos / cedula;
            System.out.printf("%d nota(s) de R$ %.2f\n", qtdCedulas, cedula / 100.0);
            valorEmCentavos %= cedula;
        }

        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int qtdMoedas = valorEmCentavos / moeda;
            System.out.printf("%d moeda(s) de R$ %.2f\n", qtdMoedas, moeda / 100.0);
            valorEmCentavos %= moeda;
        }
    }
}

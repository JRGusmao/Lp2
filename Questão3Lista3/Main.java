package Questão3Lista3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorMinimo, valorMaximo, intervalo, intervaloDividido;
        IdentificadorDePrimos[] subdivisoes = new IdentificadorDePrimos[5];

        System.out.println("Lista 03 - Questao 03 \n");
        System.out.println("1. Informe o valor mínimo do intervalo: ");
        valorMinimo = entrada.nextInt();

        System.out.println("2. Informe o valor máximo do intervalo: ");
        valorMaximo = entrada.nextInt();
        System.out.println();

        intervalo = valorMaximo - valorMinimo;
        intervaloDividido = (intervalo / 5);

        for (int i = 0; i < subdivisoes.length; i++) {
            IdentificadorDePrimos subdivisao;
            String nome = ("Thread #" + (i + 1));

            if (i == 0) {
                subdivisao = new IdentificadorDePrimos(nome, valorMinimo, intervaloDividido);
            } else if (i >= 1 && i <= 4) {
                subdivisao = new IdentificadorDePrimos(nome, (valorMinimo + (intervaloDividido * i)),
                        (intervaloDividido * (i + 1)));
            } else {
                subdivisao = new IdentificadorDePrimos(nome, (valorMinimo + (intervaloDividido * i)),
                        ((intervaloDividido * (i + 1)) + (intervaloDividido % (i + 1))));
            }
            subdivisoes[i] = subdivisao;
        }

        // PRIMEIRO CASO: (valorMinimo) -> (intervaloDividido)
        // SEGUNDO CASO: (valorMinimo + intervaloDividido) -> intervaloDividido * 2
        // TERCEIRO CASO: (valorMinimo + intervaloDividido * 2) -> intervaloDividido * 3
        // QUARTO CASO: (valorMinimo + intervaloDividido * 3) -> intervaloDividido * 4
        // QUINTO CASO: (valorMinimo + intervaloDividido * 4) -> (intervaloDividido * 5)
        // + (intervaloDividido % 5)
        for (int i = 0; i < subdivisoes.length; i++) {
            try {
                subdivisoes[i].start();
                subdivisoes[i].join();
                String nome = subdivisoes[i].getNome();
                String resultado = subdivisoes[i].getResultado();
                long tempoDecorrido = subdivisoes[i].getTempoDecorrido();

                System.out.println("Resultado da " + nome + ": \n" + resultado);
                System.out.println("- Tempo decorrido pela " + nome + ": " + tempoDecorrido + " milissegundo(s)\n");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        entrada.close();
    }
}

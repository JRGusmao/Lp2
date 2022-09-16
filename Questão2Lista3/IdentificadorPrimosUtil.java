package Questão2Lista3;

import java.util.Scanner;

public class IdentificadorPrimosUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os intervalos: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Runnable intervalos = new IdentificadorPrimos(a, b);
        Thread tarefa = new Thread(intervalos);
        tarefa.run();

        sc.close();

    }
}

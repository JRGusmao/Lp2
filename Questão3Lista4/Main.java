package Questão3Lista4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora = 0, minuto = 0, segundo = 0;

        System.out.println("Informe o hórario de termino");
        System.out.print("H: ");
        hora = sc.nextInt();
        System.out.print("M: ");
        minuto = sc.nextInt();
        System.out.print("S: ");
        segundo = sc.nextInt();
        System.out.println("\n");

        Runnable relogio = new RelogioExecutavel(hora, minuto, segundo);
        Thread thread = new Thread(relogio);
        thread.start();

        sc.close();

    }
}

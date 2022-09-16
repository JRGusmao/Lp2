package Questão3_4Lista2;

import java.util.Scanner;

public class ContaUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta;
        boolean deuCerto = false;
        double saldoMinimo, deposito, saque;

        System.out.print("Informe o saldo mínimo: R$");
        saldoMinimo = sc.nextDouble();
        conta = new Conta(saldoMinimo);

        System.out.println("Informe o valor a ser depositado: R$");
        deposito = sc.nextDouble();
        conta.depositar(deposito);

        do {
            System.out.println("Informe o valor para saque: R$");
            saque = sc.nextDouble();
            
            try {
                conta.sacar(saque);
                deuCerto = true;                
            } catch (Exception e) {
                System.out.println("\n" + e.getMessage());
                deuCerto = false;
            }

        } while (!deuCerto);
        System.out.println("Saque bem sucedido!");
        System.out.println("Saldo restante: R$" + conta.getSaldo());

        sc.close();
    }
}

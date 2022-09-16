package Questão2Lista3;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class IdentificadorPrimos implements Runnable {
    public int LimiteInf;
    public int LimiteSup;

    public IdentificadorPrimos(int LimiteInf, int LimiteSup) {
        this.LimiteInf = LimiteInf;
        this.LimiteSup = LimiteSup;
    }

    public void run() {
        LocalTime inicio = LocalTime.now();

        for (int i = LimiteInf; i <= LimiteSup; i++) {
            if (ePrimo(i)) {
                System.out.println(i + " é um número primo!");
            }
        }
        // Instante de tempo após termino de identificação de primos
        LocalTime termino = LocalTime.now();
        // Diferança entre os instantes de tempo
        long tempo = inicio.until(termino, ChronoUnit.MICROS);
        // Listagem do tempo
        System.out.println("Tempo total" + (": " + Thread.currentThread().getName() + " = ") + tempo);
    }

    public boolean ePrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) { // se divisivel por número atual da contagem = 0
                return false; // número não é primo
            }
        }
        // número não é primo se nenhuma divisçao resultar em resto = 0
        return true;

    }

}

package Questão3_4Lista2;

public class Conta {
    private double saldo;
    private double saldoMinimo;

    public Conta(double saldoMinimo) {
        this.saldo = 0;
        this.saldoMinimo = saldoMinimo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }

    public void sacar(double saque) throws Exception {

        if (saldo - saque < saldoMinimo) {
            throw new Exception("O valor excedeu o saldo mínimo");

        } else {
            saldo -= saque;
        }
    }

}

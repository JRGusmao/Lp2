package Questão3Lista3;

public class IdentificadorDePrimos extends Thread {

  private String nome;
  private int numeroMinimo, numemoMaximo;
  private String resultado;
  private long tempoCriacao;

  public IdentificadorDePrimos(String nome, int numeroMinimo, int numemoMaximo) {
    this.nome = nome;
    this.numeroMinimo = numeroMinimo;
    this.numemoMaximo = numemoMaximo;
    this.tempoCriacao = System.currentTimeMillis();
    this.resultado = "";
  }

  public void run() {
    System.out.println("* Operação iniciada - " + nome.toUpperCase() + " *");

    for (int i = this.numeroMinimo; i <= this.numemoMaximo; i++) {
      if (ePrimo(i)) {
        this.resultado += i + "\n";

      }
    }
  }

  public String getResultado() {
    return this.resultado;
  }

  long getTempoDecorrido() {
    long tempoAtual = System.currentTimeMillis();
    return (tempoAtual - this.tempoCriacao);
  }

  public String getNome() {
    return this.nome;
  }

  private boolean ePrimo(int numero) {
    for (int i = 2; i < numero; i++) {
      if (numero % i == 0) {
        return false;
      }
    }
    return true;
  }

}

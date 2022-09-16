package Questão2Lista4;
/*Um número triangular é um número natural cujo valor é obtido pela soma de determinada quantidade dos primeiros números
naturais. A título de exemplo, o número 10 é dado como um número triangular, justamente por seu valor ser obtido a partir da
soma de 1, 2, 3 e 4; mesmo raciocínio não se aplica ao número 12, já que a soma dos 4 (quatro) primeiros números naturais é
inferior a ele (1 + 2 + 3 + 4 = 10) e a soma dos 5 (cinco) primeiros naturais é superior a ele (1 + 2 + 3 + 4 +5 = 15). Escreva
uma classe que implemente a interface java.lang.Runnable, para fins de identificação e exibição, via método
System.out.println, de números triangulares inferiores a determinado número natural definido no momento da instanciação
de cada objeto, a ser indicado na forma de parâmetro para o construtor da classe. Quando da escrita do método run, exige-se
uso de marcadores de tempo para cálculo de tempo de processamento da operação de identificação e exibição de números
triangulares (aqui sugere-se o uso da classe java.time.LocalTime).*/

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Triangular implements Runnable{
    private int limite;

    public Triangular(int limite){
        this.limite = limite;
    }

    public boolean eTriangular(int resultado){
        int soma = 0;

        for (int i = 0; i < resultado; i++) {
            soma += i;

            if (soma == resultado) {
                return true;
            } else if(soma > resultado){
                break;
            }

        }

        return false;

    }

    @Override
    public void run() {
        LocalTime inicio = LocalTime.now();

        for (int i = 0; i < limite; i++) {
            if (eTriangular(i)) {
                System.out.println(i + " é um número triangular");
            }
        }
        LocalTime termino = LocalTime.now();
        long tempo = inicio.until(termino, ChronoUnit.MILLIS);
        System.out.println("Tempo total em milissegundos: " + tempo);
    }              

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int resultado = sc.nextInt();

        Runnable runnable = new Triangular(resultado);

        Thread thread = new Thread(runnable);

        thread.start();
        
        sc.close();

    }

}

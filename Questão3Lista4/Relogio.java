package Questão3Lista4;
/*Considere a implementação da classe abaixo, para fins de abstração de relógios digitais baseados no sistema horário de 24
horas. O método addSegundo é responsável pela atualização do horário segundo a segundo.
________________________________________________________________________________________________________________________________

Escreva uma classe, de nome RelogioExecutavel, que simultaneamente herde a classe Relogio e implemente a interface
java.lang.Runnable, de modo a permitir que a atualização do horário (segundo a segundo) possa ser executada
concorrentemente com outras tarefas, pela instanciação de objetos da classe java.lang.Thread a partir de objetos
instanciados dessa nova classe. Deverá ser considerado como horário de inicialização 0h 0min 0s. A atualização deve ser
encerrada ao se alcançar horário de término indicado ao construtor da classe. A cada atualização, deve ser exibido horário em
formato hh:mm:ss acompanhado de percentual de tempo decorrido em relação ao tempo de término (a título de exemplo, caso o
horário corrente seja 0h 0min 15s e o horário de término seja 0h 1min 0s, esse percentual seria de 25%).
Além disso, solicita-se que seja escrita classe utilitária com a qual sejam demonstradas capacidades da classe
RelogioExecutavel. A classe utilitária deve dispor de método estático main através do qual seja instanciado um objeto
daquela classe (RelogioExecutavel), com a indicação de horário de término através de operações de entrada. */

public class Relogio {
    protected int hora;
    protected int minuto;
    protected int segundo;

    public Relogio() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void addSegundo() {
        int t = hora * 24 * 60 + minuto * 60 + segundo; // conversão em total de segundos
        t++; // incremento de 1 (um) segundo
        hora = t / (24 * 60);
        minuto = t % (24 * 60) / 60;
        segundo = t % 60;
    }

    public String toString() {
        return (hora < 10 ? "0" : "") + hora + ":" +
                (minuto < 10 ? "0" : "") + minuto + ":" +
                (segundo < 10 ? "0" : "") + segundo;
    }
}

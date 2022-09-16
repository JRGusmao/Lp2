package Questão3Lista4;

public class RelogioExecutavel extends Relogio implements Runnable  {

    private int terminoSegundos;

    public RelogioExecutavel(int horaTermino, int minutoTermino, int segundosTermino) {
        super();
       this.terminoSegundos = (horaTermino * 1440) + (minutoTermino * 60) + segundosTermino;

    }

    @Override
    public void run() {
        while (isAtivo()) {
            try {
                Thread.sleep(2000);
                this.addSegundo();
                System.out.println("Contador atual: " + this.toString());
                System.out.println("Percentual até o termino: " + this.getPercentualTermino() + "%\n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           
        }
        System.out.println("\nO hórario de término foi atingido. Contador encerrado.");
    }

    public boolean isAtivo() {
        if ((this.terminoSegundos - this.getTempoSegundos() != 0)) {
            return true;

        } else {
            return false;
        }
    }

    public double getPercentualTermino() {
        return ((double) (this.getTempoSegundos() * 100) / this.terminoSegundos);
    }

    public int getTempoSegundos() {
        return (hora * 1440) + (minuto * 60) + segundo;
    }

}

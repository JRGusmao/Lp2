package Questão1Lista02;

import java.util.Scanner;

public  class FormaGeometricaUtil {

    public static void main(String[] args) {
        int n;
        double base, altura, lado, raio;
        char tipoForma;

        Scanner sc = new Scanner(System.in);
        FormaGeometrica[] formas;

        System.out.print("Informe quantidade de formas geométricas: ");
        n = sc.nextInt();

        formas = new FormaGeometrica[n];

        for (int i = 0; i < n; i++){
            System.out.println("Forma " + (i+1));

            System.out.println("Tipo de forma (R/Q/C): ");
            tipoForma = sc.next().charAt(0);

            switch (tipoForma) {
                case 'r':
                case 'R':
                System.out.println("Comprimento de base: ");
                base = sc.nextDouble();
                System.out.println("Comprimento da altura: ");
                altura = sc.nextDouble();

                formas[i] = new Retangulo(base, altura);
                    break;

                case 'c':
                case 'C':
                System.out.println("Comprimento de raio: ");
                raio = sc.nextDouble();

                formas[i] = new Circulo(raio);
                break;

                case 'q':
                case 'Q':
                System.out.println("Comprimento de lado: ");
                lado = sc.nextDouble();

                formas[i] = new Quadrado(lado);
                break;
            }

        }
		
		sc.close();
	}
        
}
      

  /*System.out.println("Informe o valor dos lados: ");
            Quadrado f1 = new Quadrado(0);
            f1.setLado1(sc.nextDouble());
            System.out.println("Area = " + f1.area());

            sc.close();*/


        /*Quadrado f1 = new Quadrado(0);
        f1.setLado1(1);
        f1.setLado2(1);
        f1.setLado3(1);
        f1.setLado4(1);

        Circulo f2 = new Circulo(0);
        f2.setRaio(2);

        Retangulo f3 = new Retangulo(0, 0);
        f3.setLado1(1);
        f3.setLado2(1);
        f3.setLado3(1);
        f3.setLado4(1);

        FormaGeometrica[] formas = new FormaGeometrica[3];
        formas [0] = f1;
        formas [1] = f2;
        formas [2] = f3;*/


package CifraDeCesar;

import java.util.Scanner;

public class CifraDeCesarUtil extends CifraDeCesar{
    public static void main(String[] args) {
    
        
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("*****************************************************");

            System.out.print("Informe o texto a ser criptografado: ");
            String texto = entrada.nextLine();
            int chave = 3;

            String textoCriptografado = encriptar(chave, texto);

            System.out.println("\n\nTexto Criptografado: " + textoCriptografado);
            
        }

        System.out.println("******************************************************");

}     
}

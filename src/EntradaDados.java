import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner entradaDeDados = new Scanner(System.in);
        String algoDigitado;

        System.out.println("Digite algo aqui: ");
        algoDigitado = entradaDeDados.nextLine();

        System.out.println("O que foi digitado:  " + algoDigitado);
    }
}

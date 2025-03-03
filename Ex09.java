import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero");
        double x = teclado.nextDouble();

        int inteiro = (int) x;
        double decimal = x - inteiro;

        if (decimal >= 0.5) {
            inteiro += 1;
        }
        System.out.println("Numero arredondado: " + inteiro);
    }
}
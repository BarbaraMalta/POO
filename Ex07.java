import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a variavel");
        int n = teclado.nextInt();

        if (n % 2 == 0) {
            System.out.println("O numero " + n + " é par.");
        } else {
            System.out.println("O numero " + n + " é ímpar.");
        }
    }
}

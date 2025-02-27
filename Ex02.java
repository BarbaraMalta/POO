import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        Float a = teclado.nextFloat();
        System.out.println("Digite o segundo numero");
        Float b = teclado.nextFloat();

        Float soma = a + b;
        System.out.printf("A soma de %f e %f eh %f", a, b, soma);
    }
}

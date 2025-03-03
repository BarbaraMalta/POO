import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um caractere para a operacao");
        char op = teclado.Next().charAt(0);
        System.out.println("Digite um numero a");
        int a = teclado.nextInt();
        System.out.println("Digite um numero b");
        int b = teclado.nextInt();

        if (op == +) {
            float resultado = a + b;
        }
}

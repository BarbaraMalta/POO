import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um caractere para a operacao");
        String op = teclado.next();
        System.out.println("Digite um numero a");
        float a = teclado.nextFloat();
        System.out.println("Digite um numero b");
        float b = teclado.nextFloat();

        switch (op) {
            case "/":
                System.out.println(a / b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "+":
                System.out.println(a + b);
                break;
            default:
                System.out.println("Escreva um caractere valido");
                break;
        }
    }
}

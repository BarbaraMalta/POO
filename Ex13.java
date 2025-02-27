import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero (a)");
        int a = teclado.nextInt();
        System.out.println("Digite o numero (b)");
        int b = teclado.nextInt();
        int soma = 0, qtd = 0;

        for (int i = a; a <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                soma += 1;
                qtd++;
            }
        }
    }
}
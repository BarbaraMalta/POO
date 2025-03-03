import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n = teclado.nextInt();
        System.out.println("Digite um numero para limite superior");
        int sup = teclado.nextInt();
        System.out.println("Digite um numero para limite inferior");
        int inf = teclado.nextInt();

        if (n < inf) {
            System.out.println("O número " + n + " está antes do intervalo.");
        } else if (n > sup) {
            System.out.println("O número " + n + " está depois do intervalo.");
        } else {
            System.out.println("O número " + n + " está dentro do intervalo.");
        }
    }
}

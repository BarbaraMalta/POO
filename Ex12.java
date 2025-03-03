import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero (a)");
        int a = teclado.nextInt();
        System.out.println("Digite o numero (b)");
        int b = teclado.nextInt();
        int soma = 0, qtd = 0;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println("Esses são os pares: ");

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                soma += i;
                qtd++;
            }
        }
            double media = (double) soma / qtd;
            System.out.println("Essa eh a soma: "+ soma);
            System.out.println("Essa eh a media"+ media);
    }
}
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o salario");
        Float salario = teclado.nextFloat();
        System.out.println("Digite a porcentagem de aumento");
        Float aumento = teclado.nextFloat();

        Float salarioFinal = salario + salario*(aumento/100);
        System.out.printf("O salario final eh: "+ salarioFinal+ " reais");
    }
}

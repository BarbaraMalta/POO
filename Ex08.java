import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de kilowatts consumidos");
        float consumidos = teclado.nextFloat();
        System.out.println("Digite o valor do kilowatt");
        float valorkw = teclado.nextFloat();
        double valorpagar = consumidos * valorkw;

        if (consumidos < 150) {
            valorpagar = valorpagar - (valorpagar * 0.10);
            System.out.println("O valor a pagar eh " + valorpagar + " reais.");
        } else {
            System.out.println("O valor a pagar eh " + valorpagar + " reais.");
        }
    }
}

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        final float PI = 3.14f;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o raio");
        float raio = teclado.nextFloat();

        float perimetro = 2*PI*raio;
        System.out.println("O perimetro eh: " + perimetro);

        float area = PI*raio*raio;
        System.out.println("A area eh: " + area);
    }
}

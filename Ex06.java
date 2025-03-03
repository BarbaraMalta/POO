import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a distância percorrida em km");
        float distancia = teclado.nextFloat();
        System.out.println("Digite o tempo gasto em horas");
        float tempo = teclado.nextFloat();
        System.out.println("Digite a gasolina consumida em litros");
        float gasolina = teclado.nextFloat();

        float velo_media = distancia / tempo;
        System.out.println("A velocidade media eh: " + velo_media + "Km/h");

        float consumo = distancia / gasolina;
        System.out.println("O consumo de combustivel eh: " + consumo + "Km/l");
    }
}

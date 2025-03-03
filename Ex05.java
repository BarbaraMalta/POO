import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os segundos");
        long segs = teclado.nextLong();

        long horas = segs / 3600;
        long minutos = (segs % 3600) / 60;
        long segundos = segs % 60;

        System.out.println("A conversão do tempo será de:" + horas + "h " + minutos + "min " + segundos + "s");
    }
}
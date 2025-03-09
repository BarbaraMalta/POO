import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite as notas dos alunos");
        float soma = 0;
        float media = 0;
        int qntdalunos = 0;
        float maiornt = 0;
        float menornt = 10;

        while (media == 0) {
            float temp = teclado.nextFloat();
            if (temp == -1) {
                break;
            }
            if (temp > maiornt) {
                maiornt = temp;
            }
            if (temp < menornt) {
                menornt = temp;
            }
        soma += temp;
        qntdalunos = qntdalunos + 1;
        }
        media = soma/qntdalunos;
        System.out.println(qntdalunos);
        System.out.println(media);
        System.out.println(maiornt);
        System.out.println(menornt);
    }
}

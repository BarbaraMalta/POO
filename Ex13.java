import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero de alunos");
        int alunos = teclado.nextInt();
        double soma = 0;
        for (int i = 1; i <= alunos; i++) {
            System.out.print("Digite a nota do aluno: " + i);
            double nota = teclado.nextDouble();
            soma += nota;
        }
        double media = soma / alunos;
        System.out.println("A media eh: " + media);
    }
}

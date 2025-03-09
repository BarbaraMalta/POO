import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os caracteres");
        char caracteres = ' ';
        int vogais = 0;
        int digitos = 0;
        int outros = 0;

        while (caracteres != '.'){
            caracteres = teclado.next().charAt(0);
            if (caracteres == '.') {
                break;
            } else if (caracteres == '0' || caracteres == '1' || caracteres == '3' || caracteres == '4' || caracteres == '5' || caracteres == '6' || caracteres == '7' || caracteres == '8' || caracteres == '9') {
                digitos++;
            } else if (caracteres == 'a' || caracteres == 'e' || caracteres == 'i' || caracteres == 'o' || caracteres == 'u' || caracteres == 'A' || caracteres == 'E' || caracteres == 'I' || caracteres == 'O' || caracteres == 'U') {
                vogais++;
            } else {
                outros++;
            }
        }
        System.out.println("Qntd de vogais: "+ vogais);
        System.out.println("Qntd de digitos: "+ digitos);
        System.out.println("Qntd de outros caracteres: "+ outros);
        }
}

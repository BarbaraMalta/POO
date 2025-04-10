package ex8;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        motor motor1 = new motor(1.0f);
        carro carro1 = new carro(motor1, "Fiat Uno");
    }
}
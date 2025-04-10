package ex8;

public class carro {
    motor motor;
    String modelo;

    public carro(motor motor, String modelo) {
        this.motor = motor;
        this.modelo = modelo;
    }

    carro(String modelo, float cilindrada) {
        this.modelo = modelo;
        this.motor= new motor(cilindrada);
    }

    float velocidadeMaxima() {
        if (motor.getCilindrada() <= 1){
            return 140;
        } else if (motor.getCilindrada()<=1.6f) {
            return 180;
        } else if (motor.getCilindrada() <=2) {
            return 220;
        } else return 260;
    }
}

class Veiculo {
    void mover() {
        System.out.println("Veículo se movendo...");
    }
}

class Carro extends Veiculo {
    void mover() {
        System.out.println("Carro andando 🚗");
    }
}

class Bicicleta extends Veiculo {
    void mover() {
        System.out.println("Bicicleta pedalando 🚴");
    }
}

public class Main {
    public static void moverVeiculo(Veiculo v) {
        v.mover();
    }

    public static void main(String[] args) {

        Veiculo carro = new Carro();
        Veiculo bike = new Bicicleta();

        moverVeiculo(carro);
        moverVeiculo(bike);
    }
}

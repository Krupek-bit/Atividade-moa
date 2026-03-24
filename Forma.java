import java.util.*;

abstract class Forma {
    abstract double area();
}

class Retangulo extends Forma {
    double largura, altura;

    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    double area() {
        return largura * altura;
    }
}

class Circulo extends Forma {
    double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    double area() {
        return Math.PI * raio * raio;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Forma> formas = new ArrayList<>();
        formas.add(new Retangulo(5, 2));
        formas.add(new Circulo(3));
        formas.add(new Retangulo(4, 4));

        double soma = 0;

        for (Forma f : formas) {
            soma += f.area();
        }

        System.out.println("Soma das áreas: " + soma);
    }
}

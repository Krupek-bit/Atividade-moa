import java.util.*;

class Produto {
    String nome;
    double preco;
    int quantidade;

    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String toString() {
        return "Produto: " + nome + " (" + quantidade + ") - R$ " + preco;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Notebook", 3500, 2));
        produtos.add(new Produto("Mouse", 100, 5));
        produtos.add(new Produto("Teclado", 200, 3));

        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}

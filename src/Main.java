import Entidades.Produto;
import Entidades.ProdutoImportado;
import Entidades.ProdutoUsado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new ProdutoImportado("Tênis", 500.0,"Preta", "Asics"));
        produtos.add(new ProdutoImportado("Blusa", 150.0, "Rosa", "Dudalina"));
        produtos.add(new ProdutoUsado("Faca", 250.0,15.0,5.0));
        produtos.add(new ProdutoUsado("Frigideira", 100.0,20.0,15.0));

        produtos.forEach(System.out::println);





    }
}
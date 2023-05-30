import Entidades.Produto;
import Entidades.ProdutoImportado;
import Entidades.ProdutoUsado;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
//        produtos.add(new ProdutoImportado("Tênis", 500.0,"Preta", "Asics"));
//        produtos.add(new ProdutoImportado("Blusa", 150.0, "Rosa", "Dudalina"));
//        produtos.add(new ProdutoUsado("Faca", 250.0,15.0,5.0));
//        produtos.add(new ProdutoUsado("Frigideira", 100.0,20.0,15.0));
//        produtos.forEach(System.out::println);

        List<Produto> produtos = new ArrayList<>();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o número de produtos:");
        System.out.print("> ");
        int n = scanner.nextInt();

        System.out.println("Digite o nome do produto:");
        String nome = scanner.next().toLowerCase();
        System.out.println("Digite o preço do produto:");
        Double preco = scanner.nextDouble();

        for (int i = 0 ; i < n ; i++){
            System.out.println("Escolha o tipo de produto: [c]omum, [u]sado ou [i]mportado?");
            char escolha = scanner.next().toLowerCase().charAt(0);

            if (escolha == 'c'){
                produtos.add(new Produto(nome, preco));
            } else if (escolha == 'u') {
                System.out.println("Digite a data de fabricação:");
                try {
                    Date data = formato.parse(scanner.next());
                    produtos.add(new ProdutoUsado(nome, preco, data));
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            } else if (escolha == 'i') {
                System.out.println("Digite o valor da taxa: ");
                double valorTaxa = scanner.nextDouble();
                produtos.add(new ProdutoImportado(nome, preco, valorTaxa));
            }
        }
        System.out.println("Listagem dos produtos cadastrados:");
        for (Produto produto : produtos){
            System.out.println(produto);
        }
    }
}

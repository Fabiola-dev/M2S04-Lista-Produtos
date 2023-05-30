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
    public static void main(String[] args) throws ParseException {

        ArrayList<Produto> produtos = new ArrayList<>();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número de produtos que deseja cadastrar:"));

        for (int i = 0 ; i < numero ; i++){
            String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
            Double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
            char letra = JOptionPane.showInputDialog(null, "Escolha a categoria do produto: [c]omum, [u]sado ou [i]mportado?").charAt(0);

            switch (letra){
                case 'c':
                    produtos.add(new Produto(nome, preco));
                    break;
                case 'u':
                    Date data = formato.parse(JOptionPane.showInputDialog("Digite a data de fabricação:"));
                    produtos.add(new ProdutoUsado(nome, preco, data));
                    break;
                case 'i':
                    Double taxa = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da taxa:"));
                    produtos.add(new ProdutoImportado(nome, preco, taxa));
                    break;
                default:
                    System.out.println("Categoria inválida!");
            }
        }
        System.out.println("Lista de produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}

package Entidades;

public class ProdutoImportado extends Produto {

    private String cor;
    private String marca;

    public ProdutoImportado(String nome, double preco, String cor, String marca) {
        super(nome, preco);
        this.cor = cor;
        this.marca = marca;
    }

    public String toString() {
        return super.toString() + " | Cor: " + this.cor + " | Marca: " + this.marca;
    }

}

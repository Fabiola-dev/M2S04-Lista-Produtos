package Entidades;

public class ProdutoImportado extends Produto {

    private double taxa;

    public ProdutoImportado(String nome, double preco, double taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }

    public String toString() {
        return super.toString() + " | Taxa: " + this.taxa;
    }

}

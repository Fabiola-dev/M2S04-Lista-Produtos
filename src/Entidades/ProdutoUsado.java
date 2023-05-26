package Entidades;

public class ProdutoUsado extends Produto {

    private double comprimento;
    private double largura;

    public ProdutoUsado(String nome, double preco, double comprimento, double largura) {
        super(nome, preco);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public String toString() {
        return super.toString() + " | Comprimento: " + comprimento + " | Largura: " + largura;
    }
}

package Entidades;

import java.util.Date;

public class ProdutoUsado extends Produto {

    private Date data;

    public ProdutoUsado(String nome, double preco, Date data) {
        super(nome, preco);
        this.data = data;
    }

    @Override
    public String toString() {
        return super.toString() + " | Data de fabricação: " + data;
    }
}

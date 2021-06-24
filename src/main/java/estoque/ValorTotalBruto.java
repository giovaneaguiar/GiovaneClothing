package estoque;

import java.util.List;

public class ValorTotalBruto {

    private float valorTotal = 0.0f;

    public float getValorTotal() {

        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {

        this.valorTotal = valorTotal;
    }

    public float mostrarTotalBruto(List<Estoque> estoqueGiovaneClothing) {

        for (Estoque estoque : estoqueGiovaneClothing) {
            //preenchimento de estoque
            valorTotal = valorTotal + estoque.calculaValorProdutosDeAcordoComQuantidade();
        }
        return this.valorTotal;
    }
}

package estoque;

public class CamisaBlack extends Estoque {
    private float precoCamisaBlack;
    private int quantidadeCamisaBlack;

    public float getPrecoCamisaBlack() {

        return precoCamisaBlack;
    }

    public void setPrecoCamisaBlack(float precoCamisaBlack) {

        this.precoCamisaBlack = precoCamisaBlack;
    }

    public int getQuantidadeCamisaBlack() {

        return quantidadeCamisaBlack;
    }

    public void setQuantidadeCamisaBlack(int quantidadeCamisaBlack) {

        this.quantidadeCamisaBlack = quantidadeCamisaBlack;
    }

    @Override
    public float calculaValorProdutosDeAcordoComQuantidade() {

        return quantidadeCamisaBlack * precoCamisaBlack;
    }

}

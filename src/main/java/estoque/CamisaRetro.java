package estoque;

public class CamisaRetro extends Estoque {
    private float precoCamisaRetro;
    private int quantidadeCamisaRetro;

    public float getPrecoCamisaRetro() {

        return precoCamisaRetro;
    }

    public void setPrecoCamisaRetro(float precoCamisaRetro) {

        this.precoCamisaRetro = precoCamisaRetro;
    }

    public int getQuantidadeCamisaRetro() {

        return quantidadeCamisaRetro;
    }

    public void setQuantidadeCamisaRetro(int quantidadeCamisaRetro) {

        this.quantidadeCamisaRetro = quantidadeCamisaRetro;
    }

    @Override
    public float calculaValorProdutosDeAcordoComQuantidade() {

        return quantidadeCamisaRetro * precoCamisaRetro;
    }
}

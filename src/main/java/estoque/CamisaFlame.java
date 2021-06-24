package estoque;

public class CamisaFlame extends Estoque {
    private float precoCamisaFlame;
    private int quantidadeCamisaFlame;

    public float getPrecoCamisaFlame() {

        return precoCamisaFlame;
    }

    public void setPrecoCamisaFlame(float precoCamisaFlame) {

        this.precoCamisaFlame = precoCamisaFlame;
    }

    public int getQuantidadeCamisaFlame() {

        return quantidadeCamisaFlame;
    }

    public void setQuantidadeCamisaFlame(int quantidadeCamisaFlame) {

        this.quantidadeCamisaFlame = quantidadeCamisaFlame;
    }

    @Override
    public float calculaValorProdutosDeAcordoComQuantidade() {

        return quantidadeCamisaFlame * precoCamisaFlame;
    }
}

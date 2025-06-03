public class Bebida extends Produto {
    private int volumeMl;

    public Bebida(String codigo, String nome, double precoBase, int volumeMl) {
        super(codigo, nome, precoBase, "Bebida");
        this.volumeMl = volumeMl;
    }

    public int getVolumeMl() {
        return volumeMl;
    }

    public void setVolumeMl(int volumeMl) {
        this.volumeMl = volumeMl;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoFinal = getPrecoBase();
        if (volumeMl > 1000) {
            precoFinal *= 1.05;
        }
        return precoFinal;
    }

    @Override
    public String getTipoProduto() {
        return "Bebida Refrescante";
    }
}
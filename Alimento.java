public class Alimento extends Produto {
    private String dataValidade;

    public Alimento(String codigo, String nome, double precoBase, String dataValidade) {
        super(codigo, nome, precoBase, "Alimento");
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoFinal = getPrecoBase();
        if (dataValidade.equalsIgnoreCase("VENCENDO HOJE")) {
            precoFinal *= 0.8;
            System.out.println("(Desconto por validade aplicado em " + getNome() + ")");
        }
        return precoFinal;
    }

    @Override
    public String getTipoProduto() {
        return "Alimento Fresco";
    }
}
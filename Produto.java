public abstract class Produto {
    private String codigo;
    private String nome;
    private double precoBase;
    private String categoria;

    public Produto(String codigo, String nome, double precoBase, String categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoBase = precoBase;
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public abstract double calcularPrecoFinal();

    public String getTipoProduto() {
        return "Produto Genérico da Categoria: " + this.categoria;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + " (Cód: " + codigo + "), Preço Base: R$" + precoBase);
    }
}
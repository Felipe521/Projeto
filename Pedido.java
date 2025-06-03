import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemVenda> itens;
    private String nomeCliente;

    public Pedido(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.itens = new ArrayList<>();
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        if (produto != null && quantidade > 0) {
            ItemVenda novoItem = new ItemVenda(produto, quantidade);
            this.itens.add(novoItem);
            System.out.println(quantidade + "x " + produto.getNome() + " adicionado ao pedido de " + nomeCliente + ".");
        }
    }

    public double calcularTotalPedido() {
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void mostrarDetalhesPedido() {
        System.out.println("\n--- Detalhes do Pedido de: " + nomeCliente + " ---");
        if (itens.isEmpty()) {
            System.out.println("Pedido vazio.");
            return;
        }
        for (ItemVenda item : itens) {
            Produto p = item.getProduto();
            System.out.println(
                    "- " + p.getNome() + " (" + p.getTipoProduto() + ")" +
                            " | Qtd: " + item.getQuantidade() +
                            " | Preço Un. Final: R$" + String.format("%.2f", p.calcularPrecoFinal()) +
                            " | Subtotal: R$" + String.format("%.2f", item.calcularSubtotal())
            );
        }
        System.out.println("--------------------------------------");
        System.out.println("Valor Total do Pedido: R$" + String.format("%.2f", calcularTotalPedido()));
        System.out.println("--------------------------------------");
    }
}
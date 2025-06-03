public class LojaApp {
    public static void main(String[] args) {
        System.out.println("Bem-vindo à Loja Virtual!\n");

        Alimento maca = new Alimento("A001", "Maçã Fuji", 3.50, "10/07/2025");
        Alimento pao = new Alimento("A002", "Pão Integral", 7.00, "VENCENDO HOJE");
        Bebida suco = new Bebida("B001", "Suco de Laranja", 5.00, 500);
        Bebida refrigerante = new Bebida("B002", "Refrigerante 2L", 9.00, 2000);

        System.out.println("--- Demonstração de Informações dos Produtos ---");
        Produto[] catalogo = {maca, pao, suco, refrigerante};
        for (Produto prod : catalogo) {
            prod.exibirInfo();
            System.out.println("Tipo Específico: " + prod.getTipoProduto());
            System.out.println("Preço Final Calculado: R$" + String.format("%.2f", prod.calcularPrecoFinal()));
            System.out.println("-----");
        }

        Pedido pedidoDoJoao = new Pedido("João Silva");

        pedidoDoJoao.adicionarItem(maca, 4);
        pedidoDoJoao.adicionarItem(pao, 2);
        pedidoDoJoao.adicionarItem(refrigerante, 1);
        pedidoDoJoao.adicionarItem(suco, 3);

        pedidoDoJoao.mostrarDetalhesPedido();

        Pedido pedidoVazio = new Pedido("Cliente Fantasma");
        pedidoVazio.mostrarDetalhesPedido();
    }
}

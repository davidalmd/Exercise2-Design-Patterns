package logistica;

public class PedidoFacade {
    public void processarPedido(Produto produto) {
        if (ServicoEstoque.isAvailable(produto)) {
            if (ServicoPagamento.makePayment(produto.preco)) {
                ServicoEstoque.reduzirEstoque(produto);
                ServicoRemessa.shipProduct(produto);
                System.out.println("Processamento do pedido concluído com sucesso!");
            } else {
                System.out.println("Pedido interrompido por falha no pagamento, processamento cancelado!");
            }
        } else {
            System.out.println("Pedido interrompido por falta de estoque, processamento cancelado!");
        }
    }
}

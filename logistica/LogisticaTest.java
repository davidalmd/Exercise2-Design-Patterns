package logistica;

public class LogisticaTest {
    public static void main(String[] args) {
        Produto smartphone = new Produto(1, "Smartphone", 800.00);
        Produto laptop = new Produto(2, "Laptop", 1500.00);
        Produto tablet = new Produto(3, "Tablet", 300.00); // Produto sem estoque definido inicialmente

        PedidoFacade pedidoFacade = new PedidoFacade();

        // 1. Tentando processar o pedido de um produto que não está no estoque (tablet)
        pedidoFacade.processarPedido(tablet);

        // 2. Tentando processar o pedido de um produto com saldo insuficiente (laptop)
        pedidoFacade.processarPedido(laptop);

        // 3. Processando o pedido de um smartphone com sucesso
        pedidoFacade.processarPedido(smartphone);

        // 4. Tentando processar outro pedido de smartphone até o saldo esgotar
        pedidoFacade.processarPedido(smartphone);
    }
}

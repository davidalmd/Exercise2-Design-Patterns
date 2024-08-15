package logistica;

public class ServicoPagamento {
    private static double saldoCliente = 1000.00; // Simulando saldo do cliente

    public static boolean makePayment(double valor) {
        System.out.println("Tentando processar pagamento de: R$ " + valor);
        if (saldoCliente >= valor) {
            saldoCliente -= valor;
            System.out.println("Pagamento aprovado. Saldo restante: R$ " + saldoCliente);
            return true;
        } else {
            System.out.println("Pagamento recusado. Saldo insuficiente.");
            return false;
        }
    }
}

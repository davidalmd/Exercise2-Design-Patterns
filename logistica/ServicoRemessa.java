package logistica;

import java.util.LinkedList;
import java.util.Queue;

public class ServicoRemessa {
    private static Queue<Produto> filaRemessas = new LinkedList<>();

    public static void shipProduct(Produto produto) {
        filaRemessas.add(produto);
        System.out.println("Produto " + produto.name + " adicionado à fila de remessas.");
        processarRemessa();
    }

    private static void processarRemessa() {
        Produto produtoEnviado = filaRemessas.poll();
        System.out.println("Produto " + produtoEnviado.name + " enviado ao cliente.");
    }
}

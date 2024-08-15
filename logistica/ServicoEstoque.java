package logistica;

import java.util.HashMap;
import java.util.Map;

public class ServicoEstoque {
    private static Map<Integer, Integer> estoque = new HashMap<>();

    static {
        // Simulando estoque inicial de produtos
        estoque.put(1, 10); // 10 unidades do produto com ID 1
        estoque.put(2, 5);  // 5 unidades do produto com ID 2
    }

    public static boolean isAvailable(Produto produto) {
        int quantidade = estoque.getOrDefault(produto.productId, 0);
        System.out.println("Verificando disponibilidade do produto: " + produto.name + " | Quantidade disponível: " + quantidade);
        return quantidade > 0;
    }

    public static void reduzirEstoque(Produto produto) {
        int quantidadeAtual = estoque.get(produto.productId);
        estoque.put(produto.productId, quantidadeAtual - 1);
        System.out.println("Produto " + produto.name + " retirado do estoque. Quantidade restante: " + (quantidadeAtual - 1));
    }
}

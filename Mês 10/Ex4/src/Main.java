import java.util.List;

public class Main {

    public static void main(String[] args) {
        MateriaisDeConstrucao loja = new MateriaisDeConstrucao();

        loja.adicionarProduto(new Produto("Makita", "Furadeira HP1640", 450.00, 10));
        loja.adicionarProduto(new Produto("Makita", "Serra Circular 5007N", 780.00, 5));
        loja.adicionarProduto(new Produto("Makita", "Parafusadeira DF333", 320.00, 8));
        loja.adicionarProduto(new Produto("Bosch", "Esmerilhadeira GWS 700", 290.00, 12));
        loja.adicionarProduto(new Produto("Bosch", "Martelete GBH 2-24", 950.00, 3));

        // Produto mais caro de uma marca
        Produto maisCaro = loja.getProdutoMaisCaroPorMarca("Makita");
        System.out.println("Produto mais caro da Makita:");
        System.out.println(maisCaro);

        // Produtos de uma marca em um intervalo de preço
        System.out.println("\nProdutos da Makita entre R$ 300,00 e R$ 500,00:");
        List<Produto> filtrados = loja.getProdutosPorMarcaEFaixaDePreco("Makita", 300, 500);
        for (Produto p : filtrados) {
            System.out.println(p);
        }

        // Adicionar estoque
        Produto furadeira = filtrados.get(0);
        furadeira.adicionarEstoque(5);
        System.out.println("\nApós adicionar 5 unidades: " + furadeira);

        // Vender
        double total = furadeira.vender(7);
        System.out.printf("%nVenda de 7 unidades: R$ %.2f%n", total);
        System.out.println("Estoque atual: " + furadeira);

        // Tentativa de vender além do estoque
        try {
            furadeira.vender(100);
        } catch (IllegalStateException e) {
            System.out.println("\nErro: " + e.getMessage());
        }
    }
}
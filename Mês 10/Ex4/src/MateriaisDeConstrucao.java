import java.util.ArrayList;
import java.util.List;

public class MateriaisDeConstrucao {

    private List<Produto> produtos;

    public MateriaisDeConstrucao() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return new ArrayList<>(produtos);
    }

    /**
     * Retorna o produto mais caro de uma determinada marca.
     *
     * @return o produto mais caro ou null se a marca não possuir produtos
     */
    public Produto getProdutoMaisCaroPorMarca(String marca) {
        Produto maisCaro = null;

        for (Produto p : produtos) {
            if (p.getMarca().equalsIgnoreCase(marca)) {
                if (maisCaro == null || p.getPreco() > maisCaro.getPreco()) {
                    maisCaro = p;
                }
            }
        }
        return maisCaro;
    }

    /**
     * Retorna todos os produtos de uma marca cujo preço esteja entre
     * minimo e maximo (inclusive).
     */
    public List<Produto> getProdutosPorMarcaEFaixaDePreco(String marca, double minimo, double maximo) {
        if (minimo > maximo) {
            throw new IllegalArgumentException("O preço mínimo não pode ser maior que o máximo.");
        }

        List<Produto> resultado = new ArrayList<>();

        for (Produto p : produtos) {
            if (p.getMarca().equalsIgnoreCase(marca)
                    && p.getPreco() >= minimo
                    && p.getPreco() <= maximo) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}
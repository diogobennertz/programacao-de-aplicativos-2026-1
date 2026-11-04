public class Produto {

    private String marca;
    private String modelo;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String marca, String modelo, double preco, int quantidadeEstoque) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        if (quantidadeEstoque < 0) {
            throw new IllegalArgumentException("O estoque não pode ser negativo.");
        }
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    /** Adiciona mais unidades ao estoque. */
    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade a adicionar deve ser maior que zero.");
        }
        this.quantidadeEstoque += quantidade;
    }

    /**
     * Vende unidades do produto. Só é possível vender até a quantidade
     * disponível em estoque.
     *
     * @return o valor total da venda
     */
    public double vender(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade a vender deve ser maior que zero.");
        }
        if (quantidade > this.quantidadeEstoque) {
            throw new IllegalStateException(
                    "Estoque insuficiente. Disponível: " + this.quantidadeEstoque
                            + ", solicitado: " + quantidade);
        }
        this.quantidadeEstoque -= quantidade;
        return quantidade * this.preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    @Override
    public String toString() {
        return String.format("Produto{marca='%s', modelo='%s', preço=R$ %.2f, estoque=%d}",
                marca, modelo, preco, quantidadeEstoque);
    }
}
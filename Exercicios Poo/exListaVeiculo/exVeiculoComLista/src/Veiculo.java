public class Veiculo {
    // Atributos
    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private double preco;

    // Construtor Padrão
    public Veiculo() {
    }

    // Construtor Completo com todos os parâmetros
    public Veiculo(String marca, String modelo, String placa, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.preco = preco;
    }

    // Métodos Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método toString() para representar o objeto como texto
    @Override
    public String toString() {
        return "Veiculo {" +
                "Marca: '" + marca + '\'' +
                ", Modelo: '" + modelo + '\'' +
                ", Placa: '" + placa + '\'' +
                ", Ano: " + ano +
                ", Preço: R$ " + String.format("%.2f", preco) +
                '}';
    }
}

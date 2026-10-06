public class Main {
    public static void main(String[] args) {
        // Criando o objeto com o construtor cheio
        Veiculo meuCarro = new Veiculo("Toyota", "Corolla", "ABC1D23", 2024, 145000.00);

        // Exibindo os dados completos usando o toString() implicitamente
        System.out.println(meuCarro);

        // Exemplo alterando o preço usando o Setter
        meuCarro.setPreco(140000.00);

        // Exemplo buscando apenas a placa usando o Getter
        System.out.println("Nova busca - Placa: " + meuCarro.getPlaca());
    }
}

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Honda", "Civic", "XXX0X00", 2010, 50000);
        Veiculo v2 = new Veiculo("Volkswagen", "Polo", "AAA1A11", 2008, 38000);

        Concessionaria c1 = new Concessionaria();

        c1.adicionarVeiculo(v1);
        c1.adicionarVeiculo(v2);

        c1.adicionarVeiculo(new Veiculo("Toyota", "Corolla", "XXX1X11", 2012, 55000));

        // Chama e imprime o método que obtém o veículo mais caro
        System.out.println(c1.obterVeiculoMaisBarato());
    }
}

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Honda", "Civic", "XXX0X00", 2010, 50000);
        Veiculo v2 = new Veiculo("Mazda", "Mx3", "AAA1A11", 1997, 52000);
        Veiculo v3 = new Veiculo("Toyota", "Corolla", "BRA2E19", 2015, 65000);
        Veiculo v4 = new Veiculo("Chevrolet", "Onix", "RIO1A23", 2019, 48000);
        Veiculo v5 = new Veiculo("Volkswagen", "Gol", "MIG3C45", 2012, 25000);
        Veiculo v6 = new Veiculo("Ford", "Ka", "SAO4D56", 2018, 38000);
        Veiculo v7 = new Veiculo("Fiat", "Uno", "CUR5E67", 2014, 22000);
        Veiculo v8 = new Veiculo("Hyundai", "HB20", "BHZ6F78", 2020, 55000);
        Veiculo v9 = new Veiculo("Renault", "Sandero", "POR7G89", 2016, 32000);
        Veiculo v10 = new Veiculo("Jeep", "Compass", "REC8H90", 2021, 110000);
        Veiculo v11 = new Veiculo("Nissan", "Sentra", "MAN9I01", 2013, 42000);
        Veiculo v12 = new Veiculo("BMW", "320i", "FOR0J12", 2017, 135000);


        Concessionaria c1 = new Concessionaria();

        c1.adicionarVeiculo(v1);
        c1.adicionarVeiculo(v2);

        Concessionaria c2 = new Concessionaria();

        c2.adicionarVeiculo(v3);
        c2.adicionarVeiculo(v4);
        c2.adicionarVeiculo(v5);
        c2.adicionarVeiculo(v6);
        c2.adicionarVeiculo(v7);
        c2.adicionarVeiculo(v8);
        c2.adicionarVeiculo(v9);
        c2.adicionarVeiculo(v10);
        c2.adicionarVeiculo(v11);
        c2.adicionarVeiculo(v12);
        System.out.println(c1.obterVeiculoMaisBarato());
        System.out.println(c1.obterTodosVeiculos());
        System.out.println(c2.obterTodosVeiculos());

    }
}

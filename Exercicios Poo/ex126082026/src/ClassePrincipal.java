public class ClassePrincipal {
    public static void main(String[] args) {

        Veiculo vPalio = new Veiculo();
        vPalio.marca = "Fiat";
        vPalio.ano = 2009;
        vPalio.modelo = "Fire";
        vPalio.placa = "MGM-2495";
        vPalio.preco = 26.000;
        System.out.println(vPalio.marca);

        Veiculo vCivic = new Veiculo();
        vCivic.marca = "Honda";
        vCivic.modelo = "Civic";
        vCivic.placa = "MGN2344";
        vCivic.ano = 2015;
        vCivic.preco = 70000;
        System.out.println(vCivic.preco);


    }
}

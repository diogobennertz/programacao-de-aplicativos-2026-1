public class classePrincipal {

    //Crie 3 objetos de Mercado chamados:
    //unidadeDeBlumenau
    //unidadeDeJoinville
    //unidadeDeFlorianopolis
    //Atribua valores a esses objetos e mostre suas informações
    public static void main(String[] args) {

        mercado unidadeDeBlumenau = new mercado();
        mercado unidadeDeJoinville = new mercado();
        mercado unidadeDeFlorianopolis = new mercado();
        unidadeDeBlumenau.nome = "Mercado de Blumenau";
        unidadeDeFlorianopolis.nome = "Mercado de Florianópolis";
        unidadeDeJoinville.nome = "Mercado de Joinville";
        unidadeDeBlumenau.numLaranjas = 5;
        unidadeDeFlorianopolis.numLaranjas = 6;
        unidadeDeJoinville.numLaranjas = 7;
        unidadeDeBlumenau.precoLaranjas = 3.50;
        unidadeDeJoinville.precoLaranjas = 3.75;
        unidadeDeFlorianopolis.precoLaranjas = 4.00;
        unidadeDeBlumenau.precoMacas = 2.50;
        unidadeDeFlorianopolis.precoMacas = 3.50;
        unidadeDeJoinville.precoMacas = 2.75;
        unidadeDeBlumenau.numMacas = 7;
        unidadeDeFlorianopolis.numMacas = 6;
        unidadeDeJoinville.numMacas = 5;

        System.out.println("Unidade: " + unidadeDeBlumenau.nome);
        System.out.println("Laranjas - Qtd: " + unidadeDeBlumenau.numLaranjas + " | Preço: R$" + unidadeDeBlumenau.precoLaranjas);
        System.out.println("Maçãs    - Qtd: " + unidadeDeBlumenau.numMacas + " | Preço: R$" + unidadeDeBlumenau.precoMacas);
        System.out.println("----------------------------------------");

        System.out.println("Unidade: " + unidadeDeFlorianopolis.nome);
        System.out.println("Laranjas - Qtd: " + unidadeDeFlorianopolis.numLaranjas + " | Preço: R$" + unidadeDeFlorianopolis.precoLaranjas);
        System.out.println("Maçãs    - Qtd: " + unidadeDeFlorianopolis.numMacas + " | Preço: R$" + unidadeDeFlorianopolis.precoMacas);
        System.out.println("----------------------------------------");

        System.out.println("Unidade: " + unidadeDeJoinville.nome);
        System.out.println("Laranjas - Qtd: " + unidadeDeJoinville.numLaranjas + " | Preço: R$" + unidadeDeJoinville.precoLaranjas);
        System.out.println("Maçãs    - Qtd: " + unidadeDeJoinville.numMacas + " | Preço: R$" + unidadeDeJoinville.precoMacas);

    }

}

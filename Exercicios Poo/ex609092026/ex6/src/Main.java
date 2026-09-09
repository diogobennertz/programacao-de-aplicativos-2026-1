//Utilizando a classe Mercado.
//Calcule:

public class Main {
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
        unidadeDeBlumenau.numMacas = 15000;
        unidadeDeFlorianopolis.numMacas = 6;
        unidadeDeJoinville.numMacas = 5;

        //a) Quem teve a maior receita vendendo maçãs?
        //b) Quem teve a menor receita vendendo laranjas?
        //c) Qual das lojas teve a segunda maior receita total?
        //d) Juntando as 3 lojas, a franquia teve uma receita maior vendendo maçãs ou laranjas?
        mercado mercados [] = {unidadeDeBlumenau,unidadeDeJoinville,unidadeDeFlorianopolis};
        double maiorReceitaMacas = Double.MIN_VALUE;
        mercado mercadoMaiorReceitaMacas = null;
        double menorReceitaLaranjas = Double.MAX_VALUE;
        mercado mercadoMenorReceitaLaranjas = null;
        for (int i = 0; i < mercados.length; i++) {
            if (mercados[i].calcularReceitaMacas()>maiorReceitaMacas){
                maiorReceitaMacas = mercados[i].calcularReceitaMacas();
                mercadoMaiorReceitaMacas = mercados[i];
            }
            if (mercados[i].calcularReceitaLaranjas()< menorReceitaLaranjas){
                maiorReceitaMacas = mercados[i].calcularReceitaMacas();
                mercadoMenorReceitaLaranjas = mercados[i];
            }
        }
        double segundaMaiorReceitaTotal = 0;
        mercado mercadoSegundaMaiorReceitaTotal = null;
        double maiorReceitaTotal =0;
        for (int i = 0; i < mercados.length; i++) {
            if(mercados[i].calcularReceitaTotal()> maiorReceitaTotal){
                maiorReceitaTotal = mercados[i].calcularReceitaTotal();
            }
        }
        for (int i = 0; i < mercados.length; i++) {
            if(mercados[i].calcularReceitaTotal()> segundaMaiorReceitaTotal && mercados[i].calcularReceitaTotal() != maiorReceitaTotal){
                segundaMaiorReceitaTotal = mercados[i].calcularReceitaTotal();
                mercadoSegundaMaiorReceitaTotal = mercados[i];
            }
        }
        double receitaGeralMacas = 0;
        double receitaGeralLaranjas = 0;
        for (int i = 0; i < mercados.length; i++) {
            receitaGeralLaranjas +=mercados[i].calcularReceitaLaranjas();
            receitaGeralMacas +=mercados[i].calcularReceitaMacas();
        }
        if (receitaGeralMacas>receitaGeralLaranjas){
            System.out.println("A Franquia teve receita maior com maças");
        }else if (receitaGeralMacas<receitaGeralLaranjas){
            System.out.println("A Franquia teve receita maior com laranjas");
        }else{
            System.out.println("A Franquia teve receita iguaç com maças e laranjas");
        }
        System.out.println(mercadoMaiorReceitaMacas.nome + " Foi o que mais faturou: " + mercadoMaiorReceitaMacas.calcularReceitaMacas());
        System.out.println(mercadoMenorReceitaLaranjas.nome + " Foi o que menos faturou: " + mercadoMenorReceitaLaranjas.calcularReceitaLaranjas());
        System.out.println(mercadoSegundaMaiorReceitaTotal.nome + " Foi o Segundo que mais Faturou: " + mercadoSegundaMaiorReceitaTotal.calcularReceitaTotal());
    }
}
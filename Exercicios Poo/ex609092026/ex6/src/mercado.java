public class mercado {
    String nome;
    int numMacas;
    double precoMacas;
    int numLaranjas;
    double precoLaranjas;


    public double calcularReceitaMacas(){
        return numMacas*precoMacas;
    }
    public double calcularReceitaLaranjas(){
        return numLaranjas*precoLaranjas;
    }
    public double calcularReceitaTotal(){
        return calcularReceitaLaranjas()+calcularReceitaMacas();
    }
}

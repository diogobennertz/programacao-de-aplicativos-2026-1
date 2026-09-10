public class mercado {
    String nome;
    int numMacas;
    double precoMacas;
    int numLaranjas;
    double precoLaranjas;

    public mercado(String nome, int numMacas, double precoMacas, int numLaranjas, double precoLaranjas) {
        this.nome = nome;
        this.numMacas = numMacas;
        this.precoMacas = precoMacas;
        this.numLaranjas = numLaranjas;
        this.precoLaranjas = precoLaranjas;
    }

    public
    public double calcularReceitaMacas(){
        return numMacas*precoMacas;
    }
    public double calcularReceitaLaranjas(){
        return numLaranjas*precoLaranjas;
    }
    public double calcularReceitaTotal(){
        return calcularReceitaLaranjas()+calcularReceitaMacas();
    }
    @Override
    public String toString() {
        return "mercado{" +
                "nome='" + nome + '\'' +
                ", numMacas=" + numMacas +
                ", precoMacas=" + precoMacas +
                ", numLaranjas=" + numLaranjas +
                ", precoLaranjas=" + precoLaranjas +
                '}';
    }

}

public class classePrincipal {
    public static void main(String[] args) {
        listaRetangulos lista = new listaRetangulos();

        lista.adicionar(new retangulo(2, 10));  // área 20, perímetro 24
        lista.adicionar(new retangulo(5, 5));   // área 25, perímetro 20
        lista.adicionar(new retangulo(1, 15));  // área 15, perímetro 32

        System.out.println("Maior área: " + lista.getMaiorArea());
        System.out.println("Maior perímetro: " + lista.getMaiorPerimetro());
    }
}
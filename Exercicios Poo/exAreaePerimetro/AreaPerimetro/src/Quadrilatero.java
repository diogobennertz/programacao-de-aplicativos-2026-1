public class Quadrilatero {

    double altura;
    double largura;

    public double obterArea() {
        return altura * largura;
    }

    public double obterPerimetro(){
        return (largura*2)+(altura*2);
    }
}

public class retangulo {
    private double altura;
    private double largura;

    public retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double calcularArea() {
        return altura * largura;
    }

    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }

    @Override
    public String toString() {
        return "Retangulo [altura=" + altura + ", largura=" + largura
                + ", area=" + calcularArea()
                + ", perimetro=" + calcularPerimetro() + "]";
    }
}
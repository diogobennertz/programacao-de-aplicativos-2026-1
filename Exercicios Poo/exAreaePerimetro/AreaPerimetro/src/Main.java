public class Main {

    public static void main(String[] args) {

        Quadrilatero q1 = new Quadrilatero();
        q1.altura = 2;
        q1.largura = 4;

        Quadrilatero q2 = new Quadrilatero();
        q2.altura = 5;
        q2.largura = 3;

        System.out.println(q1.obterArea());
        System.out.println(q1.obterPerimetro());
        System.out.println(q2.obterArea());
        System.out.println(q2.obterPerimetro());
    }
}

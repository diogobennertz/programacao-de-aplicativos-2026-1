//4)
//Crie uma classe chamada Circulo que tenha o atributo raio
//Calcule a área de 4 objetos diferentes de Circulo
//Para obter o valor de PI, use a função Math.PI do Java

public class classePrincipal {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo();
        Circulo c3 = new Circulo();
        Circulo c4 = new Circulo();
        c1.raio = 3;
        c2.raio = 4;
        c3.raio = 5;
        c4.raio = 6;
        System.out.println("C1: " + c1.obterArea());
        System.out.println("C2: " + c2.obterArea());
        System.out.println("C3: " + c3.obterArea());
        System.out.println("C4: " + c4.obterArea());

    }
}
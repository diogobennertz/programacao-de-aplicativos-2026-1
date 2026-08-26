import java.util.Scanner;

public class ExemploMetodoComParametro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o numero 1");
        double num1 = leitor.nextDouble();
        System.out.println("Informe o numero 2");
        double num2 = leitor.nextDouble();
        System.out.println("Informe o numero 3");
        double num3 = leitor.nextDouble();
        desempenharCalculo(num1,num2,num3);
    }
    public static void desempenharCalculo(double num1, double num2, double num3){
        double resultado = (num1+num2) * num3;
        System.out.println(resultado);
    }
}

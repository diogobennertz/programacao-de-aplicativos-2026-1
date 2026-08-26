import java.util.Scanner;
//5)
//Faça um método que receba três números inseridos pelo usuário, esses números
//serão: um número "base" e mais dois outros números que o usuário inseriu
//Imprima qual dos dois últimos números está mais perto do primeiro número "base"
public class numerCinco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe O Número Base");
        double numBase = leitor.nextDouble();
        System.out.println("Informe o Número 1");
        double num1 = leitor.nextDouble();
        System.out.println("Informe o Número 2");
        double num2 = leitor.nextDouble();
        achaMaior(numBase,num1,num2);
    }

    public static void achaMaior (double base, double num1, double num2){
        double distancia1 = Math.abs(base - num1);
        double distancia2 = Math.abs(base - num2);

        if(distancia1<distancia2){
            System.out.println("O Número " + num1 + " é o mais perto com " + distancia1 + " de distancia");
        }else if (distancia1>distancia2){
            System.out.println("O Número " + num2 + " é o mais perto com " + distancia2 + " de distancia");
        }else {
            System.out.println("Ambos tem a mesma diferença");
        }
    }
}

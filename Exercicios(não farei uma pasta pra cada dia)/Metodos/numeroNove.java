import java.util.Scanner;

public class numeroNove {
    //9)
    //Faça um método booleano que retorne true se o número passado como parâmetro
    //seja par.
    //Retorne false caso seja ímpar

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o numero: ");
        double n1 = leitor.nextDouble();
        System.out.println(verdadeOuNao(n1));
    }

    public static boolean verdadeOuNao(double n1) {
        return n1%2==0;
    }
}

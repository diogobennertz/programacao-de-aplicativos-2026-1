import java.util.Scanner;

public class numeroOito {
    //Faça um programa que receba 3 notas do usuário e informe a média aritmética dessas
    //notas.
    //Retorne a média
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a Primeira Nota");
        double n1 = leitor.nextDouble();
        System.out.println("Informe a Segunda Nota");
        double n2 = leitor.nextDouble();
        System.out.println("Informe a Terceira Nota");
        double n3 = leitor.nextDouble();
        System.out.println("a media é: " + mediaNotas(n1,n2,n3));
    }
    public static double mediaNotas(double n1,double n2,double n3){

       if (n1<0 || n2<0 || n3<0 || n1>10 || n2>10 || n3>10) {
         return 0;
       }
       double media = (n1+n2+n3)/3;
       return media;
    }
}

import java.util.Scanner;

public class numeroDez {
    //Faça um programa que diz se um número inserido está dentro de um limite imposto
    //pelo usuário
    //Por exemplo:
    //Usuário inseriu o limite máximo como 100.
    //Usuário inseriu o limite mínimo como 70.
    //Depois ele inseriu o número 80.
    //O retorno deve ser: 80 está nos limites impostos.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o número maximo: ");
        double maxNum = leitor.nextDouble();
        System.out.println("Informe o número minimo: ");
        double minNum = leitor.nextDouble();
        System.out.println("Informe um número: ");
        double num = leitor.nextDouble();
        verificaLimite(maxNum, minNum, num);

        leitor.close();
    }

    public static void verificaLimite(double max, double min, double num) {
        // Verifica se o número está entre o mínimo e o máximo (inclusive)
        if (num >= min && num <= max) {
            System.out.println(num + " está nos limites impostos.");
        } else {
            System.out.println(num + " está fora dos limites impostos.");
        }
    }
}

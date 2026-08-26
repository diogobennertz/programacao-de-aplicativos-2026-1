import java.util.Scanner;

public class numeroUm {
    //Métodos sem parâmetros
    //1)
    //Faça um programa em que o usuário entre com um número de 1 a 4
    //Com o número 1 sendo verão, 2 sendo outono...
    //Dependendo de o que o usuário informa, imprima:
    //É verão
    //E o tempo está quente
    //Ou
    //É inverno
    //E está frio
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um numero de 1 a 4 sendo:");
        System.out.println("1-Verão       |   2-Outuno");
        System.out.println("3-Inverno     |   4-Primavera");
        String estacao = leitor.next();
        switch (estacao){
            case ("1") -> imprimeVerao();
            case ("2") -> imprimeOutono();
            case ("3") -> imprimeInverno();
            case ("4") -> imprimePrimavera();
        }

    }
    public static void imprimeVerao(){
        System.out.println("É Verão\nE o tempo está quente");
    }
    public static void imprimeOutono(){
        System.out.println("É Outono\nE as folhas caem");
    }
    public static void imprimeInverno(){
        System.out.println("É Inverno\nE está frio");
    }
    public static void imprimePrimavera(){
        System.out.println("É Primavera\nE ta calor pra caralho");
    }
}

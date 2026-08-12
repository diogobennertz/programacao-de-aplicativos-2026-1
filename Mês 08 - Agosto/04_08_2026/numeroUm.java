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
        if (estacao.equals("1")){
            imprimeVerao();
        } else if(estacao.equals("2")){
            imprimeOutono();
        } else if(estacao.equals("3")){
            imprimeInverno();
        }else if(estacao.equals("4")) {
            imprimePrimavera();
        }else {
            System.out.println("Valor Inválido, Tente novamente!");
        }
    }
    public static void imprimeVerao(){
        System.out.println("Verão");
    }
    public static void imprimeOutono(){
        System.out.println("Outono");
    }
    public static void imprimeInverno(){
        System.out.println("Inverno");
    }
    public static void imprimePrimavera(){
        System.out.println("Primavera");
    }
}

import java.util.Scanner;
//7)
//Faça um programa em que o usuário entre com um número de 1 a 4
//Com o número 1 sendo verão, 2 sendo outono...
//Dependendo de o que o usuário informa, retorne:
//É verão
//E o tempo está quente.
//Ou
//É inverno
//E está frio.
//Faça um método para cada estação do ano

public class numeroSete {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um numero de 1 a 4 sendo:");
        System.out.println("1-Verão       |   2-Outuno");
        System.out.println("3-Inverno     |   4-Primavera");
        String estacao = leitor.next();
        switch (estacao){
            case ("1") -> System.out.println(imprimeVerao());
            case ("2") -> System.out.println(imprimeOutono());
            case ("3") -> System.out.println(imprimeInverno());
            case ("4") -> System.out.println(imprimePrimavera());
        }

    }
    public static String imprimeVerao (){
        return "É Verão\nE o tempo está quente";
    }
    public static String imprimeOutono(){
        return "É Outono\nE as folhas caem";
    }
    public static String imprimeInverno(){
        return "É Inverno\nE está frio";
    }
    public static String imprimePrimavera(){
        return"É Primavera\nE ta calor pra caralho";
    }
}



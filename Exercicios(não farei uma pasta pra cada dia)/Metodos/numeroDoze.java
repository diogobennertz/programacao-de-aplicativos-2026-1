import java.util.Scanner;

public class numeroDoze {
    //12)
    //Faça um código que recebe uma palavra do usuário, se essa palavra tem tamanho par,
    //retorne o primeiro caractere dessa palavra.
    //Caso ela tenha tamanho ímpar, retorne o segundo caractere dessa palavra.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe uma Palavra: ");
        String palavra = leitor.next();
        System.out.println(retornaPalavra(palavra));
    }
    public static char retornaPalavra (String palavra){
        return palavra.length()%2==0 ? palavra.charAt(0) : palavra.charAt(1);
    }
}

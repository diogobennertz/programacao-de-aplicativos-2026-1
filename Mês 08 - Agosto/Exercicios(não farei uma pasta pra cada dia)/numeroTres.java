import java.util.Scanner;

public class numeroTres {
    //3)
    //Faça um programa que exiba o número que o usuário entrou como parâmetro e os 20
    //números que vem após esse número
    //(O parâmetro do método deve ser o número inserido pelo usuário)
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um Número");
        int numero = leitor.nextInt();
        chamaNumeros(numero);
    }
    public static void chamaNumeros(int numero){
        for (int i = 0; i <= 20; i++) {
            System.out.println(numero+i);
        }
    }
}

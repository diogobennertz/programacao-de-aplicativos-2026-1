import java.util.Scanner;

public class numeroQuatro {
    //4)
    //Faça um programa que descubra:
    //a) O maior elemento de um vetor
    //b) O menor elemento de um vetor
    //c) A média dos valores
    //(Criar um método para cada questão)
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] vetor = new double[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o " + (i+1) +  " valor");
            vetor[i] = leitor.nextDouble();
        }

        maior(vetor);
        menor(vetor);
        media(vetor);

    }
    public static void maior(double maior[]){
        double  maior1 = Double.MIN_VALUE;
        for (int i = 0; i < maior.length; i++) {
            if (maior[i] > maior1){
                maior1 = maior[i];
            }
        }
        System.out.println("O Maior é: " + maior1);
    }
    public static void menor(double menor[]){
        double  menor1 = Double.MAX_VALUE;
        for (int i = 0; i < menor.length; i++) {
            if (menor[i] < menor1){
                menor1 = menor[i];
            }
        }
        System.out.println("O menor é: " + menor1);
    }
    public static void media (double media[]){
        double  media1 = 0.0;
        for (double v : media) {
            media1 = v + media1;
        }
        media1 = media1/media.length;
        System.out.println("A Media é: " + media1);
    }
}

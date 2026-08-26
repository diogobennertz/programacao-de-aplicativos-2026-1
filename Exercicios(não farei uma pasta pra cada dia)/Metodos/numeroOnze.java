import java.util.Scanner;
//11)
//Faça um programa que descubra:
//a) O maior elemento de um vetor
//b) O menor elemento
//c) A média dos valores
//Retorne esses valores
public class numeroOnze {
    public static void main(String[] args) {
        double vet[] = {5,6,4,12,-5,0,84};
        System.out.println(maiorValor(vet));
        System.out.println(menorValor(vet));
        System.out.println(media(vet));
    }
    public static double maiorValor (double vet[]){
        double maiorValor = Double.MIN_VALUE;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i]>maiorValor){
                maiorValor = vet[i];
            }
        }
        return maiorValor;
    }
    public static double menorValor (double vet[]){
        double menorValor = Double.MAX_VALUE;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i]<menorValor){
                menorValor = vet[i];
            }
        }
        return menorValor;
    }
    public static double media(double vet[]){
        double media = 0;
        for (int i = 0; i < vet.length; i++) {
            media = media+vet[i];
        }
        media = media / vet.length;
        return media;
    }
}

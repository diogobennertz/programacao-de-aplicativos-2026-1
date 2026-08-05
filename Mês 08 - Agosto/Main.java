//Escreva um programa que leia o número de matrícula um funcionário, seu nome, sua
//quantidade de horas trabalhadas na semana, o valor que recebe por hora e calcule o salário
//mensal desse funcionário (assuma que um mês tem 4 semanas).
//A seguir, mostre a sua matrícula, nome e o salário do funcionário, com duas casas decimais

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o número da matricula: ");
        int matricula = leitor.nextInt();
        System.out.println("Informe Seu Nome: ");
        String nome = leitor.next();
        System.out.println("Informe a quatidade de horas trabalhadas");
        int horas = leitor.nextInt();
        System.out.println("Informe o valor da hora ");
        double valorHora = leitor.nextDouble();
        double salario = (valorHora*horas)*4;
        System.out.println("Matricula: " + matricula + " nome: " + nome + " Salário: " + salario);

    }
}
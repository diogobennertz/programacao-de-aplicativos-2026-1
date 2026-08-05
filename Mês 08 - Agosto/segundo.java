import java.util.Scanner;

//Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em R$).
//Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informe o total a receber no final do mês, com duas casas decimais.
public class segundo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe Seu Nome: ");
        String nome  = leitor.next();
        System.out.println("Informe seu salário fixo: ");
        double sal = leitor.nextDouble();
        System.out.println("Informe Seu total de vendas no mes (R$)");
        double totalVendas = leitor.nextDouble();
        double totalSalario = totalVendas*0.15;
        System.out.printf("Seu salário será de: " + (sal+totalSalario));
    }
}

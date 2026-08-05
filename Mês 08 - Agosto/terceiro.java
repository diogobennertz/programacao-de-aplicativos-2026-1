import java.util.Scanner;

//3)
//O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa está no peso ideal. O IMC é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura, onde a massa está em quilogramas e a altura está em metros, de acordo com a fórmula:
//IMC = Massa / Altura²
//Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, de acordo com a seguinte tabela:
//< 18.5 Magreza
//18.5 – 24.9 Saudável
//25.0 – 29.9 Sobrepeso
//30.0 – 34.9 Obesidade Grau I
//35.0 – 39.9 Obesidade Grau II (severa)
//> 40.0 Obesidade Grau III (morbida)
public class terceiro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe seu peso: ");
        double peso = leitor.nextDouble();
        System.out.println("Informe sua altura: ");
        double altura = leitor.nextDouble();
        double imc = peso/(altura*altura);
        if (imc < 18.5){
            System.out.printf("Magreza");
        } else if (imc >18.4 && imc < 25) {
            System.out.println("Saudavel");
        } else if (imc >24.9 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >29.9 && imc < 35) {
            System.out.println("Obesidade grau 1");
        } else if (imc >34.9 && imc < 40) {
            System.out.println("Obesidade grau 2");
        } else if (imc >40) {
            System.out.println("Obesidade grau 3");
        }
    }
}

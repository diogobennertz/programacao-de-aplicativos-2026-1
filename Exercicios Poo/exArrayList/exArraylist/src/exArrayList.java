import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exArrayList {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(5);
        numeros.add(15);
        numeros.add(0);
        System.out.println("Informe Um Número: ");
        int verifica = leitor.nextInt();
        int indice = numeros.indexOf(verifica);
        if (indice == -1){
            System.out.println(verifica +  " está fora da lista.");
        }else {
            System.out.println(numeros.indexOf(verifica));
        }
    }
}
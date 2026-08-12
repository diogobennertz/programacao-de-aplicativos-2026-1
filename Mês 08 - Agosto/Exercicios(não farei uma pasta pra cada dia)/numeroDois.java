import java.util.Scanner;

public class numeroDois {
    //2)
    //Faça um método para seus colegas mais próximos
    //O método deve imprimir:
    //O nome dele(a) é [nome]
    //Ele(a) tem [idade] anos
    //Ele(a) é estudante de desenvolvimento de sistemas
    //(Em prints separados)
    //Faça com que o método seja uma expressão verbal com o nome do seu colega.
    //O usuário deve entrar com o nome da pessoa para escolher um dos métodos a ser
    //executado.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe Qual Colega apresentar: ");
        System.out.println("Opções: Eduardo,Patrick ou Henrique.");
        String nomeAlunos = leitor.next();
        if ((nomeAlunos.equals("eduardo")) || (nomeAlunos.equals("Eduardo"))){
            chamaEduardo();
        }else if ((nomeAlunos.equals("patrick")) || (nomeAlunos.equals("Patrick"))){
            chamaPatrick();
        }else if ((nomeAlunos.equals("Henrique")) || (nomeAlunos.equals("henrique"))){
            chamaHenrique();
        }else{
            System.out.println("Opção Inválida");
        }
    }
    public static void chamaEduardo(){
        System.out.println("O nome dele é Eduardo");
        System.out.println("Ele tem 22 anos");
        System.out.println("Ele(a) é estudante de desenvolvimento de sistemas");
    }
    public static void chamaPatrick(){
        System.out.println("O nome dele é Patrick");
        System.out.println("Ele tem 75 anos");
        System.out.println("Ele(a) é estudante de desenvolvimento de sistemas");
    }
    public static void chamaHenrique(){
        System.out.println("O nome dele é Henrique");
        System.out.println("Ele tem 16 anos");
        System.out.println("Ele(a) é estudante de desenvolvimento de sistemas");
    }


}

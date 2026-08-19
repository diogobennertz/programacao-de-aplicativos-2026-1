import java.util.Scanner;
//6)
//George Lucas utiliza uma fórmula para criar os nomes dos personagens em suas
//histórias (Jar Jar Binks, ObiWan Kenobi, etc).
//A fórmula, supostamente, é:
//Seu primeiro nome na série Star Wars:
//i.Pegue as três primeiras letras de seu sobrenome
//ii.Adicione a ele as duas primeiras letras de seu nome
//Seu sobrenome na série Star Wars:
//Crie um método chamado generateStarWarsName que gera um nome completo Star
//Wars conforme descrito.
//Imprima o seu nome Star Wars
//As entradas serão os nomes completos.
//Para separar, por exemplo as três primeiras letras do seu sobrenome, use o método
//substring() das Strings*/


public class numeroSeis {

    public static String generateStarWarsName(String nomeCompleto) {

        String[] partes = nomeCompleto.split(" ");

        String nome = partes[0];
        String sobrenome = partes[partes.length - 1];

        String primeiroNome = sobrenome.substring(0, 3) + nome.substring(0, 2);

        return primeiroNome;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        String nomeStarWars = generateStarWarsName(nomeCompleto);

        System.out.println("Seu nome Star Wars é: " + nomeStarWars);

        scanner.close();
    }
}



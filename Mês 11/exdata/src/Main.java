import java.time.LocalDate;

public static void main(String[] args) {
    LocalDate dataNascimento = LocalDate.of(2003,4,2);
    ValidadorIdade validador = new ValidadorIdade();
    Boolean maiorDeIdade = validador.ehMaiorDeIdade(dataNascimento);
    if(maiorDeIdade){
        System.out.println("É maior de 18");
    }else {
        System.out.println("Não é de maior");
    }
}
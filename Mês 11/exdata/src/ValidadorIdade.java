import java.time.LocalDate;
import java.time.Period;

public class ValidadorIdade {

    public boolean ehMaiorDeIdade(LocalDate dataNascimento) {
        LocalDate hoje = LocalDate.now();

        // 1. Lança exceção se a data for nula
        if (dataNascimento == null) {
            throw new IllegalArgumentException("A data de nascimento não pode ser nula.");
        }

        // 2. Lança exceção se a data for depois de hoje
        if (dataNascimento.isAfter(hoje)) {
            throw new IllegalArgumentException("A data de nascimento não pode ser no futuro.");
        }

        // 3. Calcula a idade exata em anos e verifica se é >= 18
        int idade = Period.between(dataNascimento, hoje).getYears();
        return idade >= 18;
    }
}

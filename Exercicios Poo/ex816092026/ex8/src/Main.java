public class Main {
    public static void main(String[] args) {
        // 1. Criando o vetor de 5 posições
        pessoaFisica[] lista = new pessoaFisica[5];

        // 2. Preenchendo as 5 posições iniciais
        lista[0] = new pessoaFisica("João da Silva", "123.456.789-00", "PR", 40000.00);
        lista[1] = new pessoaFisica("Maria Rodrigues", "987.654.321-11", "SC", 3500.00);
        lista[2] = new pessoaFisica("Pedro Santos", "456.123.789-22", "RS", 8500.00);
        lista[3] = new pessoaFisica("Ana Oliveira", "321.654.987-33", "PR", 22000.00);
        lista[4] = new pessoaFisica("Carlos Souza", "789.456.123-44", "SC", 31000.00);

        // 3. EXEMPLO DE USO DOS SETTERS:
        // Vamos alterar o nome e a renda da Maria Rodrigues (índice 1) usando o SET
        lista[1].setNome("Maria Rodrigues Silva");
        lista[1].setRendaAnual(45000.00); // Aumentou a renda, mudando o cálculo do imposto!

        // 4. Variáveis de controle para os cálculos (Corrigido para 'P' maiúsculo)
        pessoaFisica maiorPagador = lista[0];
        double totalImpostoGeral = 0.0;

        // 5. Percorrendo o vetor para calcular os objetivos
        for (int i = 0; i < lista.length; i++) {
            double impostoAtual = lista[i].calcularImposto();
            totalImpostoGeral += impostoAtual;

            // a) Identifica quem mais paga imposto (usando GET implícito no cálculo)
            if (impostoAtual > maiorPagador.calcularImposto()) {
                maiorPagador = lista[i];
            }
        }

        // 6. Exibição dos resultados utilizando os métodos GET
        System.out.println("=== RESULTADO DA APURAÇÃO ===");
        System.out.printf("a) Quem mais paga imposto: %s (Imposto devido: R$ %.2f)%n",
                maiorPagador.getNome(), maiorPagador.calcularImposto());

        System.out.printf("b) Total de imposto pago entre os 5 contribuintes: R$ %.2f%n",
                totalImpostoGeral);
    }
}

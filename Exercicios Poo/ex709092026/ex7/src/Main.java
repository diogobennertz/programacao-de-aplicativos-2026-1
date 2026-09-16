public class Main {
    public static void main(String[] args) {
        // O construtor já usa os setters internamente para validar estes dados iniciais
        Aeronave a1 = new Aeronave("Boeing 747", 416, 917, 241140, 200);
        Aeronave a2 = new Aeronave("Airbus A320", 180, 871, 27200, 45);
        Aeronave a3 = new Aeronave("Cessna 172", 4, 226, 212, 0.6);
        Aeronave a4 = new Aeronave("Concorde", 100, 2179, 119500, 420);

        Aeronave[] aeronaves = {a1, a2, a3, a4};

        System.out.println("--- Lista de Aeronaves ---");
        for (Aeronave a : aeronaves) {
            System.out.println(a.toString());
        }

        System.out.println("\n--- Resultados dos Cálculos ---");

        Aeronave maiorPassageiros = aeronaves[0];
        Aeronave maisTempoNoAr = aeronaves[0];
        Aeronave maisLonge = aeronaves[0];

        // Varredura do array utilizando os métodos Getters e de cálculo
        for (int i = 1; i < aeronaves.length; i++) {
            if (aeronaves[i].getPassageiros() > maiorPassageiros.getPassageiros()) {
                maiorPassageiros = aeronaves[i];
            }
            if (aeronaves[i].calcularAutonomiaMinutos() > maisTempoNoAr.calcularAutonomiaMinutos()) {
                maisTempoNoAr = aeronaves[i];
            }
            if (aeronaves[i].calcularAlcanceMaximo() > maisLonge.calcularAlcanceMaximo()) {
                maisLonge = aeronaves[i];
            }
        }

        System.out.printf("a) Maior número de passageiros: %s (%d passageiros)%n",
                maiorPassageiros.getModelo(), maiorPassageiros.getPassageiros());

        System.out.printf("b) Pode ficar mais tempo no ar: %s (%.1f minutos)%n",
                maisTempoNoAr.getModelo(), maisTempoNoAr.calcularAutonomiaMinutos());

        System.out.printf("c) Consegue voar mais longe (em vel. máxima): %s (%.1f km)%n",
                maisLonge.getModelo(), maisLonge.calcularAlcanceMaximo());


        // --- ÁREA DE TESTE DE VALIDAÇÃO (SETTERS COM ATRIBUIÇÃO FORÇADA) ---
        System.out.println("\n--- Testando as validações dos Setters ---");

        System.out.println("Tentando definir passageiros negativos no Cessna...");
        a3.setPassageiros(-5); // Corrige para 0
        System.out.println("Passageiros atuais do Cessna: " + a3.getPassageiros());

        System.out.println("\nTentando definir velocidade zero no Concorde...");
        a4.setVelMaxima(0); // Corrige para 1.0
        System.out.println("Velocidade atual do Concorde: " + a4.getVelMaxima() + " km/h");

        System.out.println("\nTentando colocar nome em branco no Boeing...");
        a1.setModelo("   "); // Corrige para "Modelo Desconhecido"
        System.out.println("Modelo atual da aeronave 1: " + a1.getModelo());

        System.out.println("\n--- Criando nova aeronave defeituosa via construtor ---");
        Aeronave erro = new Aeronave("", -10, 0, 0, 0); // Todas as correções automáticas vão rodar aqui
        System.out.println(erro.toString());
    }
}

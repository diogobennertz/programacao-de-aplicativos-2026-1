class Aeronave {
    private String modelo;
    private int passageiros;
    private double velMaxima;
    private double capCombustivel;
    private double queimaPorMinuto;

    public Aeronave(String modelo, int passageiros, double velMaxima, double capCombustivel, double queimaPorMinuto) {
        setModelo(modelo);
        setPassageiros(passageiros);
        setVelMaxima(velMaxima);
        setCapCombustivel(capCombustivel);
        setQueimaPorMinuto(queimaPorMinuto);
    }

    // --- GETTERS E SETTERS ---

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        // null seguro + isBlank() moderno
        if (modelo == null || modelo.isBlank()) {
            System.out.println("Erro: O modelo não pode ser vazio ou conter apenas espaços.");
        } else {
            this.modelo = modelo;
        }
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        if (passageiros < 0) {
            System.out.println("Erro: A quantidade de passageiros não pode ser negativa.");
        } else {
            this.passageiros = passageiros;
        }
    }

    public double getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(double velMaxima) {
        if (velMaxima <= 0) {
            System.out.println("Erro: A velocidade máxima deve ser maior que zero.");
        } else {
            this.velMaxima = velMaxima;
        }
    }

    public double getCapCombustivel() {
        return capCombustivel;
    }

    public void setCapCombustivel(double capCombustivel) {
        if (capCombustivel <= 0) {
            System.out.println("Erro: A capacidade de combustível deve ser maior que zero.");
        } else {
            this.capCombustivel = capCombustivel;
        }
    }

    public double getQueimaPorMinuto() {
        return queimaPorMinuto;
    }

    public void setQueimaPorMinuto(double queimaPorMinuto) {
        if (queimaPorMinuto <= 0) {
            System.out.println("Erro: A taxa de queima por minuto deve ser maior que zero.");
        } else {
            this.queimaPorMinuto = queimaPorMinuto;
        }
    }

    // --- MÉTODOS DE CÁLCULO ---

    public double calcularAutonomiaMinutos() {
        return this.capCombustivel / this.queimaPorMinuto;
    }

    public double calcularAlcanceMaximo() {
        return this.velMaxima * (this.calcularAutonomiaMinutos() / 60.0);
    }

    @Override
    public String toString() {
        return "Aeronave: " + modelo + " | Passageiros: " + passageiros + " | Vel. Máxima: " + velMaxima + " km/h | Combustível: " + capCombustivel + "L | Queima: " + queimaPorMinuto + "L/min";
    }
}


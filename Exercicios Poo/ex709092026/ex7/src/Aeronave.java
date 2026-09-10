class Aeronave {
    private String modelo;
    private int passageiros;
    private double velMaxima;
    private double capCombustivel;
    private double queimaPorMinuto;

    public Aeronave(String modelo, int passageiros, double velMaxima, double capCombustivel, double queimaPorMinuto) {
        this.modelo = modelo;
        this.passageiros = passageiros;
        this.velMaxima = velMaxima;
        this.capCombustivel = capCombustivel;
        this.queimaPorMinuto = queimaPorMinuto;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPassageiros() {
        return passageiros;
    }

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


public class pessoaFisica {
    private String nome;
    private String cpf;
    private String uf;
    private double rendaAnual;

    // Construtor
    public pessoaFisica(String nome, String cpf, String uf, double rendaAnual) {
        this.nome = nome;
        this.cpf = cpf;
        this.uf = uf;
        this.rendaAnual = rendaAnual;
    }

    // Método para calcular o imposto
    public double calcularImposto() {
        double aliquota = 0.0;

        if (this.rendaAnual <= 4000) {
            aliquota = 0.0;
        } else if (this.rendaAnual <= 9000) {
            aliquota = 0.058; // 5,8%
        } else if (this.rendaAnual <= 25000) {
            aliquota = 0.15;  // 15%
        } else if (this.rendaAnual <= 35000) {
            aliquota = 0.275; // 27,5%
        } else {
            aliquota = 0.30;  // 30%
        }

        return this.rendaAnual * aliquota;
    }

    // --- Métodos GET (Leitura) ---
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getUf() { return uf; }
    public double getRendaAnual() { return rendaAnual; }

    // --- Métodos SET (Alteração) ---
    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setUf(String uf) { this.uf = uf; }
    public void setRendaAnual(double rendaAnual) { this.rendaAnual = rendaAnual; }
}

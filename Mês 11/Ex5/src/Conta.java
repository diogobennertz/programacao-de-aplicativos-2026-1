public class Conta {

    private final String nomeTitular;
    private double saldo;

    private static final double TAXA_JUROS_MENSAL = 0.01; // 1% ao mês

    public Conta(String nomeTitular, double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor do depósito deve ser maior que 0.");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (destino == null) {
            System.out.println("Conta de destino inválida.");
        } else if (valor <= 0) {
            System.out.println("Valor de transferência inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência.");
        } else {
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência de R$ " + valor + " para "
                    + destino.getNomeTitular() + " realizada com sucesso.");
        }
    }
    public double simularInvestimento(double valor, int meses) {
        return valor * Math.pow(1 + TAXA_JUROS_MENSAL, meses);
    }}
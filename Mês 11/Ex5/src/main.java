
public static void main(String[] args) {
    Conta c1 = new Conta("Ana", 1000);
    Conta c2 = new Conta("Bruno", 500);

    c1.depositar(200);        // saldo Ana: 1200
    c1.sacar(300);            // saldo Ana: 900
    c1.sacar(5000);           // saldo insuficiente
    c1.transferir(c2, 400);   // Ana: 500 | Bruno: 900
    c1.transferir(c2, 9999);  // saldo insuficiente

    double montante = c1.simularInvestimento(1000, 12);
    System.out.printf("Montante após 12 meses: R$ %.2f%n", montante);

    System.out.println("Saldo de " + c1.getNomeTitular() + ": R$ " + c1.getSaldo());
    System.out.println("Saldo de " + c2.getNomeTitular() + ": R$ " + c2.getSaldo());
}

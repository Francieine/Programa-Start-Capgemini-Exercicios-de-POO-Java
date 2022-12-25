public class Main {
    public static void main(String[] args) {
        ContaCorrente Conta1 = new ContaCorrente(123456, "Fran", 100);
        System.out.println("Numero da conta: " + Conta1.getNumeroDaConta());
        System.out.println("Nome do Correntista: " + Conta1.getNomeCorrentista());
        System.out.println("Saldo: " + Conta1.getSaldo());

    }
}

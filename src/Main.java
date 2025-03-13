//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando uma conta bancária com meu nome
        ContaBancaria conta = new ContaBancaria("Anderson Fonseca", 1000);

        // Consultar o saldo inicial
        System.out.println("Saldo Inicial, R$ " + conta.consultarSaldo());

        // Depositar 1000
        conta.depositar(1000.00);

        // Tentar sacar valor
        conta.sacar(500.00);

        // Tentar sacar um valor acima
        conta.sacar(3000.00);

        // Exibir o titular da conta
        System.out.println("Titular da conta: " + conta.getTitular());

        // Alterando o titular
        conta.setTitular("Heloísa Real");
        System.out.println("Novo titular da conta: " + conta.getTitular());

    }
}
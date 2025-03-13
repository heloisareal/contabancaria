public class ContaBancaria {

    // Atributos (propriedades)
    private double saldo; // privado
    private String titular; // privado

    // Constructor para iniciar com titular e saldo inicial
    public ContaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // MÉTODOS

    //Depositar dinheiro na conta
    public void depositar(double valor){
        if(valor > 0){ // Não será possível depositar um número negativo (sacar)
            saldo += valor;
            System.out.println("Depósito realizado. Novo saldo: R$ " + saldo);
        } else{
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor){
        if(valor > 0 && saldo >= valor){ // O valor tem que ser > 0 e o saldo tem que ser maior que o valor
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: R$ " + saldo);
        } else{
            System.out.println("Saque não permitido. Saldo insuficiente ou valor inválido.");
        }
    }

    // Consulta o saldo sem expor diretamente o valor
    public double consultarSaldo(){
        return saldo;
    }

    //
    public void setTitular(String nome){
        this.titular = nome;
    }

    public String getTitular(){
        return titular;
    }

}

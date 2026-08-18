package br.senac.sp.banco;

public class Conta {
    public String agencia;
    public String numeroConta;
    private double saldo;
    public Cliente cliente;

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
        }
    }

    public String info() {
        StringBuilder builder = new StringBuilder();
        builder.append("--- Resumo ---");
        builder.append("\nAgência: " + agencia);
        builder.append("\nNúmero:" + numeroConta);
        builder.append("\nSaldo:" + saldo);
        builder.append("\nCliente:" + cliente.nome);
        return builder.toString();
    }

}

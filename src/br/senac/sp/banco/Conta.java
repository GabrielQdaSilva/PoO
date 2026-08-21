package br.senac.sp.banco;

public class Conta {
    public String agencia;
    public String numeroConta;
    private double saldo;
    public Cliente cliente;

    public Conta() {
        this.cliente = new Cliente();
        this.agencia = "0001";
        this.numeroConta = "0000";
        this.saldo = 0;
    }

    // criar dois construtores além do padrõ
    public void Conta1(String agencia, String numero, double depositoInicial) {
        this.agencia = agencia;
        this.numeroConta = numero;
        this.saldo = depositoInicial;

        if (depositoInicial > 0) {
            this.depositar(depositoInicial);
            System.out.println("Conta criada com sucesso!");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
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

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;

            return true;
        }

        return false;
    }

    public void transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

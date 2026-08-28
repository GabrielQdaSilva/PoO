package br.senac.sp.banco;

import java.util.Scanner;

public class Conta {
    private String agencia;
    private String numero;
    private double saldo;
    private Cliente cliente;



    /**
     * @return the agencia
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Conta() {
    }

    public Conta(String agencia, String numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public Conta(String agencia, String numero, Cliente cliente) {
        this(agencia, numero);
        this.cliente = cliente;
    }

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

    public String getInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append("--- Resumo ---")
                .append("\nAgência: ")
                .append(agencia)
                .append("\nNúmero: ")
                .append(numero)
                .append("\nSaldo: R$ ")
                .append(String.format("%5.2f", saldo))
                .append("\nCliente: " + cliente.getNome());
        return builder.toString();
    }
}

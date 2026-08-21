package br.senac.sp.banco;

public class Cliente {
    public String nome;
    public String cpf;

    // construtor padrão
    public Cliente() {
    }

    public Cliente(String cpf) {
        this.cpf = cpf;
    }

    // construtor sobrecarregado
    public Cliente(String nome, String cpf) {

        // invocando o construtor que recebe o cpf
        this(cpf);
        this.nome = nome;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

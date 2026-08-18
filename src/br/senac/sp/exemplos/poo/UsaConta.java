package br.senac.sp.exemplos.poo;

import br.senac.sp.banco.Cliente;
import br.senac.sp.banco.Conta;

public class UsaConta {
    public static void main(String[] args) {
        //cria objeto conta
        Conta c1 = new Conta();
        c1.agencia = "123-4";
        c1.numeroConta = "5678";
        Cliente cl1 = new Cliente();
        cl1.nome = "Murilo Torres";
        cl1.cpf = "123.456.789-00";
        c1.cliente = cl1;

        Conta c2 = new Conta();
        c2.agencia = "123-4";
        c2.numeroConta = "7890";
        c2.cliente = cl1;
        c1.depositar(100000);
        c1.sacar(1000);
        c1.transferir(1000, c2);
        System.out.println(c1.info());
        System.out.println(c2.info());

    }
}

package br.senac.sp.exemplos.poo;

import br.senac.sp.banco.Cliente;
import br.senac.sp.banco.Conta;

public class UsaConta {
    public static void main(String[] args) {

        // cria objeto conta
        Conta c1 = new Conta();
        c1.setAgencia("123-4");
        c1.setNumero("5678");
        // cria objeto cliente
        Cliente cl1 = new Cliente();
        cl1.setNome("Murilo Torres");
        cl1.setCpf("059.116.568-68");
        // associar a conta ao cliente
        c1.setCliente(cl1);
        // cria objeto cliente
        Cliente cl2 = new Cliente("Ana", "056.555.888-99");
        // cria o objeto conta
        Conta c2 = new Conta("123-4", "7890", cl2);

        c1.depositar(5000);
        c1.sacar(500);
        c1.transferir(500, c2);

        System.out.println(c1.getInfo());
        System.out.println(c2.getInfo());

        c1.getCliente().setNome("Novo nome");
        System.out.println(c1.getCliente().getCpf());
    }
}


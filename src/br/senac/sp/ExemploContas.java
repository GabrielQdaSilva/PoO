package br.senac.sp;

import br.senac.sp.banco.Conta;

public class ExemploContas {
    static void main() {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        Conta c3 = c1;

        c1.depositar(1000);
        c2.depositar(500);
        c3.depositar(100);
        c1.transferir(50, c2);
        c3.transferir(100, c2);


    }
}

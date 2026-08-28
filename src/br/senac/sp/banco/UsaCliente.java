package br.senac.sp.banco;

public class UsaCliente {
    static void main(String[] args) {
        Cliente cl1 = new Cliente();
        cl1.setNome("Murilo Torres");
        cl1.setCpf("123.456.789.0");
        cl1.setSexo(Sexo.FEMININO);

        Cliente cl2 = new Cliente();
        cl2.setNome("Paula");
        cl2.setSexo(Sexo.NAO_INFORMADO);

        System.out.println(cl1.getNome());
        System.out.println(cl1.getSexo().getDescricao());
    }
}

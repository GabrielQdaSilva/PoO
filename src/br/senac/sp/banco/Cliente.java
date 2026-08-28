package br.senac.sp.banco;

public class Cliente {
    private String nome;
    private String cpf;
    private static int contador;
    private Sexo sexo;

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    // construtor sobrecarregado privado
    private Cliente(String cpf) {
        this.cpf = cpf;
        contador++;
    }

    // construtor sobrecarregado
    public Cliente(String nome, String cpf) {
        // invocando o construtor que recebe cpf
        this(cpf);
        this.nome = nome;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @param contador the contador to set
     */
    public static void setContador(int contador) {
        Cliente.contador = contador;
    }

    // construtor padrão
    public Cliente() {
        contador++;
    }

    public static int getContador() {
        return contador;
    }

}

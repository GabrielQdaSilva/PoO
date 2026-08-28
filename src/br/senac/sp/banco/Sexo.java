package br.senac.sp.banco;

public enum Sexo {
    FEMININO("Feminino",'F',0),
    MASCULINO("Masculino",'M',1),
    NAO_INFORMADO("Não Informado", 'X',2);

    private Sexo(String descricao) {
        this.descricao = descricao;
        this.sigla = descricao.charAt(0);
    }
    private Sexo(String descricao, char sigla, int valor) {
        this.descricao = descricao;
    }

       private String descricao;
    private char sigla;
    private int valor;
    public int getValor(){
        return valor;
    }
    public char getSigla(){
        return sigla;
    }
    public String getDescricao(){
        return descricao;
    }


}


package br.senac.sp.banco;

public enum TipoConta {ADULTO('A',"Conta para maiores de 18 anos",false),
    INFANTIL('I',"Conta para menores de 18 anos", true);
    private TipoConta(char sigla, String descricao, boolean monitorada) {
       this.sigla = sigla;
       this.descricao = descricao;
       this.monitorada = monitorada;
    }
    private char sigla;
    private String descricao;
    private boolean monitorada;

    public char getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isMonitorada() {
        return monitorada;
    }
}

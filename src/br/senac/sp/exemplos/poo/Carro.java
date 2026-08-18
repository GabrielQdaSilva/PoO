package br.senac.sp.exemplos.poo;

public class Carro {
    public String marca;
public String modelo;
public String chassi;
private int velocidade = 0;

    public int marcha;
public int velocidadeMaxima = 120;

public String buzinar() {
    return "Bip bip!";
}
public void trocarMarcha() {
    if (velocidade <= 20 || velocidade <= 40 || velocidade <= 60 || velocidade <= 80 || velocidade <= 100 || velocidade <= 120) {
        marcha++;
        System.out.printf("Marcha Atual %d\n",marcha);
    }
}
public String exibirVelocidade() {
return String.format("Velocidade: %d km/h", velocidade);
}
    public void acelerar(){
    if (velocidade < velocidadeMaxima) {
        velocidade++;
    }
    System.out.printf("Velocidade: %d km/h%n", velocidade);
}
public void frear() {

    velocidade--;

    System.out.printf("Velocidade: %d km/h%n", velocidade);
}

}

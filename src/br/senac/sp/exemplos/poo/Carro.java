package br.senac.sp.exemplos.poo;

public class Carro {
    public String marca;
public String modelo;
public String chassi;
private int velocidade;
public int velocidadeMaxima = 120;

public String buzinar() {
    return "Bip bip!";
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

package br.senac.sp.exemplos.poo;

public class Carro {
    public String marca;
public String modelo;
public String chassi;
private int velocidade;
public void acelerar(){
    velocidade++;
    System.out.printf("Velocidade: %d km/h%n", velocidade);

}
public void frear(){
    velocidade--;
    System.out.printf("Velocidade: %d km/h%n", velocidade);
}

}

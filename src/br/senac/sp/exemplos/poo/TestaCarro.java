package br.senac.sp.exemplos.poo;

public class TestaCarro {
    public static void main(String[] args) {
        Carro car = new Carro();
        car.chassi = "123456789";
        car.marca ="VW";
        car.modelo = "Fusca";
        for (int i = 0; i < 100; i++) {
            car.acelerar();
        }
    }
}

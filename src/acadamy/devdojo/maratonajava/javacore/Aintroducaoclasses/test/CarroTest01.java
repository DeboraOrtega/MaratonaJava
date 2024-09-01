package acadamy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import acadamy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.nome = "Renault";
        carro.modelo = "Sandero";
        carro.ano = 2015;

        carro1.nome = "Jeep";
        carro1.modelo = "Renagede";
        carro1.ano = 2024;

        System.out.println("Carro - nome: " + carro.nome + " modelo: " + carro.modelo + " ano: " + carro.ano);
        System.out.println("\n Carro1 - nome: " + carro1.nome + " modelo: " + carro1.modelo + " ano: " + carro1.ano);
    }
}

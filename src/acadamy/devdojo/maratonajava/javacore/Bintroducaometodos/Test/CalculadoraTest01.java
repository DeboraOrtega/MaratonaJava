package acadamy.devdojo.maratonajava.javacore.Bintroducaometodos.Test;

import acadamy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Metodo somaDoisNumeros");
        calculadora.somaDoisNumeros();

        System.out.println("Metodo subtraiDoisNumeros");
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
    }
}

package acadamy.devdojo.maratonajava.javacore.Bintroducaometodos.Test;

import acadamy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(10,0);
        System.out.println(result);
        System.out.println("---------");
        calculadora.imprimeDividsaoDeDoisNumeros(86,0);
    }
}

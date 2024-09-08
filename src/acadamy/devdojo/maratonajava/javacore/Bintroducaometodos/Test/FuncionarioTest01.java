package acadamy.devdojo.maratonajava.javacore.Bintroducaometodos.Test;

import acadamy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Debora";
        funcionario.idade = 36;
        funcionario.salarios = new double[]{1500, 2700, 3900};

        funcionario.imprime();
        funcionario.imprimeMediaSalario();
    }
}

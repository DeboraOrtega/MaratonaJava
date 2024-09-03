package acadamy.devdojo.maratonajava.javacore.Bintroducaometodos.Test;

import acadamy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;
import acadamy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();
        //boas praticas: náo alterar um objeto dentro do metodo
        estudante.nome = "Debora";
        estudante.idade = 37;
        estudante.sexo = 'F';

        estudante1.nome = "Vinicius";
        estudante1.idade = 38;
        estudante1.sexo = 'M';

        impressoraEstudante.imprime(estudante);
        impressoraEstudante.imprime(estudante1);

        System.out.println(estudante.nome);
        System.out.println(estudante1.nome);
    }
}

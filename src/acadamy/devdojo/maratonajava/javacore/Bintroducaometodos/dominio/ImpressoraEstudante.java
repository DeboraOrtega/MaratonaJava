package acadamy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import acadamy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("-----------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        estudante.nome = "Davi";
    }
}

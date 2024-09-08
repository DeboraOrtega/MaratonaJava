package acadamy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+ this.idade);
        if (this.salarios == null){
            System.out.println("Salarios náo informados");
            return;
        }
        System.out.println("Salarios: ");
        for (double sal : this.salarios){
            System.out.println(sal);
        }
    }

    public void imprimeMediaSalario(){
        if (this.salarios == null){
            System.out.println("Salarios náo informados");
            return;
        }

        double media = 0;

        for (double sal : salarios){
            media += sal;
        }
        media /= salarios.length;
        System.out.println("Media de salario: "+ media);
    }
}

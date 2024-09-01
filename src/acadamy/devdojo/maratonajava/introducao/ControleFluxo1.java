package acadamy.devdojo.maratonajava.introducao;

public class ControleFluxo1 {
    public static void main(String[] args) {
        int idade = 17;
        float salario = 2000;
        String categoria;

        if(idade < 15) {
            categoria = "infantil";
        }else if (idade >=15 && idade <18){
            categoria = "juvenil";
        }else {
            categoria = "adulta";
        }

        System.out.println(categoria);

        boolean c = false;

        if(c = true) {
            System.out.println("verdadeiro, porque vc atribuiu verdadeiro pra c");
        }
    }
}

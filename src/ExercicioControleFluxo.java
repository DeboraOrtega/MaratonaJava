public class ExercicioControleFluxo {
    public static void main(String[] args) {
        double salario = 5500;
        double imposto;

        if(salario < 1000){
            imposto = salario * 0.5;
        } else if(salario >= 1000 && salario < 2000){
            imposto = salario * 0.10;
        }else if(salario >=200 && salario <4000){
            imposto = salario * 0.15;
        }else{
            imposto = salario * 0.20;
        }
        System.out.println("o total de imposto é "+imposto);
    }
}

package acadamy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(20-5);
    }
    public void multiplicaDoisNumero(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(int num1, int num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }
    public void imprimeDividsaoDeDoisNumeros(int num1, int num2){
        if (num2 ==0){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1/num2);
    }
}

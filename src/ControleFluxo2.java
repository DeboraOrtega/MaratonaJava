public class ControleFluxo2 {
    public static void main(String[] args) {
        int idade = 20;
        String status;

        if(idade > 18){
            status = "adulto";
        }else{
            status = "nào adulto";
        }
        System.out.println(status);
        //operador ten[ario utilizar apenas duas condiçòes (if e else) pois fica difpicil de ler
        //os valores devem ser domesmo tipo da variável
        status = idade > 18 ? "adulto" : "nào adulto";
        System.out.println(status);
    }
}

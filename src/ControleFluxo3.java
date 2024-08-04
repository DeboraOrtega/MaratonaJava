public class ControleFluxo3 {
    public static void main(String[] args) {
        byte dia = 5;
        
        //tipos que podem ser usados no switch: char,int,byte,short,enum e String
        switch(dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break; //para náo ler os demais cases
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
        }
    }
}

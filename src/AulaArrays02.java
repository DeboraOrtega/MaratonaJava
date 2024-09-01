public class AulaArrays02 {
    public static void main(String[] args) {
        //byte,short,int,float e double = 0
        //char endoce '/u000'
        //boolean false
        //string null
        String[] nomes = new String[4];
        nomes[0] = "Maria";
        nomes[1] = "José";
        nomes[2] = "Ana";
        nomes[3] = "Pedro";

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        //desconsidera o array anterior e considera esse / perde os valores
        nomes = new String[5];

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}

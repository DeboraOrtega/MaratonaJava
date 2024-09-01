public class AulaEstruturaRepeticao06 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        //break
        System.out.println("break");
        for (int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if (valorParcela <= 1000){
                break;
            }
            System.out.println("Parcela: " +parcela + " R$" + valorParcela);
        }
        //continue
        System.out.println("continue");
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            if (valorParcela <= 1000){
                continue;
            }
            System.out.println("Parcela: " +parcela + " R$" + valorParcela);
        }
    }
}

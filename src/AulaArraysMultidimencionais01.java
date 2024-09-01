public class AulaArraysMultidimencionais01 {
    public static void main(String[] args) {
        int[] [] dias = new int[3] [3];
        dias[0] [0] = 31;
        dias[0] [1] = 28;
        dias[0] [2] = 31;

        dias[1] [0] = 311;
        dias[1] [1] = 281;
        dias[1] [2] = 311;

        dias[2] [0] = 3111;
        dias[2] [1] = 2811;
        dias[2] [2] = 3111;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i] [j]);
            }
        }
        //foreach utiliza uma variavel de array do tipo int
        for (int[] arrayBase: dias) {
            for (int num: arrayBase) {
                System.out.println(num);
            }
        }
    }
}

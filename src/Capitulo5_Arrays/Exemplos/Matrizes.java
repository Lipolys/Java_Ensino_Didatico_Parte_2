package Capitulo5_Arrays.Exemplos;

public class Matrizes {
    public static void main (String[] args){
        int[][]  matriz = new int[3][3];
        matriz[0][0] = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ((int) Math.pow(i, 2)) + ((int) Math.pow(j, 6 - i) - 2);
            }
        }
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " |");
            }
            System.out.println();
        }
        /*for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(anInt + " |");
            }
            System.out.println();
        }*/
    }
}

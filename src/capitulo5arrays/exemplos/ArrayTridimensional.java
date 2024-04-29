package capitulo5arrays.exemplos;

public class ArrayTridimensional {
    public static void main (String[] args) {
        int[][][] cubo = new int[2][3][2];
        cubo[0][0][0] = 1;
        cubo[0][1][0] = 3;
        cubo[0][2][0] = 5;
        cubo[1][0][0] = 7;
        cubo[1][1][0] = 9;
        cubo[1][2][0] = 11;
        cubo[0][0][1] = 2;
        cubo[0][1][1] = 4;
        cubo[0][2][1] = 6;
        cubo[1][0][1] = 8;
        cubo[1][1][1] = 10;
        cubo[1][2][1] = 12;
        int somaPares = 0, somaImpares = 0;
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    System.out.println(cubo[i][j][k]);
                    if (k == 1) {
                        somaPares += cubo[i][j][k];
                    } else {
                        somaImpares += cubo [i][j][k];
                    }
                }
            }
        }
        System.out.println("Somas dos pares: " + somaPares + "\nSoma dos impares: " + somaImpares);
    }
}

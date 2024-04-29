package capitulo6metodos.atividades;

public class Cap06Atividade02Metodo {
    public static void contar (){
        System.out.print("Contagem de 1 a 10: ");
        for (int i = 1; i <= 10; i++) System.out.print(i + ", ");
    }


    public static void contar (int fim){
        System.out.print("Contagem de 1 a " + fim + ": ");
        for (int i = 1; i <= fim; i++) System.out.print(i + ", ");
    }


    public static void contar (int inicio, int fim){
        System.out.print("Contagem de " + inicio + " a " + fim + ": ");
        for (int i = inicio; i <= fim; i++) System.out.print(i + ", ");
    }


    public static void contar (int inicio, int fim, int pause) {
        try {
            System.out.print("Contagem de " + inicio + " a " + fim + ": ");
            for (int i = inicio; i <= fim; i++) {
                System.out.print(i + ", ");
                Thread.sleep(pause * 1000L);
            }
        } catch (InterruptedException ignored) {}
    }
}

package Capitulo6_Metodos.Atividades;

public class Cap06Atividade05 {
    public static void main (String[] args) {
        int[] valores1 = Cap06Atividade05Metodo.geraArray(100);
        int[] valores2 = Cap06Atividade05Metodo.geraArray(100);
        System.out.println(Cap06Atividade05Metodo.buscaValor(valores1, valores2, 8));
    }
}

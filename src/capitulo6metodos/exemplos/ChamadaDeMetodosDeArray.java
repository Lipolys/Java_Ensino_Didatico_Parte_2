package capitulo6metodos.exemplos;

public class ChamadaDeMetodosDeArray {
    public static void main (String[] args) {
        double[] numeros = {12.4, 3.4, 9, 7.3, 6.6};
        double maior = MetodosComArray.buscarMaior(numeros);
        System.out.println("O maior valor é: " + maior);

        String[] nomes = {"Ivone", "Carlos", "Lila", "Alzira", "Bruno", "Flavio", "Rita"};
        for (String nome:MetodosComArray.ordenarPalavras(nomes)) {
            System.out.print(nome + ", ");
        }
    }
}

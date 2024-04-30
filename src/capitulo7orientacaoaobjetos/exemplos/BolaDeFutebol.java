package capitulo7orientacaoaobjetos.exemplos;

public class BolaDeFutebol extends Bola {
    private String tipo;

    public BolaDeFutebol (String cor, int tamanho, String tipo) {
        super(cor, tamanho);
        this.tipo = tipo;
    }

    public void mostrar () {
        super.mostrar();
        System.out.println(tipo);
    }
}

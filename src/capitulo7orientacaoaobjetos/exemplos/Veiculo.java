package capitulo7orientacaoaobjetos.exemplos;

public abstract class Veiculo {
    public int velocidade;
    public boolean status = true;

    public void ligar () {
        status = true;
    }
    public void desligar () {
        status = false;
    }
    public void mostrarStatus () {
        System.out.println(status);
    }

    public abstract void acelerar ();
}

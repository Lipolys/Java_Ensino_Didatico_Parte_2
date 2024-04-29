package capitulo7crientacaoaobjetos.exemplos;

public class TelevisorConstrutor {
    int volume;
    int canal;

    public TelevisorConstrutor() {}

    public TelevisorConstrutor (int volume) {
        this.volume = volume;
    }

    public TelevisorConstrutor (int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void trocarCanal(int c) {
        canal = c;
    }

    public void mostrar () {
        System.out.println("Volume: " + volume + "\nCanal: " + canal);
    }
}

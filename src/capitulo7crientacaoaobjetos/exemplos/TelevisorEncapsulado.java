package capitulo7crientacaoaobjetos.exemplos;

public class TelevisorEncapsulado {
    int volume;
    int canal;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        try {
            if (volume > 0 && volume < 100) {
                this.volume = volume;
            } else {
                throw new Exception("Volume fora da faixa permitida, deve um valor entre 0 e 100");
            }
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }

    public int getCanal () {
        return canal;
    }

    public void setCanal (int canal){
        if (canal >= 0 && canal <= 1000) {
            this.canal = canal;
        }
    }
    public void aumentarVolume(){
        if (volume < 100) {
            volume++;
        }

    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void aumentarCanal() {
        if (canal < 1000) {
            canal++;
        }
    }

    public void diminuirCanal() {
        if (canal > 0) {
            canal--;
        }
    }
}

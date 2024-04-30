package capitulo7orientacaoaobjetos.atividades;

public class Cap07Atividade01 {
    private boolean status;
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean isStatus() {
        return status;
    }

    public void ligar (int tempoEmSegundos) {
        try {
            System.out.println(isStatus());
            for (int i = 0; i < tempoEmSegundos; i++) {
                setStatus(true);
                System.out.println(isStatus());
                Thread.sleep(1000);
            }
            desligar();
            System.out.println(isStatus());
        } catch (InterruptedException ignored) {}
    }

    public void desligar () {
        setStatus(false);
    }
}

package capitulo7orientacaoaobjetos.atividades;

public class Cap07Atividade05 {
    public static void main (String[] args) {
        Robo robo = new Robo();
        robo.virar('N');
        robo.ligar();
        robo.virar('N');
        robo.virar('N');
        robo.andar(70);
        robo.virar('O');
        robo.falar("Abobrinhas");
        robo.andar(80);
        robo.virar('P');
        robo.virar('O');
        robo.desligar();
        robo.falar("Coisa com coisa");

    }
}

interface Controle {
    void andar(int distancia);
    void virar(char direcao);
    void falar(String frase);
}

class Robo implements Controle{
    private boolean status;
    private int distanciaPercorrida;
    private char direcao;
    Robo(){
        distanciaPercorrida = 0;
        status = false;
        direcao = 'N';
    }
    public void setDistanciaPercorrida(int distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }
    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean isStatus() {
        return status;
    }
    public char getDirecao() {
        return direcao;
    }
    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }

    public void ligar(){
        setStatus(true);
        falar("Robô ligado");
    }
    public void desligar(){
        falar("Desligando robô");
        setStatus(false);
    }
    @Override
    public void andar(int distancia) {
        if (isStatus()){
            distanciaPercorrida = distanciaPercorrida + distancia;
            falar("Percorrendo " + distancia + " unidades de distancia\nJá percorri " + distanciaPercorrida + " unidades de distância");
        }
    }
    @Override
    public void virar(char direcao) {
        if (isStatus()) {
            if (direcao == 'N' || direcao == 'S' || direcao == 'L' || direcao == 'O') {
                if (getDirecao() == direcao) {
                    falar("Já estou virado para " + direcao);
                } else {
                    setDirecao(direcao);
                    falar("Virando para " + direcao);
                }
            } else {
                falar("Impossível virar para a direção solicitada\nInsira N, S, L ou O");
            }
        }

    }
    @Override
    public void falar(String frase) {
        if (isStatus()) {
            System.out.println(frase);
        }
    }
}

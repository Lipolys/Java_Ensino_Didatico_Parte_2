package capitulo7orientacaoaobjetos.exemplos;

public class UsaVeiculo {
    public static void main (String[] args) {
        Veiculo carro = new Carro();
        carro.ligar();
        carro.mostrarStatus();
        carro.acelerar();
        System.out.println(carro.velocidade);
        carro.desligar();
        carro.mostrarStatus();
        System.out.println();
        Veiculo aviao = new Aviao();
        aviao.ligar();
        aviao.mostrarStatus();
        aviao.acelerar();
        System.out.println(aviao.velocidade);
        aviao.desligar();
        aviao.mostrarStatus();
    }
}

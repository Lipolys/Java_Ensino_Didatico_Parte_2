package capitulo7crientacaoaobjetos.exemplos;

public class UsaTelevisorEncapsulado {
    public static void main (String[] args) {
        TelevisorEncapsulado tv = new TelevisorEncapsulado();
        tv.setCanal(150);
        tv.aumentarCanal();
        tv.setVolume(3);
        tv.diminuirVolume();
        System.out.println(tv.getCanal());
        System.out.println(tv.getVolume());
    }
}

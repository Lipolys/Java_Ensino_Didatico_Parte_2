package capitulo7orientacaoaobjetos.exemplos;

public class UsaTelevisorConstrutor {
    public static void main (String[] args) {
        TelevisorConstrutor tv1 = new TelevisorConstrutor();
        TelevisorConstrutor tv2 = new TelevisorConstrutor(3);
        TelevisorConstrutor tv3 = new TelevisorConstrutor(3, 150);


        tv1.mostrar();
        tv2.mostrar();
        tv3.mostrar();
    }
}

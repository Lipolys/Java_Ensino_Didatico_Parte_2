package capitulo7orientacaoaobjetos.atividades;

public class Cap07Atividade03 {
    public static void main (String[] args) {
        Gps teste1 = new Gps();
        Gps teste2 = new Gps("Para Corumbá de Goiás");
        System.out.println(teste1.getRota() + " " + teste2.getRota());
        System.out.println(teste1.getIdioma() + " " + teste2.getIdioma());
        teste1.setIdioma("Inglês");
        teste1.setRota("To New York City, baby!");
        System.out.println(teste1.getIdioma() + " " + teste1.getRota());
    }
}

class Gps {
    private String idioma;
    private String rota;
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public String getIdioma() {
        return idioma;
    }
    public void setRota(String rota) {
        this.rota = rota;
    }
    public String getRota() {
        return rota;
    }

    public Gps (){}
    public Gps (String rota) {
        this.idioma = "Português";
        this.rota = rota;
    }
}

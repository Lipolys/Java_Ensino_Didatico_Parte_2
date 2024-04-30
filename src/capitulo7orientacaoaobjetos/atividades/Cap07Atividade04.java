package capitulo7orientacaoaobjetos.atividades;

public class Cap07Atividade04 {
    public static void main (String[] args) {
        Brinquedo brinquedo1 = new Brinquedo();
        Brinquedo brinquedo2 = new Brinquedo("Carrinho");
        Brinquedo brinquedo3 = new Brinquedo("Boneca", 12.5f);

        brinquedo1.mostrar();
        brinquedo2.mostrar();
        brinquedo3.mostrar();

        brinquedo1.setFaixaEtaria("0 a 2");
        brinquedo2.setFaixaEtaria("3 a 5");
        //brinquedo3.setFaixaEtaria("Mais de 11");
        //Regra de negócio validada :D
        brinquedo3.setFaixaEtaria("acima de 10");

        brinquedo1.setNome("Fazendinha");
        brinquedo1.setPreco(30.25f);

        brinquedo1.mostrar();
        brinquedo2.mostrar();
        brinquedo3.mostrar();
    }
}

class Brinquedo {
    private String nome;
    private String faixaEtaria;
    private float preco;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setFaixaEtaria(String faixaEtaria) {

        try {
            switch (faixaEtaria) {
                case "0 a 2", "6 a 10", "3 a 5", "acima de 10": this.faixaEtaria = faixaEtaria; break;
                default: throw new Exception("Valor inválido");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public String getFaixaEtaria() {
        return faixaEtaria;
    }
    public float getPreco() {
        return preco;
    }

    public Brinquedo() {}
    public Brinquedo(String nome) {
        this.nome = nome;
    }
    public Brinquedo(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void mostrar() {
        System.out.println(nome + ", " +faixaEtaria + ", " + preco);
    }
}

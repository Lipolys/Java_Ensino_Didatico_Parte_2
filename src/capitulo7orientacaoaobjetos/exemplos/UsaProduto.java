package capitulo7orientacaoaobjetos.exemplos;

public class UsaProduto {
    public static void main (String[] args) {
        //Teste de Gravação
        ProdutoPersiste produto = new ProdutoPersiste();
        produto.setCodigo(2);
        produto.setDescricao("Sabonete");
        System.out.println(produto.gravar());
        //Teste de Leitura
        Produto p = ProdutoPersiste.ler(produto.getCodigo()); // Jeito mais desacoplado que ProdutoPersiste.ler(2);
        System.out.println(p.getCodigo());
        System.out.println(p.getDescricao());
    }
}

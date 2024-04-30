package capitulo7orientacaoaobjetos.exemplos;

public class UsaFuncionario {
    public static void main (String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Luiz");
        funcionario.setCpf("98765432111");
        funcionario.setCartao("FAT1220");
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getCpf());
        System.out.println(funcionario.getCartao());
    }
}

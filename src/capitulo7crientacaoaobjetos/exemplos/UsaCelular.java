package capitulo7crientacaoaobjetos.exemplos;

public class UsaCelular {
    public static void main (String[] args) {
        Celular celular1 = new Celular();
        Celular celular2 = new Celular();
        Celular celular3 = new Celular();
        celular1.numero = "11 5421-2342";
        celular2.numero = "11 4321-2345";
        celular3.numero = "11 9874-5656";
        Celular.nomeEmpresa = "Empresa Genérica do Brasil";

        System.out.println(Celular.nomeEmpresa + ", " + celular1.numero);     //Fica aqui, para o leitor, a aplicação do que o autor indica como inapropriado:
        celular2.nomeEmpresa = "Empresa não tão genérica do Paraguai";        //Realizar acessos em uma variável de escopo de classe a partir de uma instância.
        System.out.println(Celular.nomeEmpresa + ", " + celular1.nomeEmpresa);//aqui também
    }
}

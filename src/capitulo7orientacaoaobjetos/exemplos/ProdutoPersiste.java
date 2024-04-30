package capitulo7orientacaoaobjetos.exemplos;

import java.io.*;

public class ProdutoPersiste extends Produto {
    public String gravar () {
        String feedback = "Produto armazenado com sucesso";
        try {
            FileOutputStream file = new FileOutputStream("/home/lipe/Codigos e Faculdade/Java_Ensino_Didatico_Parte_2/src/capitulo7orientacaoaobjetos/exemplos/produto" + this.getCodigo());
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(this);
            stream.flush();
        } catch (Exception e){
            feedback = "Falha na gravação\n" + e.toString();
        }
        return feedback;
    }
    public static Produto ler(int codigo) {
        try {
            FileInputStream file = new FileInputStream("/home/lipe/Codigos e Faculdade/Java_Ensino_Didatico_Parte_2/src/capitulo7orientacaoaobjetos/exemplos/produto" + codigo);
            ObjectInputStream stream = new ObjectInputStream(file);
            return ((Produto) stream.readObject());
        } catch (Exception e) {
            System.out.println("Falha na leitura\n" + e.toString());
            return null;
        }
    }
}

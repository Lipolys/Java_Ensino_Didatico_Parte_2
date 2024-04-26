package Capitulo6_Metodos.Atividades;

import java.util.Random;

public class Cap06Atividade04Metodo {
    public static long criaSenha () {
        Random gerador = new Random();
        return (gerador.nextLong(100000000));
    }
}

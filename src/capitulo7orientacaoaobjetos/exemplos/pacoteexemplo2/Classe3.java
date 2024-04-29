package capitulo7orientacaoaobjetos.exemplos.pacoteexemplo2;

import capitulo7orientacaoaobjetos.exemplos.pacoteexemplo1.*;

public class Classe3 {
    public static void main (String[] args){
        Classe1 x = new Classe1();
        Classe2 y = new Classe2();
        System.out.println(x.somar(1, 2));
        System.out.println(y.subtrair(150, 3));
    }
}

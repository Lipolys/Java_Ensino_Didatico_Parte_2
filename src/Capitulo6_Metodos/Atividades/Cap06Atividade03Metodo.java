package Capitulo6_Metodos.Atividades;

public class Cap06Atividade03Metodo {
    public static int getDia (String data) {
        int dia = 0;
        if (data.charAt(2) == '/' && data.charAt(5) == '/') {
            dia = Integer.parseInt(data.substring(0, 2));
        }
        return dia;
    }

    public static int getMes (String data) {
        int mes = 0;
        if (data.charAt(2) == '/' && data.charAt(5) == '/') {
            mes = Integer.parseInt(data.substring(3, 5));
        }
        return mes;
    }

    public static int getAno (String data) {
        int ano = 0;
        if (data.charAt(2) == '/' && data.charAt(5) == '/') {
            ano = Integer.parseInt(data.substring(6, 10));
        }
        return ano;
    }
}

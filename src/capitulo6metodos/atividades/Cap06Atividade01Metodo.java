package capitulo6metodos.atividades;

public class Cap06Atividade01Metodo {
    public static String getMesPorExtenso(int numeroMes, int idioma) {
        return switch (idioma) {
            case 1 -> switch (numeroMes) {
                case 1 -> "Janeiro";
                case 2 -> "Fevereiro";
                case 3 -> "Março";
                case 4 -> "Abril";
                case 5 -> "Maio";
                case 6 -> "Junho";
                case 7 -> "Julho";
                case 8 -> "Agosto";
                case 9 -> "Setembro";
                case 10 -> "Outubro";
                case 11 -> "Novembro";
                case 12 -> "Dezembro";
                default -> "Mês desconhecido";
            };
            case 2 -> switch (numeroMes) {
                case 1 -> "January";
                case 2 -> "February";
                case 3 -> "March";
                case 4 -> "April";
                case 5 -> "May";
                case 6 -> "June";
                case 7 -> "July";
                case 8 -> "August";
                case 9 -> "September";
                case 10 -> "October";
                case 11 -> "November";
                case 12 -> "December";
                default -> "Unknow month";
            };
            default -> "Selecione idioma 1 ou 2";
        };
    }
}
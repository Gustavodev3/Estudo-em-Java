public class Estudo20 {

    enum DiaDaSemana {
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO,
        DOMINGO,
    }

    public static void main(String[] args) {

        DiaDaSemana hoje = DiaDaSemana.SEXTA;
        System.out.println(hoje);
    }
}

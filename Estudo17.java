public class Estudo17 {

    static class Aluno {
        String nome;
        double nota;

        Aluno(String nome, double nota) {
            this.nome = nome;
            this.nota = nota;
        }

        void exbirResultado() {
            if (nota >= 7) {
                System.out.println(nome + " Foi aprovado com nota: " + nota);

            } else
                System.out.println(nome + " Foi reprovado com nota: " + nota);

        }
    }

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Gustavo", 7.00);
        Aluno a2 = new Aluno("Julia", 6.58);
        a1.exbirResultado();
        a2.exbirResultado();
    }
}
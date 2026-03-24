public class Estudo15 {

    static class Pessoa {
        String nome;
        int idade;

        Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        void apresentar() {
            System.out.println("Olá meu nome é " + nome + " e tenho " + idade + " anos.");
        }
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gustavo", 25);
        p1.apresentar();
    }
}

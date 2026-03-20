public class Estudo14 {

    static class Carro {
        String marca;
        int ano;

        Carro(String marca, int ano) {
            this.marca = marca;
            this.ano = ano;
        }

        void exibirinfo() {
            System.out.println("Marca = " + marca);
            System.out.println("Ano = " + ano);
        }
    }

    public static void main(String[] args) {
        Carro c1 = new Carro("celta", 2026);
        c1.exibirinfo();
    }
}

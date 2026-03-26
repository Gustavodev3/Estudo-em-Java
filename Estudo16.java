public class Estudo16 {

    static class Produto {
        String nome;
        double preco;

        Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        void exibirProduto() {
            System.out.printf(nome + " R$ %.2f%n", preco);

        }
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00);
        Produto p2 = new Produto("Mouse gamer", 120.50);
        p1.exibirProduto();
        p2.exibirProduto();
    }
}

public class Estudo21 {

    enum StatusPedido {
        PENDENTE,
        PROCESSANDO,
        ENVIADO,
        ENTREGUE,
    }

    public static class Pedido {

        int numero;
        StatusPedido status;

        public Pedido(int numero, StatusPedido status) {
            this.numero = numero;
            this.status = status;
        }

    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido(4, StatusPedido.ENTREGUE);
        System.out.println(pedido.numero);
        System.out.println(pedido.status);
    }
}

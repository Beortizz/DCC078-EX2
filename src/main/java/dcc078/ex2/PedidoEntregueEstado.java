package dcc078.ex2;

public class PedidoEntregueEstado  extends PedidoEstado {

    private PedidoEntregueEstado() {
    }

    private static PedidoEntregueEstado instance = new PedidoEntregueEstado();

    public static PedidoEntregueEstado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pedido Entregue";
    }

}

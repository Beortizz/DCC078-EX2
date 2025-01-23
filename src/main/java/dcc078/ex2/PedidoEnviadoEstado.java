package dcc078.ex2;

public class PedidoEnviadoEstado extends PedidoEstado {

    private PedidoEnviadoEstado() {
    }

    private static PedidoEnviadoEstado instance = new PedidoEnviadoEstado();

    public static PedidoEnviadoEstado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pedido Enviado";
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoCanceladoEstado.getInstance());
        return true;
    }


    public boolean entregar(Pedido pedido) {
        pedido.setEstado(PedidoEntregueEstado.getInstance());
        return true;
    }
}

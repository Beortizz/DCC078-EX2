package dcc078.ex2;

public class PedidoCanceladoEstado  extends PedidoEstado {

    private PedidoCanceladoEstado() {
    }

    private static PedidoCanceladoEstado instance = new PedidoCanceladoEstado();

    public static PedidoCanceladoEstado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pedido Cancelado";
    }

    public boolean processar(Pedido pedido) {
        pedido.setEstado(AguardandoPagamentoEstado.getInstance());
        return true;
    }

}

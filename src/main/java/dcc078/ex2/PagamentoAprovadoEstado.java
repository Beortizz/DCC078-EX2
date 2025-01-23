package dcc078.ex2;

public class PagamentoAprovadoEstado extends PedidoEstado {

    private PagamentoAprovadoEstado() {
    }

    private static PagamentoAprovadoEstado instance = new PagamentoAprovadoEstado();

    public static PagamentoAprovadoEstado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pagamento Aprovado";
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoCanceladoEstado.getInstance());
        return true;
    }

    public boolean enviar(Pedido pedido) {
        pedido.setEstado(PedidoEnviadoEstado.getInstance());
        return true;
    }
}

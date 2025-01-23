package dcc078.ex2;

public class AguardandoPagamentoEstado extends  PedidoEstado {

       private AguardandoPagamentoEstado() {
        };
       private static AguardandoPagamentoEstado instance = new AguardandoPagamentoEstado();
       public static AguardandoPagamentoEstado getInstance() {
           return instance;
       }

        public String getEstado() {
            return "Aguardando Pagamento";
        }

        public boolean pagar(Pedido pedido) {
            pedido.setEstado(PagamentoAprovadoEstado.getInstance());
            return true;
        }

        public boolean cancelar(Pedido pedido) {
            pedido.setEstado(PedidoCanceladoEstado.getInstance());
            return true;
        }
}

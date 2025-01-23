package dcc078.ex2;

public class Pedido {

    private String produto;
    private PedidoEstado estado;

    public Pedido() {
        this.estado = AguardandoPagamentoEstado.getInstance();
    }
    public void setEstado(PedidoEstado estado) {
       this.estado = estado;
    }

    public boolean cancelar() {
        return this.estado.cancelar(this);
    }

    public boolean enviar() {
        return this.estado.enviar(this);
    }

    public boolean entregar() {
       return this.estado.entregar(this);
    }

    public boolean processar() {
        return this.estado.processar(this);
    }

    public boolean pagar() {
        return this.estado.pagar(this);
    }


    public String getNomeEstado() {
        return this.estado.getEstado();
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public PedidoEstado getEstado() {
        return estado;
    }
}

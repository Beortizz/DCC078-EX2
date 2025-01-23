package dcc078.ex2;

public abstract class PedidoEstado {

    public abstract String getEstado();

    public boolean cancelar(Pedido pedido){
        return false;
    }

    public boolean enviar(Pedido pedido){
        return false;
    }

    public boolean entregar(Pedido pedido){
        return false;
    }

    public boolean processar(Pedido pedido){
        return false;
    }

    public boolean pagar(Pedido pedido){
        return false;
    }

}

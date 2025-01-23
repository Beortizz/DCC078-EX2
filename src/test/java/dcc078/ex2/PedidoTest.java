package dcc078.ex2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class PedidoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    @Test
    public void naoDeveEnviarPedidoAguardandoPagamento() {
        pedido.setEstado(AguardandoPagamentoEstado.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveProcessarPedidoAguardandoPagamento() {
        pedido.setEstado(AguardandoPagamentoEstado.getInstance());
        assertFalse(pedido.processar());
    }

    @Test
    public void naoDeveEntregarPedidoAguardandoPagamento() {
        pedido.setEstado(AguardandoPagamentoEstado.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void devePagarPedidoAguardandoPagamento() {
        pedido.setEstado(AguardandoPagamentoEstado.getInstance());
        assertTrue(pedido.pagar());
    }

    @Test
    public void deveCancelarPedidoAguardandoPagamento() {
        pedido.setEstado(AguardandoPagamentoEstado.getInstance());
        assertTrue(pedido.cancelar());
    }

    @Test
    public void naoDeveEntregarPedidoPago() {
        pedido.setEstado(PagamentoAprovadoEstado.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveProcessarPedidoPago() {
        pedido.setEstado(AguardandoPagamentoEstado.getInstance());
        assertFalse(pedido.processar());
    }

    @Test
    public void naoDevePagarPedidoPago() {
        pedido.setEstado(PagamentoAprovadoEstado.getInstance());
        assertFalse(pedido.pagar());
    }

    @Test
    public void deveCancelarPedidoPago() {
        pedido.setEstado(PagamentoAprovadoEstado.getInstance());
        assertTrue(pedido.cancelar());
    }

    @Test
    public void deveEnviarPedidoPago() {
        pedido.setEstado(PagamentoAprovadoEstado.getInstance());
        assertTrue(pedido.enviar());
    }

    @Test
    public void naoDeveEnviarPedidoEnviado() {
        pedido.setEstado(PedidoEnviadoEstado.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveProcessarPedidoEnviado() {
        pedido.setEstado(PedidoEnviadoEstado.getInstance());
        assertFalse(pedido.processar());
    }

    @Test
    public void naoDevePagarPedidoEnviado() {
        pedido.setEstado(PedidoEnviadoEstado.getInstance());
        assertFalse(pedido.pagar());
    }

    @Test
    public void deveEntregarPedidoEnviado() {
        pedido.setEstado(PedidoEnviadoEstado.getInstance());
        assertTrue(pedido.entregar());
    }

    @Test
    public void deveCancelarPedidoEnviado() {
        pedido.setEstado(PedidoEnviadoEstado.getInstance());
        assertTrue(pedido.cancelar());
    }

    @Test
    public void naoDeveEntregarPedidoEntregue() {
        pedido.setEstado(PedidoEntregueEstado.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDevePagarPedidoEntregue() {
        pedido.setEstado(PedidoEntregueEstado.getInstance());
        assertFalse(pedido.pagar());
    }

    @Test
    public void naoDeveProcessarPedidoEntregue() {
        pedido.setEstado(PedidoEntregueEstado.getInstance());
        assertFalse(pedido.processar());
    }

    @Test
    public void naoDeveEnviarPedidoEntregue() {
        pedido.setEstado(PedidoEntregueEstado.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveCancelarPedidoEntregue() {
        pedido.setEstado(PedidoEntregueEstado.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveCancelarPedidoCancelado() {
        pedido.setEstado(PedidoCanceladoEstado.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDevePagarPedidoCancelado() {
        pedido.setEstado(PedidoCanceladoEstado.getInstance());
        assertFalse(pedido.pagar());
    }

    @Test
    public void naoDeveEnviarPedidoCancelado() {
        pedido.setEstado(PedidoCanceladoEstado.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveEntregarPedidoCancelado() {
        pedido.setEstado(PedidoCanceladoEstado.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void deveProcessarPedidoCancelado() {
        pedido.setEstado(PedidoCanceladoEstado.getInstance());
        assertTrue(pedido.processar());
    }
}

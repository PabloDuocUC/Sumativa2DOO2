package duoc.speedfast;

import java.util.ArrayList;
import java.util.List;

public class ZonaDeCarga {

    private List<Pedido> pedidos;

    public ZonaDeCarga() {
        this.pedidos = new ArrayList<>();
        System.out.println("[ZONA DE CARGA INICIALIZADA]");
    }

    public synchronized void agregarPedido(Pedido p) {
        pedidos.add(p);
        System.out.println("Pedido #" + p.getId() + " agregado. Con destino: " + p.getDireccionEntrega());
    }

    //metodo que retorna un Pedido. Si la lista esta vacia devuelve null
    public synchronized Pedido retirarPedido() {
        if (pedidos.isEmpty()) {
            return null;
        } else {
            Pedido pedido = pedidos.get(0);
            pedidos.remove(0);
            return pedido;
        }
    }

}

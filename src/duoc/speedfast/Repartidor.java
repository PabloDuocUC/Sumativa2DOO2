package duoc.speedfast;

public class Repartidor implements Runnable {

    private String nombre;
    private ZonaDeCarga zonaDeCarga;

    public Repartidor(String nombre, ZonaDeCarga zonaDeCarga) {
        this.nombre = nombre;
        this.zonaDeCarga = zonaDeCarga;
    }

    @Override
    public void run(){
        while (true) {
            Pedido pedido = zonaDeCarga.retirarPedido();

            if (pedido == null) {
                break;
            }

            System.out.println("[REPARTIDOR - " + nombre + "] Retirando pedido #" + pedido.getId());

            pedido.setEstado(EstadoPedido.EN_REPARTO);
            System.out.println("[REPARTIDOR - " + nombre + "] Estado: " + pedido.getEstado());

            System.out.println("[REPARTIDOR - "+ nombre + "] Entregando pedido #" + pedido.getId());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            pedido.setEstado(EstadoPedido.ENTREGADO);
            System.out.println("[REPARTIDOR - " + nombre +"] Estado de pedido : " + pedido.getEstado());
        }
    }
}

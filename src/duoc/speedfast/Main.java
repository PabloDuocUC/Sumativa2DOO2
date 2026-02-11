package duoc.speedfast;

public class Main {
    public static void main(String[] args) {
        ZonaDeCarga zona = new ZonaDeCarga();

        zona.agregarPedido(new Pedido(1, "Calle Calameña 1212"));
        zona.agregarPedido(new Pedido(2, "Avenida Cavernosa 4321"));
        zona.agregarPedido(new Pedido(3, "Cerro MachuPichu 1111"));
        zona.agregarPedido(new Pedido(4, "Hallownest 4321"));
        zona.agregarPedido(new Pedido(5, "Balmaceda 3725"));

        Repartidor r1 = new Repartidor("Pablo", zona);
        Repartidor r2 = new Repartidor("Makarena", zona);
        Repartidor r3 = new Repartidor("Carlos", zona);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todos los pedidos han sido entregados satisfactoriamente. ");
    }
}

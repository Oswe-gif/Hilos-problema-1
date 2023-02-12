package co.com.tienda.service;

public class Service implements  Runnable{
    private UpdateBD query;
    private ConnectionBackend connect;

    public Service(UpdateBD query, ConnectionBackend connect) {
        this.query = query;
        this.connect = connect;
    }
    private void updateOrder() {
        query.updateNewOrder();
    }
    private void setConnection()
    {
        connect.setConnection();
    }

    @Override
    public void run() {
        System.out.println("Su compra esta siendo procesada");
        try {
            Thread.sleep(3000);
            this.setConnection();
            this.updateOrder();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}

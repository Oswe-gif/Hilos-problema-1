package co.com.tienda.main;

import co.com.tienda.modelo.User;
import co.com.tienda.service.Envio;
import co.com.tienda.service.MySQL;
import co.com.tienda.service.Service;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Samuel","Zapatos","calle 11");
        Service service = new Service(new MySQL(),new Envio());//connect with the backend and the bd
        Thread newThread= new Thread(service);
        newThread.start();
        Envio envio = new Envio();
        envio.sendProducto(user1);

    }
}

package co.com.tienda.service;

import co.com.tienda.modelo.User;

public class Envio implements ConnectionBackend {
    public void sendProducto(User usuario)
    {
        System.out.println(usuario.getName()+", gracias por comprar en nuestra tienda!!");
    }

    @Override
    public void setConnection() {
        System.out.println("Estableciendo conexion con el backend");
    }

}

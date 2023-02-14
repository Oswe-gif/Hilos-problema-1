package co.com.tienda.service;

import co.com.tienda.modelo.User;

public class Envio implements ConnectionBackend {
    public void sendProducto(User usuario)//Informa al usuario sobre su compra, se "procesa" y se envia
    {
        System.out.println(usuario.getName()+", su compra se ha realizado y sera enviada al "+usuario.getAddress());
    }

    @Override
    public void setConnection() {
        System.out.println("Estableciendo conexion con el backend");
    }

}

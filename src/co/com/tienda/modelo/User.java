package co.com.tienda.modelo;

public class User {
    private String name;
    private String product;
    private String address;

    public User(String name, String product, String address) {
        this.name = name;
        this.product = product;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

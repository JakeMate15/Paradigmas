package Funcionamiento;

/**
 *
 * @author erikm
 */
public class Producto {
    private double precio;
    private String marca;
    private int id;
    
    public Producto(double precio, String marca, int id){
        this.precio = precio;
        this.marca = marca;
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}

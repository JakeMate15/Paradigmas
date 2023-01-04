package Funcionamiento;
import java.util.*;

/**
 *
 * @author erikm
 */
public class Producto {
    private double precio;
    private String marca;
    private int id;
    private String nombre;
    
    public Producto(double precio, String marca, int id, String nombre){
        this.precio = precio;
        this.marca = marca;
        this.id = id;
        this.nombre = nombre;
    }

    public Producto(int id){
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getCaducidad() {
        Calendar fecha = Calendar.getInstance();
        fecha.add(Calendar.MONTH, 1);
        fecha.add(Calendar.YEAR,1);

        return fecha;
    }
    
    @Override
    public String toString() {
        return "{" +
            " precio='" + getPrecio() + "'" +
            ", marca='" + getMarca() + "'" +
            ", id='" + getId() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return this.id == other.id;
    }

    
}

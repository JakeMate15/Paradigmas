package Funcionamiento;

/**
 *
 * @author erikm
 */
public class Vivere extends Producto{
    private int Caducidad;

    public Vivere(int Caducidad, double precio, String marca, int id) {
        super(precio, marca, id);
        this.Caducidad = Caducidad;
    }

    public int getCaducidad() {
        return Caducidad;
    }

    public void setCaducidad(int Caducidad) {
        this.Caducidad = Caducidad;
    }
    
    
}

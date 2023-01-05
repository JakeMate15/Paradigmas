package Funcionamiento;
import java.util.*;

/**
 *
 * @author erikm
 */
public class Vivere extends Producto{
    private Calendar Caducidad;

    public Vivere(Calendar Caducidad, double precio, String marca, int id, String nombre) {
        super(precio, marca, id,nombre);
        this.Caducidad = Caducidad;
    }

    public Vivere(int id){
        super(id);
        this.Caducidad=null;
    }    

    @Override
    public Calendar getCaducidad() {
        return Caducidad;
    }

    public void setCaducidad(Calendar Caducidad) {
        this.Caducidad = Caducidad;
    }
    
}

package Funcionamiento;

/**
 *
 * @author erikm
 */
public class Electrodomestico extends Producto{
    private int garantia;
    
    public Electrodomestico(double precio, String marca, int id, String nombre){
        super(precio,marca,id, nombre);
        garantia = 12;
    }

    public Electrodomestico(int id){
        super(id);
        garantia = 12;
    }

}

package Funcionamiento;

/**
 *
 * @author erikm
 */
public class Electrodomestico extends Producto{
    private int garantia;
    
    public Electrodomestico(double precio, String marca, int id){
        super(precio,marca,id);
        garantia = 12;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    
}

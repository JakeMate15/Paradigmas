package Funcionamiento;

/**
 *
 * @author erikm
 */
public class Pair{
    private Producto first;
    private Integer second;

    public Pair(Producto first, Integer second) {
        this.first = first;
        this.second = second;
    }

    public Producto getFirst() {
        return first;
    }

    public void setFirst(Producto first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }
    
    public void setPrecio(double cantidad){
        first.setPrecio(cantidad);
    }
}

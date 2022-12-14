package Funcionamiento;

import java.util.*;

/**
 *
 * @author erikm
 */
public class Inventario {
    private HashMap<Integer, Pair> inv;
    private int controlId;

    public Inventario(){
        inv = new HashMap<>();
        controlId = 0;
    }

    public void creaProducto(Producto p,int cantidad,int id){
        inv.put(id, new Pair(p,cantidad));
    }

    public void modificaInventario(int cantidad, Integer id){
        if(cantidad<=0) throw new Exepciones("La cantidad de productos debe ser al menos 1");

        Pair aux = inv.get(id);
        aux.setSecond(cantidad);
        inv.put(id,aux);
    }

    public int consultaInventario(Integer id){
        return  inv.get(id).getSecond();
    }

    public void actualizaPrecio(int id, double cantidad){
        if(cantidad<=0) throw new Exepciones("El precio debe ser mayor o igual a 0");
        
        Pair aux = inv.get(id);
        aux.setPrecio(cantidad);
        inv.put(id, aux);
    }

    public void imprimeHasMap(){
        System.out.println(inv.toString());
    }
    
    public int getControlId(){
        return controlId;
    }
    
    public void addId(){
        controlId++;
    }

    public Producto getProducto(int id){
        return inv.get(id).getFirst();
    }

    public HashMap<String, Integer> getViveres(){
        HashMap<String, Integer> res = new HashMap<>();


        for(Pair x: inv.values()){
            if(x.getFirst().getClass().equals(new Vivere(-1).getClass())){
                res.put(x.getFirst().getNombre(),x.getFirst().getId());
            }
        }

        return res;
    }
    
    public HashMap<String, Integer> getElectrodomesticos(){
        HashMap<String, Integer> res = new HashMap<>();

        for(Pair x: inv.values()){
            if(x.getFirst().getClass().equals(new Electrodomestico(-1).getClass())){
                res.put(x.getFirst().getNombre(),x.getFirst().getId());
            }
        }

        return res;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    public void agregaInventario(Producto p, int cantidad, Integer id){
        Pair aux = inv.get(id);
        aux.addSecond(cantidad);
        inv.put(id, aux);
    }

    public void reduceInventario(Producto p, int cantidad, Integer id){
        Pair aux = inv.get(id);
        aux.rest(cantidad);
        inv.put(id,aux);
    }

    public int consultaInventario(Integer id){
        return  inv.get(id).getSecond();
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
    
    public static void main(String[] args){
        Inventario inv = new Inventario();
        ArrayList<Producto> productos = new ArrayList<>();
        
        productos.add(new Electrodomestico(7600.0,"LG",inv.getControlId(),"Television LED, 32"));
        inv.addId();
        productos.add(new Electrodomestico(5400.0,"Mabe",inv.getControlId(),"Lavadora"));
        inv.addId();
        productos.add(new Vivere(new GregorianCalendar(2023,12,3),35.5,"Gamesa",inv.getControlId(),"Galletas de animalitos"));
        inv.addId();
        productos.add(new Vivere(new GregorianCalendar(2030,12,3),15.5,"Alpura",inv.getControlId(),"Leche Deslactosada"));
        inv.addId();
        
        inv.creaProducto(productos.get(0), 15, productos.get(0).getId());
        inv.creaProducto(productos.get(1), 8, productos.get(1).getId());
        inv.creaProducto(productos.get(2), 200, productos.get(2).getId());
        inv.creaProducto(productos.get(3), 560, productos.get(3).getId());

        HashMap<String,Integer> viveres = inv.getViveres();

        for(String x: viveres.keySet()){
            System.out.println(x);
        }

        System.out.println(viveres.get("Galletas de animalitos"));
    }
}

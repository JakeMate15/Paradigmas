/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;
import Funcionamiento.*;
import java.util.*;
/**
 *
 * @author erikm
 */
public class FuncionamientoLogin {

    public static void main(String args[]) {
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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login log = new login(inv);
                log.setVisible(true);
                log.setLocationRelativeTo(null);
                log.setResizable(false);
            }
        });
    }
    
    
    
}
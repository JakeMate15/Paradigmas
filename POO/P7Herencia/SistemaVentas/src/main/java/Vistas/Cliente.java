/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;
import Funcionamiento.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author erikm
 */
public class Cliente extends javax.swing.JFrame {
    private String nombre;
    private Inventario inv;
    private HashMap<String,Integer> viveres;
    private HashMap<String,Integer> electro;
    private javax.swing.JButton agregarBtn;
    private javax.swing.JButton btnGeneraTicker;
    private javax.swing.JLabel cantidadCompra;
    private javax.swing.JSpinner cantidadCompraSelector;
    private javax.swing.JTable carritoCompra;
    private DefaultTableModel modelo;
    private javax.swing.JButton cerrarSesionCliente;
    private javax.swing.JLabel fechaVivereLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel marcaLabel;
    private javax.swing.JLabel nombreCliente;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JComboBox<String> selectorArticuloCombo;
    private javax.swing.JComboBox<String> selectorTipoCombo;
    private javax.swing.JLabel totalCompraTxt;


    public Cliente(String nombre, Inventario inv) {
        this.nombre = nombre;
        this.inv = inv;
        viveres = inv.getViveres();
        electro = inv.getElectrodomesticos();
        initComponents();
    }

    private void initComponents() {

        nombreCliente = new javax.swing.JLabel();
        cerrarSesionCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        carritoCompra = new javax.swing.JTable();
        agregarBtn = new javax.swing.JButton();
        SpinnerModel value = new SpinnerNumberModel(1, 1, 100, 1);
        cantidadCompraSelector = new javax.swing.JSpinner(value);
        cantidadCompra = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalCompraTxt = new javax.swing.JLabel();
        btnGeneraTicker = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        selectorTipoCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fechaVivereLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        selectorArticuloCombo = new javax.swing.JComboBox<>();
        marcaLabel = new javax.swing.JLabel();
        precioLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreCliente.setText("Bienvenido: "+nombre);

        cerrarSesionCliente.setText("Cerrar Sesión");
        cerrarSesionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionClienteActionPerformed(evt);
            }
        });

        modelo = new DefaultTableModel(new Object [][] {},
            new String [] {
                "Id","Producto","Marca","Fecha", "Precio", "Cantidad", "Subtotal"
        });

        carritoCompra.setModel(modelo);
        jScrollPane1.setViewportView(carritoCompra);

        agregarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/carr.jpg")));
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });

        cantidadCompra.setText("Cantidad");

        jLabel3.setText("Total");

        totalCompraTxt.setText("$0.00");

        btnGeneraTicker.setText("Generar Ticket");

        jLabel1.setText("Articulo:");

        selectorTipoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vivere", "Electrodomestico"}));
        selectorTipoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorTipoComboActionPerformed(evt);
            }
        });

        jLabel2.setText("Marca:");

        jLabel5.setText("Precio:");

        jLabel6.setText("Caducidad:");

        fechaVivereLabel.setText("03/01/2023");

        jLabel7.setText("Tipo:");


        ArrayList<String> aux = new ArrayList<>();
        for(String x: viveres.keySet()){
            aux.add(x);
        }
        String[] listaViveres = aux.toArray(new String[0]);
        selectorArticuloCombo.setModel(new javax.swing.DefaultComboBoxModel<>(listaViveres));
        selectorArticuloCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorArticuloComboActionPerformed(evt);
            }
        });

        marcaLabel.setText("n/d");

        precioLabel.setText("$0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombreCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cerrarSesionCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(selectorTipoCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(selectorArticuloCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(marcaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(precioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(24, 24, 24)
                                        .addComponent(agregarBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cantidadCompra)
                                                .addGap(16, 16, 16))
                                            .addComponent(cantidadCompraSelector, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
                                    .addComponent(fechaVivereLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(139, 139, 139)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totalCompraTxt))
                                .addComponent(btnGeneraTicker, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreCliente)
                    .addComponent(cerrarSesionCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(selectorTipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(selectorArticuloCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(marcaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(precioLabel)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(agregarBtn)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(cantidadCompra)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cantidadCompraSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fechaVivereLabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(totalCompraTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGeneraTicker)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    //Cerrar la sesion actual
    private void cerrarSesionClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        this.setVisible(false);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login log = new login(inv);
                log.setVisible(true);
                log.setLocationRelativeTo(null);
                log.setResizable(false);
            }
        });
    }  

    //Selector de tipo de articulo
    private void selectorTipoComboActionPerformed(java.awt.event.ActionEvent evt) {   
        Calendar fecha = Calendar.getInstance();
        ArrayList<String> aux = new ArrayList<>();

        if(selectorTipoCombo.getSelectedItem().toString().equals("Vivere")){
            jLabel6.setText("Caducidad");
            fechaVivereLabel.setText(fecha.get(Calendar.DATE) + "/" + (fecha.get(Calendar.MONTH)+1) +"/" + fecha.get(Calendar.YEAR));
        }
        else{
            jLabel6.setText("Garantia");
            fechaVivereLabel.setText(fecha.get(Calendar.DATE) + "/" + (fecha.get(Calendar.MONTH)+1) +"/" + (fecha.get(Calendar.YEAR)+1));
        }  
        
        
        viveres = inv.getViveres();
        electro = inv.getElectrodomesticos();

        if(selectorTipoCombo.getSelectedItem().toString().equals("Vivere")){
            for(String x: viveres.keySet()){
                aux.add(x);
            }
        }
        else{
            for(String x: electro.keySet()){
                aux.add(x);
            }
        }  

        String[] listaViveres = aux.toArray(new String[0]);
        selectorArticuloCombo.setModel(new javax.swing.DefaultComboBoxModel<>(listaViveres));
    }  
    
    
    //Selector de articulo
    private void selectorArticuloComboActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        double precio;
        int id;
        String nombre = selectorArticuloCombo.getSelectedItem().toString();
        String marca;
        Calendar fecha;

        if(selectorTipoCombo.getSelectedItem().toString().equals("Vivere")){
            id = viveres.get(nombre);
            fecha = ((Vivere)inv.getProducto(id)).getCaducidad();
            fechaVivereLabel.setText(fecha.get(Calendar.DATE) + "/" + fecha.get(Calendar.MONTH) +"/" + fecha.get(Calendar.YEAR));
        }
        else{
            id = electro.get(nombre);
        }  

        precio = inv.getProducto(id).getPrecio();
        precioLabel.setText(String.valueOf(precio));

        marca = inv.getProducto(id).getMarca();
        marcaLabel.setText(marca);

    
    }  

    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {   
        int cantidad = (Integer)cantidadCompraSelector.getValue();
        String nombre = selectorArticuloCombo.getSelectedItem().toString();
        HashMap<Integer,Integer> productos = new HashMap();  
        int id,cantInventario;
        double precio,subtotal;  
        String marca,fech;
        Calendar fecha;

        if(selectorTipoCombo.getSelectedItem().toString().equals("Vivere")){
            id = viveres.get(nombre);
        }
        else{
            id = electro.get(nombre);
        } 

        cantInventario = inv.consultaInventario(id);

        try{
            if(cantidad>cantInventario) throw new Exepciones("No hay suficientes productos en el inventario");

            inv.modificaInventario(cantInventario-cantidad, id);
            productos.put(id,cantidad);

            precio = inv.getProducto(id).getPrecio();
            marca = inv.getProducto(id).getMarca();
            fecha = 
            modelo.addRow(new Object[]{id,nombre,,,precio,cantidad,cantidad*precio});
        }
        catch(Exepciones e){
            JOptionPane.showMessageDialog(null, e.getMessage() +" articulos","Error",JOptionPane.WARNING_MESSAGE);
        }
    }  
}

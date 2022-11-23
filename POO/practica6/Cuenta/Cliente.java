import java.util.*;
import java.text.*;

public class Cliente {
    private String nombre;
    private String paterno;
    private String materno;
    private String direccion;
    private Calendar fN;

    public Cliente(){
        nombre = "";
        paterno = "";
        materno = "";
        direccion = "";
        fN = null;
    }

    public Cliente(String nombre, String paterno, String materno, String direccion, Calendar fN) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.direccion = direccion;
        this.fN = fN;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return this.paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return this.materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFecha(Calendar fecha){
        fN = fecha;
    }

    public String getFecha(){
        return "\nFecha de nacimiento: " + fN.get(Calendar.DATE) + "/" + fN.get(Calendar.MONTH) +"/" + fN.get(Calendar.YEAR);
    }

    public String infoCliente(){
        return 
            "Nombre: " + nombre + " " + paterno + " " + materno +
            "\nDireccion: " +  direccion +
            getFecha() + "\n";
    }

    public void imprimeInfo() {
        System.out.println(
            "Nombre: " + nombre + " " + paterno + " " + materno +
            "\nDireccion: " +  direccion + "\n"+
            getFecha() + "\n"
        );
    }

}
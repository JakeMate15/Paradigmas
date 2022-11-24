public class Cliente {
    private String nombre;
    private String paterno;
    private String materno;
    private String direccion;

    public Cliente(){
        nombre = "";
        paterno = "";
        materno = "";
        direccion = "";
    }

    public Cliente(String nombre, String paterno, String materno, String direccion) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.direccion = direccion;
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

    public String infoCliente(){
        return 
            "\nNombre: " + nombre + " " + paterno + " " + materno +
            "\nDireccion: " +  direccion + "\n";
    }

    public void imprimeInfo() {
        System.out.println(
            "Nombre: " + nombre + " " + paterno + " " + materno +
            "\nDireccion: " +  direccion + "\n"
        );
    }

}

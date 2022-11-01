public class Contacto {
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private long telefono;
    private String tipoContacto;

    public Contacto(){

    }

    public Contacto(String name, String apPat, String apMat, long tel){
        nombre = name;
        apPaterno = apPat;
        apMaterno = apMat;
        telefono = tel;
    }

    String getNombre(){
        return nombre;
    }

    void setNombre(String nombre){
        this.nombre = nombre;
    }

    String getApPaterno(){
        return apPaterno;
    }

    void setApPaterno(String apPaterno){
        this.apPaterno = apPaterno;
    }

    String getApMaterno(){
        return apMaterno;
    }

    void setApMaterno(String apMaterno){
        this.apMaterno = apMaterno;
    }

    long getTelefono(){
        return telefono;
    }

    void setTelefeono(long telefono){
        this.telefono = telefono;
    }

    String getTipo(){
        return tipoContacto;
    }

    void setTipo(String tipo){
        this.tipoContacto = tipo;
    }

    String datosObjeto(){
        return "Nombre: "+ nombre + " " + apPaterno + " " + apMaterno + "\nTelefono: " + telefono + "\nTipo de contacto: " + tipoContacto;
    }
}

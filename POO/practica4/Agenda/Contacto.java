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

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApPaterno(){
        return apPaterno;
    }

    public void setApPaterno(String apPaterno){
        this.apPaterno = apPaterno;
    }

    public String getApMaterno(){
        return apMaterno;
    }

    public void setApMaterno(String apMaterno){
        this.apMaterno = apMaterno;
    }

    public long getTelefono(){
        return telefono;
    }

    public void setTelefeono(long telefono){
        this.telefono = telefono;
    }

    public String getTipo(){
        return tipoContacto;
    }

    public void setTipo(String tipo){
        this.tipoContacto = tipo;
    }

    public String getNombreCompleto(){
        return nombre + " " + apPaterno + " " + apMaterno; 
    }

    public String datosObjeto(){
        return "Nombre: "+ nombre + " " + apPaterno + " " + apMaterno + "\nTelefono: " + telefono + "\nTipo de contacto: " + tipoContacto;
    }
}

public class Pelicula {
    private final int TAM = 5;

    private String nombre;
    private int yearEstreno;
    private String genero;
    private String[] actores;
    private String director;
    private String[] premios;
    private int noActores;
    private int noPremios;

    public Pelicula(String nombre, int yearEstreno, String genero, String director) {
        this.nombre = nombre;
        this.yearEstreno = yearEstreno;
        this.genero = genero;
        this.director = director;
        actores = new String[TAM];
        premios = new String[TAM];
        noActores = 0;
        noPremios = 0;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYearEstreno() {
        return this.yearEstreno;
    }

    public void setYearEstreno(int yearEstreno) {
        this.yearEstreno = yearEstreno;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getActores() {
        StringBuilder cad = new StringBuilder();

        for(int i=0;i<noActores;i++){
            cad.append(actores[i]);
        }

        return cad.toString();
    }

    public String[] getListaActores(){
        return actores;
    }

    public void setActor(String actor) {
        if(noActores<TAM){
            actores[noActores] = actor;
            noActores++;
        }
    }

    public int getNoActores(){
        return noActores;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPremios() {
        StringBuilder cad = new StringBuilder();

        for(int i=0;i<noPremios;i++){
            cad.append(premios[i]);
        }

        return cad.toString();
    }

    public void setPremio(String premio) {
        if(noPremios<TAM){
            premios[noActores] = premio;
            noPremios++;
        }
    }

    public String verInformacion() {
        return "\nNombre: " + getNombre() + "\n" +
            "Año de estreno" + getYearEstreno() + "\n" +
            "Genero" + getGenero() + "\n" +
            "Actores: " + getActores() + "\n" +
            "Director: " + getDirector() + "\n" +
            "Premios: " + getPremios() + "\n";
    }


}

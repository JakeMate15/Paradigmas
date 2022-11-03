public class Recomendacion {
    private final int TAM = 20;
    private final int CANT_OP = 8;

    private Pelicula[] peliculas;
    private int noPeliculas;

    public Recomendacion(){
        peliculas = new Pelicula[TAM];
        noPeliculas = 0;
    }

    public void addPelicula(Pelicula p){
        if(noPeliculas<TAM){
            peliculas[noPeliculas] = p;
            noPeliculas++;
        }
    }

    public void Recomendacion(String actores, String generos, String directores){
        String[] genero, actor, director;
    }

    
}
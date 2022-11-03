public class Recomendacion {
    private final int TAM = 20;
    private final int CANT_OP = 10;

    private Pelicula[] peliculas;
    private int noPeliculas;
    private String[] actores;
    private int noActores;
    private String[] directores;
    private int noDirectores;
    private String[] generos;
    Pelicula[] recomendaciones;
    int noRecomendaciones;

    public Recomendacion(){
        peliculas = new Pelicula[TAM];
        noPeliculas = 0;
        actores = new String[CANT_OP];
        noActores = 0;
        directores = new String[CANT_OP];
        noDirectores = 0;
        generos = new String[8];
        generos[0] = "Terror";
        generos[1] = "Suspenso";
        generos[2] = "Romance";
        generos[3] = "Comedia";
        generos[4] = "Drama";
        generos[5] = "Fantasia";
        generos[6] = "Musical";
        generos[7] = "Documental";
        recomendaciones = new Pelicula[TAM];
        noRecomendaciones = 0;
    }

    private boolean busqueda(String cad, int op){
        boolean res = false;

        switch (op){
            case 1:
                        for(int i=0; i<noPeliculas; i++){
                            for(int j=0; j<peliculas[i].getNoActores(); j++){
                                if(cad.equals(peliculas[i].getListaActores()[j])){
                                    res = true;
                                }
                            }
                        }
                        break;
            case 2: 
                        for(int i=0; i<noPeliculas; i++){
                            if(peliculas[i].getDirector().equals(cad)){
                                res = true;
                            }
                        }
                        break;
        }

        return res;
    }

    private void busqueda(int elemento, int op){

        switch (op){
            case 1:
                        for(int i=0; i<noPeliculas; i++){
                            for(int j=0; j<peliculas[i].getNoActores(); j++){
                                if(actores[elemento].equals(peliculas[i].getListaActores()[j])){
                                    if(!bucaPelicula(peliculas[i].getNombre())){
                                        recomendaciones[noRecomendaciones] = peliculas[i];
                                        noRecomendaciones++;
                                    }
                                }
                            }
                        }
                        break;
            case 2: 
                        for(int i=0; i<noPeliculas; i++){
                            if(peliculas[i].getDirector().equals(directores[elemento])){
                                if(!bucaPelicula(peliculas[i].getNombre())){
                                    recomendaciones[noRecomendaciones] = peliculas[i];
                                    noRecomendaciones++;
                                }
                            }
                        }
                        break;
            case 3:
                        for(int i=0; i<noPeliculas; i++){
                            if(peliculas[i].getGenero().equals(generos[elemento])){
                                if(!bucaPelicula(peliculas[i].getNombre())){
                                    recomendaciones[noRecomendaciones] = peliculas[i];
                                    noRecomendaciones++;
                                }
                            }
                        }
                        break;
                        
        }

    }

    public void addPelicula(Pelicula p){
        if(noPeliculas<TAM){
            peliculas[noPeliculas] = p;
            noPeliculas++;

            if(!busqueda(p.getDirector(), 2)){
                directores[noDirectores] = p.getDirector();
                noDirectores++;
            }

            for(int i = 0; i<p.getNoActores();i++){
                if(!busqueda(p.getListaActores()[i], 1)){
                    actores[noActores] = p.getListaActores()[i];
                    noActores++;
                }
            }  
        }
    }

    public void getListaActores(){
        System.out.println();
        for(int i=0;i<noActores;i++){
            System.out.println((i+1) + ". " + actores[i]);
        }
        System.out.println();
    }

    public void getListaGeneros(){
        System.out.println();
        for(int i=0;i<noActores;i++){
            System.out.println((i+1) + ". " + generos[i]);
        }
        System.out.println();
    }

    public void getDirectores(){
        System.out.println();
        for(int i=0;i<noActores;i++){
            System.out.println((i+1) + ". " + directores[i]);
        }
        System.out.println();
    }


    private boolean bucaPelicula(String p){
        boolean res = false;

        for(int i = 0; i<noRecomendaciones; i++){
            if(recomendaciones[i].getNombre().equals(p)){
                res = true;
                break;
            }
        }

        return res;
    }


    public void recomendacion(String actores, String generos, String directores){
        String genero, actor, director;
        int longMax,cantGeneros,cantActores,cantDirectores;
        int aux;

        actor = (actores.replace(" ", "")).replace(",", "");
        genero = (generos.replace(" ", "")).replace(",", "");
        director = (directores.replace(" ", "")).replace(",", "");

        cantActores = actor.length();
        cantGeneros = genero.length();
        cantDirectores = director.length();

        longMax = Math.max(cantActores,Math.max(cantGeneros, cantDirectores));

        for(int i=0; i<longMax; i++){
            aux = Character.getNumericValue(actor.charAt(i));

            if(i<cantActores){
                
                busqueda(aux,1);
            }

            if(i<cantGeneros){
                busqueda(aux,3);
                
            }

            if(i<cantDirectores){
                busqueda(aux,2);
            }
        }
    }

    public void muestraRecomendaciones(){
        System.out.println();
        for(int i=0;i<noRecomendaciones;i++){
            System.out.println(recomendaciones[i].getNombre());
        }
        System.out.println();
    }


    
    
}
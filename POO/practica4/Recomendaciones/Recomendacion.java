import java.util.*;

public class Recomendacion {
    private Set<Pelicula> peliculas;
    private Set<String> actores;
    private Set<String> directores;
    private Set<String> generos;
    private Set<Pelicula> recomendaciones;


    public Recomendacion(){
        peliculas = new HashSet<Pelicula>();
        actores  = new HashSet<String>();
        directores = new HashSet<String>();
        generos  = new HashSet<String>();
        recomendaciones = new HashSet<Pelicula>();
    }

    public void creaCatalogo(){
        String[] nombres = {"El Padrino","El mago de Oz","Ciudadano Kane","Cadena perpetua","Pulp Fiction","Casablanca","Una odisea del espacio","Blade Runner","La naranja mecánica","Todo en un día","Alien ","Interestelar","Tron","Avengers","Batman","Dune","Wathcmen","Maze Runer","Death Note","Your Name"};
        String[] directores = {"Steven Spielberg","Peter Jackson","Michael Bay","James Cameron","Christopher Nolan"};
        String[] actores = {"Timothée Chalamet","Zendaya","Saoirse Ronan","Anya Taylor-Joy","Dev Patel","Margot Robbie","Daniel Kaluuya","Emma Stone","Michael B. Jordan","Adam Driver"};
        int[] years = {2015,1987,2000,2022,2014};
        String[] premios = {"Oscar", "Emmy","Globos de oro","Canes","BAFTA"};
        String[] generos = {"Terror","Comedia","Suspenso","Romance","Drama","Fantasia","Musical","Documental"};
        Random rand = new Random();
        Pelicula p;


        for(int i = 0; i<20; i++){
            p = new Pelicula(nombres[i], years[rand.nextInt(5)], generos[rand.nextInt(8)], directores[rand.nextInt(5)]);

            for(int j=0;j<rand.nextInt(3)+1;j++){
                p.setPremio(premios[rand.nextInt(5)]);
            }

            for(int k=0;k<rand.nextInt(3)+1;k++){
                p.setActor(actores[rand.nextInt(10)]);
            }
            
            peliculas.add(p);

            this.directores.add(p.getDirector());
            this.generos.add(p.getGenero());
            
            for(int j = 0; j<p.getNoActores();j++){
                this.actores.add(p.getListaActores()[j]);
            }    
            
        } 
        
    }

    public void muestraActores(){
        int i = 0;

        System.out.println();

        for (String x : actores){
            i++;
            System.out.println(i+"." + x);
        }

        System.out.println();
    }

    public void muestraGeneros(){
        int i = 0;

        System.out.println();

        for (String x : generos){
            i++;
            System.out.println(i+"." + x);
        }

        System.out.println();
    }

    public void muestraDirectores(){
        int i = 0;

        System.out.println();

        for (String x : directores){
            i++;
            System.out.println(i+"." + x);
        }

        System.out.println();
    }

    public void muestraCatalogo(){
        for(Pelicula x : peliculas){
            System.out.println(x.verInformacion());
        }
    }

    public void recomendaciones(String actores, String generos, String directores){
        StringTokenizer prefActores = new StringTokenizer(actores,", ");
        StringTokenizer prefGeneros = new StringTokenizer(generos,", ");
        StringTokenizer prefDirectores = new StringTokenizer(directores,", ");

        String[] listaActores = this.actores.toArray(new String[0]);
        String[] listaGeneros = this.generos.toArray(new String[0]);
        String[] listaDirectores = this.directores.toArray(new String[0]);

        int pos;

        while(prefActores.hasMoreTokens()){
            pos = Integer.parseInt(prefActores.nextToken())-1;
            
            if(pos < listaActores.length && pos >=0)
                busquedaPorCampo(1, listaActores[pos]);
        }

        while(prefGeneros.hasMoreTokens()){
            pos = Integer.parseInt(prefGeneros.nextToken())-1;
            
            if(pos < listaGeneros.length && pos >=0)
                busquedaPorCampo(2, listaGeneros[pos]);
        }

        while(prefDirectores.hasMoreTokens()){
            pos = Integer.parseInt(prefDirectores.nextToken())-1;
            
            if(pos < listaDirectores.length && pos >=0)
                busquedaPorCampo(3, listaDirectores[pos]);
        }
    }

    private void busquedaPorCampo(int op, String elemento){

        switch (op){
            case 1: 
                        for (Pelicula x : peliculas){
                            for(int i=0; i<x.getNoActores();i++){
                                if(x.getListaActores()[i].equals(elemento)){
                                    recomendaciones.add(x);
                                }
                            }
                        }
                        break;
            case 2:
                        for (Pelicula x : peliculas){
                            if(x.getGenero().equals(elemento)){
                                recomendaciones.add(x);
                            }
                        }
                        break;
            case 3:
                        for (Pelicula x : peliculas){
                            if(x.getDirector().equals(elemento)){
                                recomendaciones.add(x);
                            }
                        }
        }
    }

    public void muestraRecomendaciones(){
        for(Pelicula x : recomendaciones){
            System.out.println(x.getNombre());
        }
    }



    public static void main(String[] args){
        Recomendacion r = new Recomendacion();
        String directores,actores,generos;
        Scanner lec = new Scanner(System.in);
        int op;

        r.creaCatalogo();

        do{
            System.out.println("Elige una opcion");
            System.out.println("0. Salir");
            System.out.println("1. Mostrar el catalogo de peliculas");
            System.out.println("2. Recomendar peliculas");
            System.out.print("Escriba su respuesta: ");

            op = lec.nextInt();

            switch(op){
                case 0:
                            System.out.println("Saliendo...");
                            break;
                case 1:
                            r.muestraCatalogo();
                            break;
                case 2:
                            System.out.println("Los actores disponibles son: ");
                            r.muestraActores();
                            System.out.print("Ingresa tus preferencias mediante el número correspondiente (Si ingresas un número no válido o 0, omitiras este campo) y separandolo por comas y/o espacios: ");
                            actores = lec.nextLine();
                    
                            System.out.println("Los directores disponibles son: ");
                            r.muestraDirectores();
                            System.out.print("Ingresa tus preferencias mediante el número correspondiente (Si ingresas un número no válido o 0, omitiras este campo) y separandolo por comas y/o espacios: ");
                            directores = lec.nextLine();
                    
                            System.out.println("Los generos disponibles son: ");
                            r.muestraGeneros();
                            System.out.print("Ingresa tus preferencias mediante el número correspondiente (Si ingresas un número no válido o 0, omitiras este campo) y separandolo por comas y/o espacios: ");
                            generos = lec.nextLine();
                    
                            
                            r.recomendaciones(actores,generos,directores);
                            r.muestraRecomendaciones();
                            break;
                default:
                            System.out.println("Opción no válida");
                            break;
            }
        }while(op!=0);

        lec.close();
        
    }

    
}
import java.util.Random;
import java.util.Scanner;

public class Agenda {
    //Declaración de constantes
    private final int CONTACTOS = 10;

    //Atributos
    private Contacto[] agenda;
    private int noContactos;

    public Agenda(){
        agenda = new Contacto[10];
        noContactos = 0;
    }

    public void agregaContacto(Contacto c){
        if(noContactos<CONTACTOS){
            agenda[noContactos] = c;
            noContactos++;
        }
    }

    public void mostrarContactos(){
        System.out.println("\nLos contactos son: \n");

        for(int i=0;i<CONTACTOS;i++){
            System.out.println(agenda[i].getNombreCompleto());
        }
    }

    public void infoContacto(String nombreCompleto){
        int aux=0;

        System.out.println();

        for(int i=0; i<CONTACTOS;i++){
            if(agenda[i].getNombreCompleto().equals(nombreCompleto)){
                System.out.println(agenda[i].datosObjeto());
                System.out.println();
                aux++;
            }
        }

        if(aux == 0){
            System.out.println("Contacto no encontrado");
        }

    }

    public void contactosPorTipo(String tipo){
        int aux = 0;

        System.out.println();
        for(int i=0; i<CONTACTOS;i++){
            if(agenda[i].getTipo().equals(tipo)){
                System.out.println(agenda[i].getNombreCompleto());
                aux++;
            }
        }

        if(aux == 0){
            System.out.println("No hay contactos de este tipo");
        }
    }

    public void contactosConIncial(char c){
        int aux = 0;

        for(int i=0; i<CONTACTOS;i++){
            if(agenda[i].getNombre().charAt(0) == c){
                System.out.println(agenda[i].getNombreCompleto());
                aux++;
            }
        }
        if(aux == 0){
            System.out.println("No hay contactos con esta inicial");
        }
    }
   
    public static void main(String[] args){
        Agenda a = new Agenda();
        Contacto c;
        Scanner lec = new Scanner(System.in);
        Random rand = new Random();
        int op = 1;
        String nomb;

        String[] nombres = {"Erik","Eduardo","Fernanda","Vianey","Ernesto","Daniel","Elizabeth"};
        String[] apP = {"Morales","Lopez","Hernandez","Juares","Omaña","Perez"};
        String[] apM = {"Ruiz","Cortes","Castañon","Lopez","Zamora","del Rio"};
        long[] telefono = {677210,212851,904538,410717,443800,596949,969666,232254,375671,925029};
        String[] tipo = {"Amigo","Familia","Compañero de trabajo","Escuela"}; 

        for(int i=0; i<10;i++){
            c = new Contacto(nombres[rand.nextInt(7)],apP[rand.nextInt(6)],apM[rand.nextInt(6)],telefono[rand.nextInt(10)]);
            c.setTipo(tipo[rand.nextInt(4)]);
            a.agregaContacto(c);
        }

        do{
            System.out.println("\nMenu");
            System.out.println("1. Mostrar todos los contactos");
            System.out.println("2. Mostrar la infromacion de un contacto");
            System.out.println("3. Consultar los contactos por tipos");
            System.out.println("4. Mostrar contactos con cierta inicial");
            System.out.println("0. Salir");
            
            System.out.print("Elige alguna opción mediante el número correspondiente: ");
            op = lec.nextInt();

            switch(op){
                case 0:
                            System.out.println("Saliendo");
                            break;
                case 1:
                            a.mostrarContactos();
                            break;
                case 2:
                            System.out.print("\nIngrese el nombre completo de la persona a buscar: ");
                            nomb = lec.nextLine();
                            nomb = lec.nextLine();
                            a.infoContacto(nomb);
                            break;
                case 3:
                            System.out.print("\nIngrese el tipo a buscar: ");
                            nomb = lec.nextLine();
                            nomb = lec.nextLine();
                            a.contactosPorTipo(nomb);
                            break;
                case 4:
                            System.out.print("\nIngrese la inicial: ");
                            nomb = lec.nextLine();
                            nomb = lec.nextLine();
                            a.contactosConIncial(nomb.charAt(0));
                            break;
                default:
                            System.out.println("\nOpción no valida\n");
                            break;
            }

        }while(op!=0);

        lec.close();

    }

    

    


}

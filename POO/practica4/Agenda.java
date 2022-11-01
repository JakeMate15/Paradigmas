public class Agenda {

    void mostrarContactos(Contacto[] agenda,int n){
        for(int i=0;i<n;i++){
            System.out.println(agenda[i].datosObjeto());
        }
    }    
    public static void main(String[] args){
        int aletorio;
        String[] nombres = {"Erik","Eduardo","Fernanda","Vianey"};
        String[] apP = {"Morales","Lopez","Hernandez","Juearez"};
        String[] apM = {"Ruiz","Cortes","Castañon","Lopez"};
        long[] telefono = {677210,212851,904538,410717,443800,596949,969666,232254,375671,925029};
        String[] tipo = {"Amigo","Familia","Compañero de trabajo","Escuela"}; 
        Contacto[] agenda = new Contacto[10];

        for(int i=0; i<10;i++){
            aletorio = (int)(Math.random()*3+1);
            agenda[i] = new Contacto(nombres[aletorio],apP[aletorio],apM[aletorio],telefono[aletorio]);
            agenda[i].setTipo(tipo[aletorio]);
        }



    }

    


}

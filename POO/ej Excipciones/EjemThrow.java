public class EjemThrow {
    public static void lanzaThrow(){
        try{
            NullPointerException e = new NullPointerException("Descripcion de la excepcion");//.fillInStackTrace();
            e.fillInStackTrace();
            throw e;
        }catch(NullPointerException e){
            System.out.println("Se captura por primera vez la excepcion...");
            throw e; // Se relanza la excepcion
        }
    }
    
    public static void main(String args[]){
        try{
            lanzaThrow();
        }catch(NullPointerException e){
            System.out.println("Se recaptura la excepcion: " + e);
        }
    }
}
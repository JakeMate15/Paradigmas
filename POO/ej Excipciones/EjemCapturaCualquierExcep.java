public class EjemCapturaCualquierExcep {
    public static void main (String[] args) {
        try {
            throw new Exception("lanzando la excepcion");
        }catch(Exception e){
            System.err.println("Excepcion capturada");
            System.err.println("e.getMessage(): " + e.getMessage());
            System.err.println("e.getLocalizedMessage():" + e.getLocalizedMessage());
            System.err.println("e.toString(): " + e);
            System.out.println("e.printStackTrace(): ");
            e.printStackTrace(System.err);
        }
    } 
}
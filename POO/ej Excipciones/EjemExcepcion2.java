public class EjemExcepcion2 {
    public static void main( String args[] ){
    
        int d = 0;
        int n = 4;
        int arreglo[] = new int[5];
        double resp = 0;
        
        try{
            resp = n/d;
            System.out.println("Instruccion despues de la excepcion");
            
            for(int i=0; i<7; i++){
                arreglo[i] = i;
            
            }
            
        }catch(ArithmeticException e){
            System.err.println("Excepcion aritmetica capturada...");
            d++;   
        }catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("Excepcion del arreglo capturada...");    
        }
            
        resp = n/d;
        System.out.println("El resultado es: " + resp);
    }
}

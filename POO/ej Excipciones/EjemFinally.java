public class EjemFinally{
    static void metodoA() throws IllegalAccessException{
        /*
         * Se lanza una exepcion exterior al metodo
         */
        try{
            System.out.println("Desde el metodo A...");
            throw new IllegalAccessException("Descripcion de la exepcion...");
        }finally{
            System.out.println("Bloque finally del metodo A...");
        }
    }

    /*
     * Se regresa el control explicitamente
     */

    static void metodoB(){
        try{
            System.out.println("Desde el metodo B...");
            return;
        }finally{
            System.out.println("Bloque finally del metodo B...");
        }
    }

    static void metodoC(){
        try{
            System.out.println("Desde el metodo C...");
        }finally{
            System.out.println("Bloque finally del metodo c...");
        }
    }

    public static void main(String args[]){
        try{
            metodoA();
        }catch(IllegalAccessException e){
            System.out.println("Capturando la exepcion del metodo a" + e);
        }

        metodoB();
        metodoC();
    }
}
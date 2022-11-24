public class Figura {
    private String nombre;
    private double area;
    private double perimetro;

    public Figura(){
        nombre = "Cuadrado";
        area = 100;
        perimetro = 40;
    }

    //Circulo
    public Figura(Punto p1, double radio){
        nombre = "Circulo";
        area = Math.PI * radio * radio;
        perimetro = Math.PI * 2.0 * radio;
    }

    //Rectangulo
    public Figura(Punto p1, Punto p2){
        double altura = Math.abs(p2.getCoordY()-p1.getCoordY());
        double ancho = Math.abs(p2.getCoordX()-p1.getCoordX());

        if(!colineales(p1,p2)){
            if(altura == ancho){
                nombre = "Cuadrado";
                area = ancho*ancho;
                perimetro = altura * 4;
            }
            else{
                nombre = "Rectangulo";
                area = altura*ancho;
                perimetro = 2*ancho + 2*altura;
            }
        }
        else{
            nombre = "Cuadrilatero sin puntos en esquina opuesta";
            area = 0;
            perimetro = 0;
        }    
    }
            
    //Triangulo
    public Figura(Punto p1, Punto p2, Punto p3){
        double a,b,c,area;
        
        area = colineales(p1, p2, p3);
        if(area > 0){
            nombre = "Triangulo";
            a = distPuntos(p1, p2);
            b = distPuntos(p2, p3);
            c = distPuntos(p3, p1);
            perimetro = a+b+c;
            this.area = area;
        }
        else{
            nombre = "Triángulo con sus tres puntos colineales";
            this.area = 0;
            perimetro = 0;
        }
    }

    private double distPuntos(Punto p1, Punto p2){
        double x1 = p1.getCoordX();
        double y1 = p1.getCoordY();
        double x2 = p2.getCoordX();
        double y2 = p2.getCoordY();

        return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
    }

    private double colineales(Punto p1, Punto p2, Punto p3){
        double x1,y1,x2,y2,x3,y3,colTest;

        x1 = p1.getCoordX();
        y1 = p1.getCoordY();
        x2 = p2.getCoordX();
        y2 = p2.getCoordY();
        x3 = p3.getCoordX();
        y3 = p3.getCoordY();

        colTest =   x1*(y2-y3) +
                    x2*(y3-y1) +
                    x3*(y1-y2);


        return Math.abs(colTest*0.5);
    }

    private boolean colineales(Punto p1, Punto p2){
        boolean res;
        double x1,y1,x2,y2;
        
        x1 = p1.getCoordX();
        y1 = p1.getCoordY();
        x2 = p2.getCoordX();
        y2 = p2.getCoordY();

        if((x1==x2) || (y1==y2))
            res = true;
        else
            res = false;
        
        return res;
    }

    public void imprimirInformacion(){
        System.out.println("Nombre: " + nombre + "\nÁrea: " + area + "\nPerimetro: " + perimetro);
    }
}

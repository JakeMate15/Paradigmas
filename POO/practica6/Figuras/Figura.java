import java.util.ArrayList;

public class Figura {
    private String nombre;
    private double area;
    private double perimetro;
    private ArrayList<Punto> puntos;

    //Rectangulo
    public Figura(Punto p1, Punto p2){
        ArrayList<Double> datos =  colineales(p1, p2);
        puntos = new ArrayList<Punto>();
        
        puntos.add(p1);
        puntos.add(p2);

        if(datos.get(0) == -1){
            nombre = "Cuadrilatero sin puntos en esquina opuesta";
            area = 0;
            perimetro = 0;
        }
        else{
            area = this.calculaArea();
            perimetro = this.calculaPerimetro();

            if(datos.get(0) == 0)   nombre = "Cuadrado";
            else    nombre = "Rectangulo";
        }   
    }
            
    //Triangulo
    public Figura(Punto p1, Punto p2, Punto p3){
        double area;
        puntos = new ArrayList<Punto>();

        puntos.add(p1);
        puntos.add(p2);
        puntos.add(p3);
        
        area = colineales(p1, p2, p3);
        if(area > 0){
            nombre = "Triangulo";
            this.area = this.calculaArea();
            perimetro = this.calculaPerimetro();
        }
        else{
            nombre = "Triángulo con sus tres puntos colineales";
            this.area = 0.0;
            perimetro = 0.0;
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

    private ArrayList<Double> colineales(Punto p1, Punto p2){
        double x1,y1,x2,y2,altura,ancho;
        ArrayList<Double> res = new ArrayList<Double>();
        
        x1 = p1.getCoordX();
        y1 = p1.getCoordY();
        x2 = p2.getCoordX();
        y2 = p2.getCoordY();
        altura = Math.abs(y2-y1);
        ancho = Math.abs(x2-x1);

        if((x1==x2) || (y1==y2)){
            res.add(-1.0);
        } 
        else{
            if(altura == ancho)  res.add(0.0);
            else    res.add(1.0);
        }  

        res.add(altura);
        res.add(ancho);
        
        return res;
    }

    public double calculaArea(){
        Punto p1, p2, p3;
        double area = 0.0;

        if(puntos.size() == 2){
            p1 = puntos.get(0);
            p2 = puntos.get(1);
            ArrayList<Double> datos = colineales(p1, p2);

            if(datos.get(0) == 0){
                area = datos.get(1) * datos.get(1);
            }
            else if(datos.get(0) == 1){
                area = datos.get(1) * datos.get(2); 
            } 
        }
        else{
            p1 = puntos.get(0);
            p2 = puntos.get(1);
            p3 = puntos.get(2);

            area = Math.abs(colineales(p1, p2, p3));
        }

        return area;
    }

    public double calculaPerimetro(){
        Punto p1, p2, p3;
        double perimetro = 0.0;

        if(puntos.size() == 2){
            p1 = puntos.get(0);
            p2 = puntos.get(1);
            ArrayList<Double> datos = colineales(p1, p2);

            if(datos.get(0) == 0){
                perimetro = datos.get(1) *4;
            }
            else if(datos.get(0) == 1){
                perimetro = datos.get(1)*2 + datos.get(2)*2; 
            } 
        }
        else{
            p1 = puntos.get(0);
            p2 = puntos.get(1);
            p3 = puntos.get(2);

            double a = distPuntos(p1, p2);
            double b = distPuntos(p2, p3);
            double c = distPuntos(p3, p1);

            perimetro = a+b+c;
        }

        return perimetro;
    }

    public void imprimirInformacion(){
        System.out.println("Nombre: " + nombre + "\nÁrea: " + area + "\nPerimetro: " + perimetro);
    }
}

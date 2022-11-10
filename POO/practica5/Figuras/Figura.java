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
            
    //Traingulo
    public Figura(Punto p1, Punto p2, Punto p3){
        double a = distPuntos(p1,p2);
        double b = distPuntos(p2, p3);
        double c = distPuntos(p3, p1);
        double p = (a+b+c)/2;

        nombre = "Triangulo";
        perimetro = a+b+c;
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    private double distPuntos(Punto p1, Punto p2){
        double x1 = p1.getCoordX();
        double y1 = p1.getCoordY();
        double x2 = p2.getCoordX();
        double y2 = p2.getCoordY();

        return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
    }

    public void imprimirInformacion(){
        System.out.println("Nombre: " + nombre + "\nÁrea: " + area + "\nPerimetro: " + perimetro);
    }
}

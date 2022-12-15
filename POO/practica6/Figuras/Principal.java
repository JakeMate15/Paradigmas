public class Principal {
    public static void main(String args[]){
        Figura[] figs = new Figura[6];
        Punto p1,p2,p3,p4,p5,p6,p7,p8;

        p1 = new Punto();
        p2 = new Punto(5.6,1.6);
        p3 = new Punto(8.9,7.2);
        p4 = new Punto(6.0,4.1);
        p5 = new Punto(12.6,14.8);
        p6 = new Punto();
        p7 = new Punto();
        p8 = new Punto(0.0,0.0);

        figs[0] = new Figura(p1,p8);
        figs[1] = new Figura(p1,p2);
        figs[2] = new Figura(p2,p3);
        figs[3] = new Figura(p4,p5,p1);
        figs[4] = new Figura(p1,p6);
        figs[5] = new Figura(p1,p6,p7);
        
        for(int i=0; i<figs.length;i++){
            figs[i].imprimirInformacion();
            System.out.println(); 
        }
    }
}
public class Punto {
    private double coordX, coordY;

    public Punto(){
        coordX = 10.0;
        coordY = 10.0;
    }

    public Punto(double x, double y){
        coordX = x;
        coordY = y;
    }


    public double getCoordX() {
        return this.coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return this.coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

}

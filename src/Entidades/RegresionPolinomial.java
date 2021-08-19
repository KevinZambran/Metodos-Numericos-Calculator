
package Entidades;

public class RegresionPolinomial {
    private double x;
    private double y;
    private double x2;
    private double x3;
    private double x4;
    private double xy;
    private double x2y;
    private double yY2;
    private double ecuacion;
    private double pronosticoY;
    private double residuos;   

    public RegresionPolinomial() {
    }
    
    public RegresionPolinomial(double x, double y, double x2, double x3, double x4, double xy, double x2y, double yY2, double ecuacion, double pronosticoY, double residuos) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.xy = xy;
        this.x2y = x2y;
        this.yY2 = yY2;
        this.ecuacion = ecuacion;
        this.pronosticoY = pronosticoY;
        this.residuos = residuos;
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getX4() {
        return x4;
    }

    public void setX4(double x4) {
        this.x4 = x4;
    }

    public double getXy() {
        return xy;
    }

    public void setXy(double xy) {
        this.xy = xy;
    }

    public double getX2y() {
        return x2y;
    }

    public void setX2y(double x2y) {
        this.x2y = x2y;
    }

    public double getyY2() {
        return yY2;
    }

    public void setyY2(double yY2) {
        this.yY2 = yY2;
    }

    public double getEcuacion() {
        return ecuacion;
    }

    public void setEcuacion(double ecuacion) {
        this.ecuacion = ecuacion;
    }

    public double getPronosticoY() {
        return pronosticoY;
    }

    public void setPronosticoY(double pronosticoY) {
        this.pronosticoY = pronosticoY;
    }

    public double getResiduos() {
        return residuos;
    }

    public void setResiduos(double residuos) {
        this.residuos = residuos;
    }
    public String [] VisualizarRegresionP()
    {
        String [] E = {String.valueOf(x), String.valueOf(y),String.valueOf(x2),String.valueOf(x3),String.valueOf(x4),String.valueOf(xy),String.valueOf(x2y), String.valueOf(yY2),String.valueOf(ecuacion),String.valueOf(pronosticoY), String.valueOf(residuos)};
        return E;
    }
}

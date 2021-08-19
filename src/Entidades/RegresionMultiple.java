package Entidades;

public class RegresionMultiple {
    private double x1;
    private double x2;
    private double y;
    private double expx1;
    private double expx2;
    private double x1x2;
    private double x1y;
    private double x2y;
    private double yY2;
    private double ecuacion;
    private double pronosticoY;
    private double residuos;

    public RegresionMultiple() {
    }

    public RegresionMultiple(double x1, double x2, double y, double expx1, double expx2, double x1x2, double x1y, double x2y, double yY2, double ecuacion, double pronosticoY, double residuos) {
        this.x1 = x1;
        this.x2 = x2;
        this.y = y;
        this.expx1 = expx1;
        this.expx2 = expx2;
        this.x1x2 = x1x2;
        this.x1y = x1y;
        this.x2y = x2y;
        this.yY2 = yY2;
        this.ecuacion = ecuacion;
        this.pronosticoY = pronosticoY;
        this.residuos = residuos;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getExpx1() {
        return expx1;
    }

    public void setExpx1(double expx1) {
        this.expx1 = expx1;
    }

    public double getExpx2() {
        return expx2;
    }

    public void setExpx2(double expx2) {
        this.expx2 = expx2;
    }

    public double getX1x2() {
        return x1x2;
    }

    public void setX1x2(double x1x2) {
        this.x1x2 = x1x2;
    }

    public double getX1y() {
        return x1y;
    }

    public void setX1y(double x1y) {
        this.x1y = x1y;
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
    public String [] VisualizarRegresionM()
    {
        String [] E = {String.valueOf(x1),String.valueOf(x2), String.valueOf(y),String.valueOf(expx1)
                ,String.valueOf(expx2),String.valueOf(x1x2),String.valueOf(x1y),String.valueOf(x2y)
                ,String.valueOf(yY2),String.valueOf(ecuacion),String.valueOf(pronosticoY), String.valueOf(residuos)};
        return E;
    }
}

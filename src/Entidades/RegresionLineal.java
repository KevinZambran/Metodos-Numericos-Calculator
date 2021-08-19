package Entidades;

/**
 *
 * @author PERSONAL
 */
public class RegresionLineal {
    private double x;
    private double y;
    private double x2;
    private double xy;
    private double yY2;
    private double ecuacion;
    private double pronosticoY;
    private double residuos;
    
    public RegresionLineal() {}
    
    public RegresionLineal(double x, double y, double x2, double xy, double yY2, double ecuacion, double pronosticoY,
			double residuos) {
		super();
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.xy = xy;
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
	public double getXy() {
		return xy;
	}
	public void setXy(double xy) {
		this.xy = xy;
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
        
        public String [] VisualizarRegresion()
        {
            String [] E = {String.valueOf(x), String.valueOf(y),String.valueOf(x2),String.valueOf(xy), String.valueOf(yY2),String.valueOf(ecuacion),String.valueOf(pronosticoY), String.valueOf(residuos)};
            return E;
        }
}

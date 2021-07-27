package Algoritmos;

/**
 * GRUPO 5
 * @author Xavier Cabrera
 * @author Leonardo Sanchez
 * @author Oscar Nieves
 * @author Kevin Zambrano 
 * 
 * */

public class Biseccion { 
    
    public Biseccion(){}
        
	public double et(double vv, double xr) {
		return (Math.abs(vv-xr)/vv) * 100;		
	}
	public double ea(double xr0, double xr) {		
		return (Math.abs(xr0 - xr)/xr0) * 100;	
	}
	
	public double fun(String fun, double x) {
            EvaluadorFunciones ef = new EvaluadorFunciones();
            double resul =0;
            ef.setFuncion(fun);
            ef.setX(x);
            ef.Evaluar();
            resul = ef.getResultado();
            System.err.println(ef.getError());
            return resul;
	}
}



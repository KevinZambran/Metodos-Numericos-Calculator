
package Algoritmos;

import java.util.Scanner;


/**
 *
 * @author PERSONAL
 */
public class Newton_Raphson {
    
    public static String derivar(String funcion) {
        Derivadas dv = new Derivadas();        
        dv.setDerivadas(funcion);
        dv.Derivar();
        return dv.getDerivadas();		
    }
    
    public static double evaluar(String funcion, double x) {
        //Evaluar
        EvaluadorFunciones ef = new EvaluadorFunciones();
        ef.setFuncion(funcion);
        ef.setX(x);
        ef.Evaluar();
        return ef.getResultado();
    }
    
    public static double et(double vv, double x) {
        return (Math.abs(vv-x)/vv) * 100;		
    }
    public static double ea(double xr0, double xr) {		
        return (Math.abs(xr0 - xr)/xr0) * 100;	
    }
    
}

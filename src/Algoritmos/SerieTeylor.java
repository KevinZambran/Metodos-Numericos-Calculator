
package Algoritmos;

/**
 *
 * @author PERSONAL
 */
public  class SerieTeylor {   

    public SerieTeylor() {
    }   
    //funcion evaluada en f(x0)
    public double fx0(String fun, double x0){
        EvaluadorFunciones ef = new EvaluadorFunciones();
        ef.setFuncion(fun);
        ef.setX(x0);
        ef.Evaluar();
        return ef.getResultado();
    }
    
    //Funcion para calcular el termino (n + 1)
    public double termino(int i, String fun, double x0, int h){
        EvaluadorFunciones ef = new EvaluadorFunciones();
        double resul =0;
        if(i==0){
            ef.setFuncion(fun);
            ef.setX(x0);
            ef.Evaluar();
            resul = ef.getResultado();
        }else{
            ef.setFuncion(fun);
            ef.setX(x0);
            ef.Evaluar();
            resul = (ef.getResultado()*Math.pow(h, i))/ factorial(i);
        }
        return resul;
    }
    
    public Double OrdenN(int i, String fun, double x0, double term, double ordenanterior){
        EvaluadorFunciones ef = new EvaluadorFunciones();
        double resul =0;
        if(i==0){
            ef.setFuncion(fun);
            ef.setX(x0);
            ef.Evaluar();
            resul = ef.getResultado();
        }else{
            resul = term + ordenanterior;
        }
        return resul;
    }
    
    
    public double et(double vv, double x) {
        return (Math.abs(vv-x)/vv) * 100;		
    }
    public double ea(double xr0, double xr) {		
        return (Math.abs(xr0 - xr)/xr0) * 100;	
    }
        
    //Metodo para calcular la derivada
    public String derivar(String funcion) {
        Derivadas dv = new Derivadas();        
        dv.setDerivadas(funcion);
        dv.Derivar();
        return dv.getDerivadas();		
    }
	
    //Metodo para calcular el factorial
    public int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
}

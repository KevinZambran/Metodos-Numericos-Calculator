
package Algoritmos;

import Controlador.TLista;
import javax.swing.table.DefaultTableModel;

public  class SerieTeylor {   

    public SerieTeylor() {
    }   
    
    public static DefaultTableModel Teylor(int i,String fun, double Es, double x0,double h){

        double aprox=0,errorAproximado;
        EvaluadorFunciones ef = new EvaluadorFunciones();
        
        DefaultTableModel dtm;
        String titulos [] = {"Iteracion", "Derivada","Termino (n+1)","Aproximación orden n","Error Aproximado"};
        dtm = new DefaultTableModel(null,titulos);
        
        try{
            do{
                if(i==0){
                    
                    double fx0= evaluacionfx0(fun, x0);
                    
                    double term = termino(i, fun, x0, h);
                    
                    aprox= OrdenN(i, fun, x0, 0, 0);
                    
                    errorAproximado = 0;
                    
                    dtm.addRow(TLista.MostrarSerieTaylor(i, fx0, term, aprox, errorAproximado));
                    
                    errorAproximado = 1;
                    i++;
                }else{
                    fun = derivar(fun);
                    
                    double aproxanterior = aprox;
                    
                    double fx0= evaluacionfx0(fun, x0);
                    
                    double term = termino(i, fun, x0, h);
                    
                    aprox= OrdenN(i, fun, x0, term, aprox);
                    
                    errorAproximado = errorAproximado(aprox,aproxanterior);
                    
                    dtm.addRow(TLista.MostrarSerieTaylor(i, fx0, term, aprox, errorAproximado));
                    
                    ++i;
                }
            }while(errorAproximado > Es);
        }catch(Exception ex){
            System.out.println(ef.getError());
        }
        return dtm;
    }
    
    public static double evaluacionfx0(String fun, double x0){
        EvaluadorFunciones ef = new EvaluadorFunciones();
        ef.setFuncion(fun);
        ef.setX(x0);
        ef.Evaluar();
        return ef.getResultado();
    }
    
    
    public static double termino(int i, String fun, double x0, double h){
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
    
    public static Double OrdenN(int i, String fun, double x0, double term, double ordenanterior){
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
    
    
    public static double errorTrue(double vv, double x) {
        return (Math.abs(vv-x)/vv) * 100;		
    }
    public static double errorAproximado(double xr0, double xr) {		
        return (Math.abs(xr0 - xr)/xr0) * 100;	
    }
        
    public static String derivar(String funcion) {
        Derivadas dv = new Derivadas();        
        dv.setDerivadas(funcion);
        dv.Derivar();
        return dv.getDerivadas();		
    }
	
    
    public static  int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}

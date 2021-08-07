
package Algoritmos;

import Controlador.TLista;
import javax.swing.table.DefaultTableModel;

/**
 * GRUPO 5
 * @author Xavier Cabrera
 * @author Leonardo Sanchez
 * @author Oscar Nieves
 * @author Kevin Zambrano 
 * 
 * */

public class FalsaPosicion {   
    
    public static DefaultTableModel FalsaPosicion(int i, String fun, double Es, double xl, double xu){
        double inter, xr =0, fxl,fxu, fxr, fxlfxr =0, ea =0, auxr;
        DefaultTableModel dtm;
        String titulos [] = {"Iteraccion", "Intervalo","xl","xu","Raiz","f(xl)","f(xu)", "f(Raiz)","f(xl)*f(Raiz)", "Error Aproximado"};            
        dtm = new DefaultTableModel(null,titulos);
        try{
            do {
                if(i==1) {
                    
                inter = xu-xl;
                
                fxl= funcionEvaluada(fun, xl);
                
                fxu= funcionEvaluada(fun, xu); 
                
                xr= xu - (fxu*(xl-xu))/(fxl-fxu);
                
                fxr= funcionEvaluada(fun, xr);
                
                fxlfxr= fxl* fxr;
                
                dtm.addRow(TLista.MostrarFalsaPosicion(i,inter,xl,xu,xr,fxl,fxu,fxr,fxlfxr,ea));
                ea=1;
                ++i;
            }else {			

                    
                if(fxlfxr>0) {
                   xl = xr;
                }
                
                if(fxlfxr<0) {
                    xu = xr;
                }
                
                auxr= xr;
                
                inter = xu-xl;
                
                fxl= funcionEvaluada(fun, xl);
                
                fxu= funcionEvaluada(fun, xu);
                
                xr= xu - (fxu*(xl-xu))/(fxl-fxu);
                
                fxr= funcionEvaluada(fun, xr);
                
                fxlfxr= fxl* fxr;
                
                ea = errorAproximado(xr,auxr);
                
                dtm.addRow(TLista.MostrarFalsaPosicion(i,inter,xl,xu,xr,fxl,fxu,fxr,fxlfxr,ea));
                
                ++i;
            }
            }while(ea > Es);
        }catch(Exception ex){
            System.out.println(ex.getLocalizedMessage());
        }
        return dtm;
    }
    
    public static double errortrue(double vv, double xr) {
        return (Math.abs(vv-xr)/vv) * 100;		
    }
    public static double errorAproximado(double xr0, double xr) {		
            return (Math.abs(xr0 - xr)/xr0) * 100;	
    }

    public static double funcionEvaluada(String fun, double x) {
        EvaluadorFunciones ef = new EvaluadorFunciones();
        double resul;
        ef.setFuncion(fun);
        ef.setX(x);
        ef.Evaluar();
        resul = ef.getResultado();
        System.err.println(ef.getError());
        return resul;
    }
    
    
    
    
}

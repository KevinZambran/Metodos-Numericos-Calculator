
package Algoritmos;

import Controlador.TLista;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PERSONAL
 */
public class IteracionPuntoFijo {
    
    public static DefaultTableModel PuntoFijo(int i, String fun, double es, double x1){
        double  fx, ea, aux;
        
        DefaultTableModel dtm;
        String titulos [] = {"Iteraccion", "Raiz","f(x)", "Error Aproximado"};  
        dtm = new DefaultTableModel(null,titulos);
        
        try{
            do{
                if(i == 0){                    
                    dtm.addRow(TLista.MostrarPuntoFijo(i, x1, 0, 0));                    
                    ea= 1;
                    i++;
                }else{ 
                    aux = x1;
                   
                    fx = evaluacionFuncion(fun, x1);
                    
                    x1= fx;
                    
                    ea= errorAproximado(x1, aux);
                    
                    dtm.addRow(TLista.MostrarPuntoFijo(i, x1, fx, ea));
                    i++;
                }
            }while(ea > es);
        }catch(Exception ex){
            System.out.println(ex.getLocalizedMessage());
        }
        return dtm;
    }
    
    public static double evaluacionFuncion(String fun, double x0){
        EvaluadorFunciones ef = new EvaluadorFunciones();
        ef.setFuncion(fun);
        ef.setX(x0);
        ef.Evaluar();
        return ef.getResultado();
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
}

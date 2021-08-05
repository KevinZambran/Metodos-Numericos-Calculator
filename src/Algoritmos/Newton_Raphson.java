
package Algoritmos;

import Controlador.TLista;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author PERSONAL
 */
public class Newton_Raphson {
    
    public static DefaultTableModel NewtonRaphson(int i,String n, String fun, double es, double x0, double vv){
        double x1 =0, fx,dxfx, ea, et, aux;
        String cond, dfx;
        
        DefaultTableModel dtm;
        String titulos [] = {"Iteraccion", "Xi+1","f(xi)","f'(xi)", "Ea", "Et", "Condicion"};  
        dtm = new DefaultTableModel(null,titulos);
        
        try{
            do{
                if(i == 0){
                    x1 = x0;
                    
                    dtm.addRow(TLista.MostrarNewtonRaphson(i,x1, 0, 0, 0, 0, ""));
                    
                    ea= 1;
                    i++;
                }else{                
                    fx = evaluacionFuncion(fun, x1);
                    
                    dfx = derivar(fun);
                    
                    dxfx = evaluacionFuncion(dfx, x1);
                    
                    aux = x1;
                    
                    x1 = x1 - fx / dxfx;
                    
                    ea= errorAproximado(x1, aux);
                    
                    et = errorTrue(vv, x1);
                    
                    if(ea<es){
                            cond = "ALTO";                      
                        }else{
                            cond = "SIGA";                         
                    } 
                    dtm.addRow(TLista.MostrarNewtonRaphson(i, x1, fx, dxfx, ea, et, cond));
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

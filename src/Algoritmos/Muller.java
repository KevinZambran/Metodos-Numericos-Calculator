
package Algoritmos;

import Controlador.TLista;
import javax.swing.table.DefaultTableModel;


public class Muller {
    
    public static DefaultTableModel Muller(int i, String n, String fun, double es, double x0,double x1, double x2, double vv){
        double x3 =0, ea , fx0,fx1,fx2, h0, h1, delta0, delta1, a, b ,c, sigmas, signeg;
        String cond;
        
        DefaultTableModel dtm;
        String titulos [] = {"Iteraccion", "X0","x1", "x2","fx0", "fx1", "fx2", "h0", "h1", "Delta 0",
                "Delta 1", "a", "b", "c", "Signo+", "Signo-","x3", "Ea", "Condicion"};    
        dtm = new DefaultTableModel(null,titulos);
        
        try{
            do{
                if(i == 1){
                    fx0= evaluarFuncion(fun, x0);
                    fx1= evaluarFuncion(fun, x1);
                    fx2= evaluarFuncion(fun, x2);
                    h0= x1 -x0;
                    h1= x2 - x1;
                    delta0= (fx1 - fx0) / h0;
                    delta1= (fx2 - fx1) / h1;
                    a = (delta1 - delta0)/(h1+h0);
                    b = a * h1 + delta1;
                    c = fx2;
                    sigmas = b + Math.sqrt(Math.pow(b, 2) - 4*a*c);
                    signeg = b - Math.sqrt(Math.pow(b, 2) - 4*a*c);
                    if(Math.abs(sigmas) > Math.abs(signeg)){
                        x3 = x2 + (-2*c)/sigmas;
                    }else{
                        x3 = x2 + (-2*c)/signeg;
                    }
                    ea = errorAproximado(x3, x2);    
                    if(ea<es){
                            cond = "ALTO";                      
                        }else{
                            cond = "SIGA";                         
                    }
                    dtm.addRow(TLista.MostrarMuller(i, x0, x1, x2, fx0, fx1, fx2, h0, h1, delta0, delta1, a, b, c, sigmas, signeg, x3, ea, cond));
                    i++;
                }else{ 
                    x0 = x1;
                    x1 = x2;
                    x2 = x3;
                    fx0= evaluarFuncion(fun, x0);
                    fx1= evaluarFuncion(fun, x1);
                    fx2= evaluarFuncion(fun, x2);
                    h0= x1 -x0;
                    h1= x2 - x1;
                    delta0= (fx1 - fx0) / h0;
                    delta1= (fx2 - fx1) / h1;
                    a = (delta1 - delta0)/(h1+h0);
                    b = a * h1 + delta1;
                    c = fx2;
                    sigmas = b + Math.sqrt(Math.pow(b, 2) - 4*a*c);
                    signeg = b - Math.sqrt(Math.pow(b, 2) - 4*a*c);
                    if(Math.abs(sigmas) > Math.abs(signeg)){
                        x3 = x2 + (-2*c)/sigmas;
                    }else{
                        x3 = x2 + (-2*c)/signeg;
                    }
                    ea = errorAproximado(x3, x2);                   
                    if(ea<es){
                            cond = "ALTO";                      
                        }else{
                            cond = "SIGA";                         
                    } 
                    dtm.addRow(TLista.MostrarMuller(i,x0, x1, x2, fx0, fx1, fx2, h0, h1, delta0, delta1, a, b, c, sigmas, signeg, x3, ea, cond));
                    i++;
                }
            }while(ea > es);
        }catch(Exception ex){
            System.out.println(ex.getLocalizedMessage());
        }
        return dtm;
    }
    
    
     public static String derivarFuncion(String funcion) {
        Derivadas dv = new Derivadas();        
        dv.setDerivadas(funcion);
        dv.Derivar();
        return dv.getDerivadas();		
    }
    
    public static double evaluarFuncion(String funcion, double x) {
        //Evaluar
        EvaluadorFunciones ef = new EvaluadorFunciones();
        ef.setFuncion(funcion);
        ef.setX(x);
        ef.Evaluar();
        return ef.getResultado();
    }
    
    public static double errorTrue(double vv, double x) {
        return (Math.abs(vv-x)/vv) * 100;		
    }
    
    public static double errorAproximado(double xr0, double xr) {		
        return (Math.abs(xr0 - xr)/xr0) * 100;	
    }
}

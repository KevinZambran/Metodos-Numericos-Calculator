
package Algoritmos;

import Controlador.TLista;
import javax.swing.table.DefaultTableModel;


public class Secante {

    public static DefaultTableModel Secante(int it, String fun, double es, double x0, double x1){
        double fx0, fx1,ea,aux;
        DefaultTableModel dtm;
        String titulos [] = {"Iteraccion", "Raiz" , "f(Xi-1)","f(Xi)", "Error Aproximado"};    
        dtm = new DefaultTableModel(null,titulos);
        
        try{
            do{
                if(it < 1){

                    if(it == -1){
                       dtm.addRow(TLista.MostrarSecante(it, x0, 0, 0, 0));
                    }
                    if(it == 0){
                        ea= errorAproximado(x1, x0);

                        dtm.addRow(TLista.MostrarSecante(it, x1, 0, 0, ea));
                    }
                    ea= 1;
                    it++;
                }else{ 
                    aux = x1;

                    fx0 = evaluar(fun, x0);

                    fx1 = evaluar(fun, x1); 

                    x1= x1-(fx1*(x0-x1))/(fx0-fx1);

                    x0 = aux;

                    ea= errorAproximado(x1, aux);

                    dtm.addRow(TLista.MostrarSecante(it, x1, fx0, fx1, ea));                

                    it++;
                }
            }while(ea > es);
        }catch(Exception ex){
           System.out.println(ex.getLocalizedMessage());
        }
        return dtm;
    }
    
    public static String derivar(String funcion) {
        Derivadas dv = new Derivadas();        
        dv.setDerivadas(funcion);
        dv.Derivar();
        return dv.getDerivadas();		
    }
    
    public static double evaluar(String funcion, double x) {
        
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

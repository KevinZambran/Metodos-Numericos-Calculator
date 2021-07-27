
package Controlador;

import Algoritmos.SerieTeylor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author PERSONAL
 */
public class TLista {
    
    public static String [] MostrarSerieTaylor (int it, String n,double fx0, double term, double aproximacion,double ea,String cond,double et)
    {
        String[] registro = new String[7];
        n = "%." + n + "e";        
            registro[0] = String.valueOf(it);
            registro[1] = String.valueOf(fx0);
            registro[2] = String.format(n ,term);
            registro[3] = String.format(n ,aproximacion);
            registro[4] = String.format(n , ea)+"%";
            registro[5] = cond;
            registro[6] = String.format(n , et)+"%";  
        return registro;
    }

    public static String [] MostrarBiseccion(int ite, String n, double inter, double xl, double xu, 
               double xr, double fxl, double fxu, double fxr, double fxlfxr,double ea, String cond) {

        String[] registro = new String[11];
        n = "%." + n + "e";
        registro[0] = String.valueOf(ite);
        registro[1] = String.valueOf(inter);
        registro[2] = String.format(n ,xl);
        registro[3] = String.format(n ,xu);
        registro[4] = String.format(n ,xr);
        registro[5] = String.format(n ,fxl);
        registro[6] = String.format(n ,fxu);
        registro[7] = String.format(n ,fxr);
        registro[8] = String.format(n ,fxlfxr);
        registro[9] = String.format(n ,ea)+"%";
        registro[10] = cond;                 
        return registro;
    }
   
    public static String [] MostrarNewtonRaphson(int it, String n, double x1, double fxl, double dfx1,double ea,double et, String cond) {

        String[] registro = new String[7];
        n = "%." + n + "e";
        registro[0] = String.valueOf(it);
        registro[1] = String.format(n ,x1);
        registro[2] = String.format(n ,fxl);
        registro[3] = String.format(n ,dfx1);
        registro[4] = String.format(n ,ea)+"%";
        registro[5] = String.format(n ,et)+"%";
        registro[6] = cond;                 
        return registro;
    }
    
    public static String [] MostrarSecante(int it, String n, double x1, double fx0, double fx1,double ea,double et, String cond) {

        String[] registro = new String[7];
        n = "%." + n + "e";
        registro[0] = String.valueOf(it);
        registro[1] = String.format(n ,x1);
        registro[2] = String.format(n ,fx0);
        registro[3] = String.format(n ,fx1);
        registro[4] = String.format(n ,ea)+"%";
        registro[5] = String.format(n ,et)+"%";
        registro[6] = cond;                 
        return registro;
    }
    
    public static String [] MostrarPuntoFijo(int it, String n, double x1, double dxi,double ea,double et, String cond) {

        String[] registro = new String[6];
        n = "%." + n + "e";
        registro[0] = String.valueOf(it);
        registro[1] = String.format(n ,x1);
        registro[2] = String.format(n ,dxi);
        registro[3] = String.format(n ,ea)+"%";
        registro[4] = String.format(n ,et)+"%";
        registro[5] = cond;                
        return registro;
    }
    public static String [] MostrarMuller(int it, String n, double x0, double x1, double x2, double fx0, double fx1, double fx2,
            double h0, double h1, double delta0, double delta1, double a, double b, double c, double sigmas, double signeg, double x3,double ea,String cond) {

        String[] registro = new String[19];
        n = "%." + n + "e";
        registro[0] = String.valueOf(it);
        registro[1] = String.format(n ,x0);
        registro[2] = String.format(n ,x1);
        registro[3] = String.format(n ,x2);
        registro[4] = String.format(n ,fx0);
        registro[5] = String.format(n ,fx1);
        registro[6] = String.format(n ,fx2);
        registro[7] = String.format(n ,h0);
        registro[8] = String.format(n ,h1);
        registro[9] = String.format(n ,delta0);
        registro[10] = String.format(n ,delta1);
        registro[11] = String.format(n ,a);
        registro[12] = String.format(n ,b);
        registro[13] = String.format(n ,c);
        registro[14] = String.format(n ,sigmas);
        registro[15] = String.format(n ,signeg);
        registro[16] = String.format(n ,x3);
        registro[17] = String.format(n ,ea)+"%";
        registro[18] = cond;                
        return registro;
    }
    public static String [] MostrarFalsaPosicion(int ite, String n, double inter, double xl, double xu, 
               double xr, double fxl, double fxu, double fxr, double fxlfxr,double ea, String cond) {

        String[] registro = new String[11];
        n = "%." + n + "e";
        registro[0] = String.valueOf(ite);
        registro[1] = String.valueOf(inter);
        registro[2] = String.format(n ,xl);
        registro[3] = String.format(n ,xu);
        registro[4] = String.format(n ,xr);
        registro[5] = String.format(n ,fxl);
        registro[6] = String.format(n ,fxu);
        registro[7] = String.format(n ,fxr);
        registro[8] = String.format(n ,fxlfxr);
        registro[9] = String.format(n ,ea)+"%";
        registro[10] = cond;                 
        return registro;
    }
}

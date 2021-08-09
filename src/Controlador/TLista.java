
package Controlador;


public class TLista {
    
    public static String [] MostrarSerieTaylor (int it, double fx0, double term, double aproximacion,double ea)
    {
        String[] registro = new String[5];       
            registro[0] = String.valueOf(it);
            registro[1] = String.valueOf(fx0);
            registro[2] = String.valueOf(term);
            registro[3] = String.valueOf(aproximacion);
            registro[4] = String.valueOf(ea)+"%";
        return registro;
    }

    public static String [] MostrarBiseccion(int ite, double inter, double xl, double xu, 
               double xr, double fxl, double fxu, double fxr, double fxlfxr,double ea) {

        String[] registro = new String[10];
        registro[0] = String.valueOf(ite);
        registro[1] = String.valueOf(inter);
        registro[2] = String.valueOf(xl);
        registro[3] = String.valueOf(xu);
        registro[4] = String.valueOf(xr);
        registro[5] = String.valueOf(fxl);
        registro[6] = String.valueOf(fxu);
        registro[7] = String.valueOf(fxr);
        registro[8] = String.valueOf(fxlfxr);
        registro[9] = String.valueOf(ea)+"%";
        
        return registro;
    }
   
    public static String [] MostrarNewtonRaphson(int it, double x1, double fxl, double dfx1,double ea) {

        String[] registro = new String[5];
        registro[0] = String.valueOf(it);
        registro[1] = String.valueOf(x1);
        registro[2] = String.valueOf(fxl);
        registro[3] = String.valueOf(dfx1);
        registro[4] = String.valueOf(ea)+"%";
        return registro;
    }
    
    public static String [] MostrarSecante(int it, double x1, double fx0, double fx1,double ea) {

        String[] registro = new String[5];
        registro[0] = String.valueOf(it);
        registro[1] = String.valueOf(x1);
        registro[2] = String.valueOf(fx0);
        registro[3] = String.valueOf(fx1);
        registro[4] = String.valueOf(ea)+"%";         
        return registro;
    }
    
    public static String [] MostrarPuntoFijo(int it, double x1, double dxi,double ea) {

        String[] registro = new String[4];
        registro[0] = String.valueOf(it);
        registro[1] = String.valueOf(x1);
        registro[2] = String.valueOf(dxi);
        registro[3] = String.valueOf(ea)+"%";         
        return registro;
    }
    public static String [] MostrarMuller(int it, double fx0, double fx1, double fx2,
            double delta0, double delta1, double x3,double ea) {

        String[] registro = new String[8];
        registro[0] = String.valueOf(it);
        registro[1] = String.valueOf(fx0);
        registro[2] = String.valueOf(fx1);
        registro[3] = String.valueOf(fx2);
        registro[4] = String.valueOf(delta0);
        registro[5] = String.valueOf(delta1);
        registro[6] = String.valueOf(x3);
        registro[7] = String.valueOf(ea)+"%";           
        return registro;
    }
    public static String [] MostrarFalsaPosicion(int ite, double inter, double xl, double xu, 
               double xr, double fxl, double fxu, double fxr, double fxlfxr,double ea) {

        String[] registro = new String[10];
        registro[0] = String.valueOf(ite);
        registro[1] = String.valueOf(inter);
        registro[2] = String.valueOf(xl);
        registro[3] = String.valueOf(xu);
        registro[4] = String.valueOf(xr);
        registro[5] = String.valueOf(fxl);
        registro[6] = String.valueOf(fxu);
        registro[7] = String.valueOf(fxr);
        registro[8] = String.valueOf(fxlfxr);
        registro[9] = String.valueOf(ea)+"%";
        
        return registro;
    }
    
    public static String [] MostrarBairstown(int ite, double r, double s, double Ear, 
               double Eas, double disc, String tipo, String x1, String x2) {

        String[] registro = new String[9];
        registro[0] = String.valueOf(ite);
        registro[1] = String.valueOf(r);
        registro[2] = String.valueOf(s);
        registro[3] = String.valueOf(Ear);
        registro[4] = String.valueOf(Eas);
        registro[5] = String.valueOf(disc);
        registro[6] = String.valueOf(tipo);
        registro[7] = x1;
        registro[8] = x2;   
        return registro;
    }
    
    public static String [] MostrarRegresion(double x, double y, double x2, double xy, double yY2, 
               double ecuacion, double PronosticoY,double Residuos) {

        String[] registro = new String[8];
        registro[0] = String.valueOf(x);
        registro[1] = String.valueOf(y);
        registro[2] = String.valueOf(x2);
        registro[3] = String.valueOf(xy);
        registro[4] = String.valueOf(yY2);
        registro[5] = String.valueOf(ecuacion);
        registro[6] = String.valueOf(PronosticoY);
        registro[7] = String.valueOf(Residuos);   
        return registro;
    }
    
    public static String [] MostrarMullerf(int it, double x0, double x1, double x2, double fx0, double fx1, double fx2, double h0, double h1, double delta0, double delta1, double a, double b, double c,
            double sigmas, double signeg, double x3,double ea) {

        String[] registro = new String[18];
        registro[0] = String.valueOf(it);
        registro[1] = String.valueOf(x0);
        registro[2] = String.valueOf(x1);
        registro[3] = String.valueOf(x2);
        registro[4] = String.valueOf(fx0);
        registro[5] = String.valueOf(fx1);
        registro[6] = String.valueOf(fx2);
        registro[7] = String.valueOf(h0);
        registro[8] = String.valueOf(h1);
        registro[9] = String.valueOf(delta0);
        registro[10] = String.valueOf(delta1);
        registro[11] = String.valueOf(a);
        registro[12] = String.valueOf(b);
        registro[13] = String.valueOf(c);
        registro[14] = String.valueOf(sigmas);
        registro[15] = String.valueOf(signeg);
        registro[16] = String.valueOf(x3);
        registro[17] = String.valueOf(ea)+"%";             
        return registro;
    }
    
}

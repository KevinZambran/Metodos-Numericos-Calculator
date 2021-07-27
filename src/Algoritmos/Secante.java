
package Algoritmos;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class Secante {

    public static void Secante(int it, String fun, double vv, double es, double x0, double x1){
        double fx0= 0;
        double fx1 = 0;
        double ea = 0;
        double et = 0;
        double aux = 0;
        do{
            if(it < 1){
                
                if(it == -1){
                    Imprimir(it, x0, 0, 0, 0, 0);
                }
                if(it == 0){
                    ea= ea(x1, x0);
                    et = et(vv, x1);
                    Imprimir(it, x1, 0, 0, ea, et);
                }
                ea= 1;
                it++;
            }else{ 
                aux = x1;
                fx0 = evaluar(fun, x0);
                fx1 = evaluar(fun, x1);                 
                x1= x1-(fx1*(x0-x1))/(fx0-fx1);
                x0 = aux;
                ea= ea(x1, aux);
                et = et(vv, x1);
                Imprimir(it, x1, fx0, fx1, ea, et);
                if(ea < es){
                    System.out.println("ALTO");
                }else{
                    System.out.println("SIGA");
                }
                it++;
            }
        }while(ea > es);
    }
     //e^(-x)-x
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
    
    public static void Imprimir(int i,double x1, double fx, double fx0, double ea, double et ){
        System.out.println("********************************");
        System.out.println("Iteracion : " + i);
        System.out.println("xi+1 : " + x1);
        System.out.println("f(xi-1)=e^(-xi-1)-xi-1 : " + fx);
        System.out.println("f(xi)=e^(-xi)-xi : " + fx0);
        System.out.println("|Ea1 : " + ea);
        System.out.println("|Et| : " + et);
    }
}

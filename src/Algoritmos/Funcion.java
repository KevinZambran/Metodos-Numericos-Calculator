package Algoritmos;


import com.bestcode.mathparser.IMathParser;
import com.bestcode.mathparser.MathParserFactory;


public class Funcion {
    String funcion;
    IMathParser parser = MathParserFactory.create();
    public Funcion(String fun){
        funcion = fun;
        parser.setExpression(fun);
    }
    public double evaluacion (double x) throws Exception{
        double r = Double.NaN;
        parser.setX(x);
        r = parser.getValue();
        return r;
    }
    public double [] evaluacion(double[] x)throws Exception{
        int n = x.length;
        double[] r =new double[n];
        for(int i=0; i<n; i++){
            r[i]=evaluacion(x[i]);
        }
        return r;
    }
    public double[] rango(double x0, double xn, double d){
        int n =(int) (Math.abs(xn-x0)/d);
        double [] r= new double[n];
        for(int i=0; i<n; i++){
            r[i]=x0;
            x0+=d;
        }
        return r;
    }
}

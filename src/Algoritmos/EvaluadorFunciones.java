package Algoritmos;
import org.nfunk.jep.JEP;

/**
 * 
 * @author ZAMBRANO MACAS KEVIN STEVEN
 *
 */
public class EvaluadorFunciones {
    
   
    private String funcion = "";
    private double resultado = 0;
    private double x = 0;
    private String error = "";
    
    JEP jep;
    
    public EvaluadorFunciones(){}
    
    public void setFuncion(String funcion){
        this.funcion = funcion;
    }
    
    public void setX(double x){
        this.x = x;
    }
            
    public double getResultado(){
        return this.resultado;
    }
    
    public String getError()
    {
        return this.error;
    }
    
    public void Evaluar(){
        jep = new JEP();
        
        this.jep.addStandardFunctions();
        this.jep.addStandardConstants();
        this.jep.addVariable("x", this.x);
        this.jep.parseExpression(this.funcion);
        this.resultado = this.jep.getValue();
        this.error = (this.jep.hasError())? "Existe un error.":"No hay error";
    }
            

}

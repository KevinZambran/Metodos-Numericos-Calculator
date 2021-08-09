package Algoritmos;

import java.util.ArrayList;
import java.util.List;
import Entidades.RegresionLineal;
import javax.swing.table.DefaultTableModel;

public class RegresionL {
    public static List<RegresionLineal> orl = new ArrayList<RegresionLineal>();
	
	/**
	 * Metodo para calcular la sumatoria de X
	 * @param lista
	 * @return la suma de la columna de x
	 */
	public static double SumX(List<RegresionLineal> lista)
    {
        double suma = 0;
        for(int i = 0; i < lista.size(); i++)
            suma = suma + lista.get(i).getX();
        return suma;
    }
	
	/**
	 * Metodo para calcular la sumatoria de Y
	 * @param lista
	 * @return la suma de la columna de Y
	 */
    public static double SumY(List<RegresionLineal> lista)
    {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++)
            suma = suma + lista.get(i).getY();
        return suma;
    }
    
    /**
	 * Metodo para calcular la sumatoria de X^2
	 * @param lista
	 * @return Sumatoria x^2
	 */
    public static double SumX2(List<RegresionLineal> lista)
    {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++)
            suma = suma + lista.get(i).getX2();
        return suma;
    }
    
    /**
	 * Metodo para calcular la sumatoria de X*Y
	 * @param lista
	 * @return Sumatoria X*Y
	 */
    public static double SumXY(List<RegresionLineal> lista)
    {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++)
            suma = suma + lista.get(i).getXy();
        return suma;
    }
    
    /**
	 * Metodo para calcular la sumatoria de (Y*Y')^2
	 * @param lista
	 * @return Sumatoria (Y*Y')^2
	 */
    public static double SumyY2(List<RegresionLineal> lista)
    {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++)
            suma = suma + lista.get(i).getyY2();
        return suma;
    }
    
    /**
	 * Metodo para calcular la sumatoria de la ecuacion
	 * @param lista
	 * @return Sumatoria de ecuacion
	 */
    public static double SumEcuacion(List<RegresionLineal> lista)
    {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++)
            suma = suma + lista.get(i).getEcuacion();
        return suma;
    }
    
    /**
	 * Metodo para calcular la sumatoria de residuo
	 * @param lista
	 * @return Sumatoria residuo
	 */
    public static double SumReciduo(List<RegresionLineal> lista)
    {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++)
            suma = suma + lista.get(i).getResiduos();
        return suma;
    }
    
    /**
	 * Metodo para calcular la sumatoria de pronostico
	 * @param lista
	 * @return Sumatoria pronostico
	 */
    public static double SumPronostico(List<RegresionLineal> lista)
    {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++)
            suma = suma + lista.get(i).getPronosticoY();
        return suma;
    }
    
    /**
	 * Metodo para calcular la media de x
	 * @param lista
	 * @return Media de x
	 */
    public static double calcularMediaX(List<RegresionLineal> lista)
    {
        double n = lista.size();
        double sumaX = SumX(lista);
        return sumaX / n;
    }
    
    /**
	 * Metodo para calcular la media de y
	 * @param lista
	 * @return Media de y
	 */
    public static double calcularMediaY(List<RegresionLineal> lista)
    {
        double n = lista.size();
        double sumaY = SumY(lista);
        return sumaY / n;
    }
    
    /**
	 * Metodo para calcular a0
	 * @param lista
	 * @return Media de a0
	 */
    public static double calcular_a0(List<RegresionLineal> lista)
    {
        double mediaY = calcularMediaY(lista);
        double mediaX = calcularMediaX(lista);
        double a1 = calcular_a1(lista);
        return mediaY - mediaX * a1;
    }
    
    /**
	 * Metodo para calcular la a1
	 * @param lista
	 * @return Media de a1
	 */
    public static double calcular_a1(List<RegresionLineal> lista)
    {
        double n = lista.size();
        double sumaXY = SumXY(lista);
        double sumaX = SumX(lista);
        double sumaY = SumY(lista);
        double sumaXal2 = SumX2(lista);
        return (n * sumaXY - sumaX * sumaY) / (n * sumaXal2 - Math.pow(sumaX, 2));
    }
    
    /**
        * Metodo para obtener los calculos especificos para cada elemento de la lista
        * @param listaRegresionLineal
    */
    public static void aplicarRegresion(List<RegresionLineal> listaRegresionLineal)
    {
        double a0;
        double a1;

        RegresionLineal regresionLineal;
        double x ;
        double y ;
        double x2;
        double xy;
        double yY2;
        double ecuacion;
        double pronosticoY;
        double residuo;

        double mediaY = calcularMediaY(listaRegresionLineal);

        a0 = calcular_a0(listaRegresionLineal);
        a1 = calcular_a1(listaRegresionLineal);

        for (int i = 0; i < listaRegresionLineal.size(); i++)
        {
            x = listaRegresionLineal.get(i).getX();
            y = listaRegresionLineal.get(i).getY();
            x2 = listaRegresionLineal.get(i).getX2();
            xy = listaRegresionLineal.get(i).getXy();

            yY2 = Math.pow((y - mediaY), 2);
            ecuacion = Math.pow((y - a0 - a1 * x), 2);
            pronosticoY = a0 + a1 * x;
            residuo = y - pronosticoY;

            regresionLineal = new RegresionLineal(x, y, x2, xy, yY2, ecuacion, pronosticoY, residuo);
            listaRegresionLineal.set(i,regresionLineal);
        }
    }
    public static DefaultTableModel MostrarRegresion (List<RegresionLineal> lista){        
        DefaultTableModel dtm;
        String titulos [] = {"xi", "yi", "xi^2", "xi yi", "(yi - y')^2", "(yi - a0 - a1xi)^2", "Pronostico Y", "Residuos"};
        dtm = new DefaultTableModel(null,titulos);
        
        for (int i=0; i<RegresionL.orl.size(); i++)
        {
            dtm.addRow(getRegresion(i).VisualizarRegresion());
        }
        return dtm;
    }
    
    public static RegresionLineal getRegresion(int pos){
        return RegresionL.orl.get(pos);
    }
    
    public static String []  Sumatoria(){
        String [] fila = new String[8];
        
         fila[0] =String.valueOf(RegresionL.SumX(RegresionL.orl));
         fila[1] =String.valueOf(RegresionL.SumY(RegresionL.orl));
         fila[2] =String.valueOf(RegresionL.SumX2(RegresionL.orl));
         fila[3] =String.valueOf(RegresionL.SumXY(RegresionL.orl));
         fila[4] =String.valueOf(RegresionL.SumyY2(RegresionL.orl));
         fila[5] =String.valueOf(RegresionL.SumEcuacion(RegresionL.orl));
         fila[6] =String.valueOf(RegresionL.SumPronostico(RegresionL.orl));
         fila[7] =String.valueOf(RegresionL.SumReciduo(RegresionL.orl));         
        return fila;
    }
}


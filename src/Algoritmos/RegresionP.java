package Algoritmos;

import Entidades.RegresionLineal;
import Entidades.RegresionPolinomial;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegresionP {
    
    public static List<RegresionPolinomial> orp = new ArrayList<RegresionPolinomial>();
    public static double [][] matrix = new double [4][4];
    /**
	 * Metodo para calcular la sumatoria de X
	 * @param lista
	 * @return la suma de la columna de x
	 */
	public static double SumX(List<RegresionPolinomial> lista)
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
    public static double SumY(List<RegresionPolinomial> lista)
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
    public static double SumX2(List<RegresionPolinomial> lista)
    {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++)
            suma = suma + lista.get(i).getX2();
        return suma;
    }
    /**
	 * Metodo para calcular la sumatoria de X^2
	 * @param lista
	 * @return Sumatoria x^2
	 */
    public static double SumX3(List<RegresionPolinomial> lista)
    {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++)
            suma = suma + lista.get(i).getX3();
        return suma;
    }
    /**
	 * Metodo para calcular la sumatoria de X^2
	 * @param lista
	 * @return Sumatoria x^2
	 */
    public static double SumX4(List<RegresionPolinomial> lista)
    {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++)
            suma = suma + lista.get(i).getX4();
        return suma;
    }
    
    /**
	 * Metodo para calcular la sumatoria de X*Y
	 * @param lista
	 * @return Sumatoria X*Y
	 */
    public static double SumXY(List<RegresionPolinomial> lista)
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
    public static double SumyY2(List<RegresionPolinomial> lista)
    {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++)
            suma = suma + lista.get(i).getyY2();
        return suma;
    }
    /**
	 * Metodo para calcular la sumatoria de (Y*Y')^2
	 * @param lista
	 * @return Sumatoria (Y*Y')^2
	 */
    public static double SumX2Y(List<RegresionPolinomial> lista)
    {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++)
            suma = suma + lista.get(i).getX2y();
        return suma;
    }
    
    /**
	 * Metodo para calcular la sumatoria de la ecuacion
	 * @param lista
	 * @return Sumatoria de ecuacion
	 */
    public static double SumEcuacion(List<RegresionPolinomial> lista)
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
    public static double SumReciduo(List<RegresionPolinomial> lista)
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
    public static double SumPronostico(List<RegresionPolinomial> lista)
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
    public static double calcularMediaX(List<RegresionPolinomial> lista)
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
    public static double calcularMediaY(List<RegresionPolinomial> lista)
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
    public static void calcularCoeficientes(List<RegresionPolinomial> lista)
    {        
        matrix[0][0] = lista.size();
        matrix[0][1] = SumX(lista);
        matrix[0][2] = SumX2(lista);
        matrix[0][3] = SumY(lista);
        matrix[1][0] = SumX(lista);
        matrix[1][1] = SumX2(lista);
        matrix[1][2] = SumX3(lista);
        matrix[1][3] = SumXY(lista);
        matrix[2][0] = SumX2(lista);
        matrix[2][1] = SumX3(lista);
        matrix[2][2] = SumX4(lista);
        matrix[2][3] = SumX2Y(lista);
        jordan();
    }
    
    /**
	 * Metodo para calcular la a1
	 * @param lista
	 * @return Media de a1
	 */
    public static double calcular_a1(List<RegresionPolinomial> lista)
    {
        double n = lista.size();
        double sumaXY = SumXY(lista);
        double sumaX = SumX(lista);
        double sumaY = SumY(lista);
        double sumaXal2 = SumX2(lista);
        return (n * sumaXY - sumaX * sumaY) / (n * sumaXal2 - Math.pow(sumaX, 2));
    }
    /**
	 * Metodo para calcular la a1
	 * @param lista
	 * @return Media de a1
	 */
    public static double calcular_a2(List<RegresionPolinomial> lista)
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
        * @param listPolinomial
    */
    public static void aplicarRegresion(List<RegresionPolinomial> listPolinomial)
    {
        double a0;
        double a1;
        double a2;

        RegresionPolinomial regresionPoli;
        double x ;
        double y ;
        double x2,x3,x4;
        double xy;
        double x2y;
        double yY2;
        double ecuacion;
        double pronosticoY;
        double residuo;

        double mediaY = calcularMediaY(listPolinomial);
        calcularCoeficientes(orp);
        a0 = matrix[0][3];
        a1 = matrix[1][3];
        a2 = matrix[2][3];

        for (int i = 0; i < listPolinomial.size(); i++)
        {
            x = listPolinomial.get(i).getX();
            y = listPolinomial.get(i).getY();
            x2 = listPolinomial.get(i).getX2();
            x3 = listPolinomial.get(i).getX3();
            x4 = listPolinomial.get(i).getX4();
            xy = listPolinomial.get(i).getXy();
            x2y = x2 * y;
            yY2 = Math.pow((y - mediaY), 2);
            //ecuacion = Math.pow((y - a0 - a1 * x), 2);
            pronosticoY = a0 + a1 * x + a2 + x2;
            residuo = y - pronosticoY;
            ecuacion = Math.pow(residuo,2);

            regresionPoli = new RegresionPolinomial(x, y,x2,x3,x4, xy,x2y, yY2, ecuacion, pronosticoY, residuo);
            listPolinomial.set(i,regresionPoli);
        }
    }
    public static DefaultTableModel MostrarRegresion (List<RegresionPolinomial> lista){        
        DefaultTableModel dtm;
        String titulos [] = {"xi", "yi", "xi^2", "xi^3", "xi^4", "xi yi", "xi^2 yi", "(yi - y')^2", "(yi-a0-a1xi-a2xi^2)^2", "Pronostico Y", "Residuos"};
        dtm = new DefaultTableModel(null,titulos);
        
        for (int i=0; i<RegresionP.orp.size(); i++)
        {
            dtm.addRow(getRegresionP(i).VisualizarRegresionP());
        }
        return dtm;
    }
    
    public static RegresionPolinomial getRegresionP(int pos){
        return RegresionP.orp.get(pos);
    }
    
    public static String []  Sumatoria(){
        String [] fila = new String[11];
        
         fila[0] =String.valueOf(RegresionP.SumX(RegresionP.orp));
         fila[1] =String.valueOf(RegresionP.SumY(RegresionP.orp));
         fila[2] =String.valueOf(RegresionP.SumX2(RegresionP.orp));
         fila[3] =String.valueOf(RegresionP.SumX3(RegresionP.orp));
         fila[4] =String.valueOf(RegresionP.SumX4(RegresionP.orp));
         fila[5] =String.valueOf(RegresionP.SumXY(RegresionP.orp));
         fila[6] =String.valueOf(RegresionP.SumX2Y(RegresionP.orp));
         fila[7] =String.valueOf(RegresionP.SumyY2(RegresionP.orp));
         fila[8] =String.valueOf(RegresionP.SumEcuacion(RegresionP.orp));
         fila[9] =String.valueOf(RegresionP.SumPronostico(RegresionP.orp));
         fila[10] =String.valueOf(RegresionP.SumReciduo(RegresionP.orp));         
        return fila;
    }
    
    static void pivote(double matriz[][], int piv, int var) {
        double temp = 0;
        temp = matriz[piv][piv];
        for (int y = 0; y < (var + 1); y++) {

            matriz[piv][y] = matriz[piv][y] / temp;
        }
    }
    
    public static void hacerceros(double matriz[][], int piv, int var) {
        for (int x = 0; x < var; x++) {
            if (x != piv) {
                double c = matriz[x][piv];
                for (int z = 0; z < (var + 1); z++) {
                    matriz[x][z] = ((-1 * c) * matriz[piv][z]) + matriz[x][z];
                }
            }
        }
    }
       
    static void muestramatriz(double matriz[][], int var) {
        for (int x = 0; x < var; x++) {
            for (int y = 0; y < (var + 1); y++) {
                System.out.print(" " + matriz[x][y] + " |");
            }           
            System.out.println("");
        }

    }
    
    public static void jordan(){
    int piv=0;
    int var =3;
    muestramatriz(matrix, var);
    for (int a = 0; a < var; a++) {
        pivote(matrix, piv, var);
        hacerceros(matrix, piv, var);
        piv++;
    }
//    }
//    for (int x = 0; x < var; x++) {
//       // System.out.println("La variable X" + (x + 1) + " es: " + matrix[x][var]);
//        sal+= "La variable X" + (x + 1) + " es: " + matrix[x][var]+"\n";	
//    }
    }
}



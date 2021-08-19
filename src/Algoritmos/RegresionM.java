package Algoritmos;

import Entidades.RegresionMultiple;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class RegresionM {
    
    public static List<RegresionMultiple> orm = new ArrayList<RegresionMultiple>();
    public static double [][] matrix = new double [4][4];
    
    /**
     * Metodo para calcular la sumatoria de X1
     * @param lista
     * @return la suma de la columna de x1
     */
    public static double SumX1(List<RegresionMultiple> lista) {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getX1();
        }
        return suma;
    }
    
    /**
     * Metodo para calcular la sumatoria de X2
     * @param lista
     * @return la suma de la columna de x2
     */
    public static double SumX2(List<RegresionMultiple> lista) {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getX2();
        }
        return suma;
    }
	
    /**
     * Metodo para calcular la sumatoria de Y
     * @param lista
     * @return la suma de la columna de Y
     */
    public static double SumY(List<RegresionMultiple> lista) {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getY();
        }
        return suma;
    }
    
    /**
     * Metodo para calcular la sumatoria de X1^2
     * @param lista
     * @return Sumatoria x1^2
     */
    public static double SumexpX1(List<RegresionMultiple> lista) {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getExpx1();
        }
        return suma;
    }
    /**
     * Metodo para calcular la sumatoria de X2^2
     * @param lista
     * @return Sumatoria x2^2
     */
    public static double SumexpX2(List<RegresionMultiple> lista) {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getExpx2();
        }
        return suma;
    }
    
    /**
     * Metodo para calcular la sumatoria de X1*X2
     * @param lista
     * @return Sumatoria x1*x2
     */
    public static double SumX1x2(List<RegresionMultiple> lista) {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getX1x2();
        }
        return suma;
    }

    /**
     * Metodo para calcular la sumatoria de X1y
     * @param lista
     * @return Sumatoria x1y
     */
    public static double SumX1y(List<RegresionMultiple> lista) {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getX1y();
        }
        return suma;
    }
    /**
     * Metodo para calcular la sumatoria de X2y
     * @param lista
     * @return Sumatoria x2y
     */
    public static double SumX2y(List<RegresionMultiple> lista) {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getX2y();
        }
        return suma;
    }
    
    /**
     * Metodo para calcular la sumatoria de (Y*Y')^2
     * @param lista
     * @return Sumatoria (Y*Y')^2
     */
    public static double SumyY2(List<RegresionMultiple> lista) {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getyY2();
        }
        return suma;
    }
    
    /**
     * Metodo para calcular la sumatoria de la ecuacion
     * @param lista
     * @return Sumatoria de ecuacion
     */
    public static double SumEcuacion(List<RegresionMultiple> lista) {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getEcuacion();
        }
        return suma;
    }

    /**
     * Metodo para calcular la sumatoria de residuo
     * @param lista
     * @return Sumatoria residuo
     */
    public static double SumReciduo(List<RegresionMultiple> lista) {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getResiduos();
        }
        return suma;
    }

    /**
     * Metodo para calcular la sumatoria de pronostico
     * @param lista
     * @return Sumatoria pronostico
     */
    public static double SumPronostico(List<RegresionMultiple> lista) {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getPronosticoY();
        }
        return suma;
    }

    /**
     * Metodo para calcular la media de y
     * @param lista
     * @return Media de y
     */
    public static double calcularMediaY(List<RegresionMultiple> lista) {
        double n = lista.size();
        double sumaY = SumY(lista);
        return sumaY / n;
    }

    /**
     * Metodo para calcular a0
     * @param lista
     * @return Media de a0
     */
    public static void calcularCoeficientes(List<RegresionMultiple> lista)
    {        
        matrix[0][0] = lista.size();
        matrix[0][1] = SumX1(lista);
        matrix[0][2] = SumX2(lista);
        matrix[0][3] = SumY(lista);
        matrix[1][0] = SumX1(lista);
        matrix[1][1] = SumexpX1(lista);
        matrix[1][2] = SumX1x2(lista);
        matrix[1][3] = SumX1y(lista);
        matrix[2][0] = SumX2(lista);
        matrix[2][1] = SumX1x2(lista);
        matrix[2][2] = SumexpX2(lista);
        matrix[2][3] = SumX2y(lista);
        jordan();
    }
    
    /**
        * Metodo para obtener los calculos especificos para cada elemento de la lista
        * @param listMultiple
    */
    public static void aplicarRegresion(List<RegresionMultiple> listMultiple)
    {
        double a0;
        double a1;
        double a2;

        RegresionMultiple regresionMulti;
        double x1, x2 ;
        double y ;
        double expx1,expx2;
        double x1x2;
        double x1y;
        double x2y;
        double yY2;
        double ecuacion;
        double pronosticoY;
        double residuo;

        double mediaY = calcularMediaY(listMultiple);
        calcularCoeficientes(orm);
        a0 = matrix[0][3];
        a1 = matrix[1][3];
        a2 = matrix[2][3];

        for (int i = 0; i < listMultiple.size(); i++)
        {
            x1 = listMultiple.get(i).getX1();
            x2 = listMultiple.get(i).getX2();
            y = listMultiple.get(i).getY();            
            expx1 = listMultiple.get(i).getExpx1();
            expx2 = listMultiple.get(i).getExpx2();
            x1x2 = listMultiple.get(i).getX1x2();
            x1y = listMultiple.get(i).getX1y();
            x2y = listMultiple.get(i).getX2y();
            yY2 = Math.pow((y - mediaY), 2);
            //ecuacion = Math.pow((y - a0 - a1 * x), 2);
            pronosticoY = a0 + a1 * x1 + a2 + x2;
            residuo = y - pronosticoY;
            ecuacion = Math.pow(residuo,2);

            regresionMulti = new RegresionMultiple(x1, x2, y, expx1, expx2 ,x1x2, x1y, x2y, yY2, ecuacion, pronosticoY, residuo);
            listMultiple.set(i,regresionMulti);
        }
    }
    public static DefaultTableModel MostrarRegresion (List<RegresionMultiple> lista){        
        DefaultTableModel dtm;
        String titulos [] = {"x1", "x2", "y", "x1^2", "x2^2", "x1 x2", "x1 y", "x2 y", "(yi - y')^2", "(y-a0-a1x1-a2x2)^2", "Pronostico Y", "Residuos"};
        dtm = new DefaultTableModel(null,titulos);
        
        for (int i=0; i<RegresionM.orm.size(); i++)
        {
            dtm.addRow(getRegresionP(i).VisualizarRegresionM());
        }
        return dtm;
    }
    
    public static RegresionMultiple getRegresionP(int pos){
        return RegresionM.orm.get(pos);
    }
    
    public static String []  Sumatoria(){
        String [] fila = new String[12];
        
         fila[0] =String.valueOf(RegresionM.SumX1(RegresionM.orm));
         fila[1] =String.valueOf(RegresionM.SumX2(RegresionM.orm));
         fila[2] =String.valueOf(RegresionM.SumY(RegresionM.orm));
         fila[3] =String.valueOf(RegresionM.SumexpX1(RegresionM.orm));
         fila[4] =String.valueOf(RegresionM.SumexpX2(RegresionM.orm));
         fila[5] =String.valueOf(RegresionM.SumX1x2(RegresionM.orm));
         fila[6] =String.valueOf(RegresionM.SumX1y(RegresionM.orm));
         fila[7] =String.valueOf(RegresionM.SumX2y(RegresionM.orm));
         fila[8] =String.valueOf(RegresionM.SumyY2(RegresionM.orm));
         fila[9] =String.valueOf(RegresionM.SumEcuacion(RegresionM.orm));
         fila[10] =String.valueOf(RegresionM.SumPronostico(RegresionM.orm));
         fila[11] =String.valueOf(RegresionM.SumReciduo(RegresionM.orm));         
        return fila;
    }
    
    static void pivote(double matriz[][], int piv, int var) {
        double temp;
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




package Algoritmos;

import Controlador.TLista;

/**
 *
 * @author PERSONAL
 */

public class Bairstown {   
    
    private int iteracion;
    private double a0;
    private double a1;
    private double a2;
    private double a3;
    private double a4;
    private double a5;
    private double a6;
    private double b0;
    private double b1;
    private double b2;
    private double b3;
    private double b4;
    private double b5;
    private double b6;
    private double r;
    private double s;
    private double Ear;
    private double Eas;
    private double disc;
    private String Raiz;
    private double x1;
    private double x2;

    public int getIteracion() {
        return iteracion;
    }

    public double getA0() {
        return a0;
    }

    public double getA1() {
        return a1;
    }

    public double getA2() {
        return a2;
    }

    public double getA3() {
        return a3;
    }

    public double getA4() {
        return a4;
    }

    public double getA5() {
        return a5;
    }

    public double getA6() {
        return a6;
    }

    public double getB0() {
        return b0;
    }

    public double getB1() {
        return b1;
    }

    public double getB2() {
        return b2;
    }

    public double getB3() {
        return b3;
    }

    public double getB4() {
        return b4;
    }

    public double getB5() {
        return b5;
    }

    public double getB6() {
        return b6;
    }

    public double getR() {
        return r;
    }

    public double getS() {
        return s;
    }

    public double getEar() {
        return Ear;
    }

    public double getEas() {
        return Eas;
    }

    public double getDisc() {
        return disc;
    }

    public String getRaiz() {
        return Raiz;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public Bairstown(int iteracion, double a0, double a1, double a2, double a3, double a4, double a5, double a6, double b0, double b1, double b2, double b3, double b4, double b5, double b6, double r, double s, double Ear, double Eas, double disc, String Raiz, double x1, double x2) {
        this.iteracion = iteracion;
        this.a0 = a0;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
        this.b0 = b0;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
        this.b5 = b5;
        this.b6 = b6;
        this.r = r;
        this.s = s;
        this.Ear = Ear;
        this.Eas = Eas;
        this.disc = disc;
        this.Raiz = Raiz;
        this.x1 = x1;
        this.x2 = x2;
    }
    
    public Bairstown(){}
    
    public String []  Bairstow(int i, int n, double Es,double a0, double a1, double a2, double a3, double a4,
			double a5, double a6, double r, double s ){
		
        double b0,  b1,  b2=0,  b3=0,  b4=0, b5=0, b6 = 0,
        c1,  c2,  c3,  c4, c5, c6, dr=0,  ds=0,  Ear,  Eas, DIS, x1, x2 = 0, xi, x2i;
        do {
            if(i == 0) {
                ++i;
                Ear = 2;
                Eas = 2;

            }else {
                if(n==6){
                    b6= a6;
                    b5 = a5 + r * b6;
                    b4 = a4 + r * b5 + s * b6;
                    b3 = a3 + r * b4 + s * b5; 
                    b2 = a2 + r * b3 + s * b4;
                    b1 = a1 + r * b2 + s * b3;
                    b0 = a0 + r * b1 + s * b2;

                    c6 = b6;
                    c5 = b5 + r * c6;
                    c4 = b4 + r * c5 + s * c6;
                    c3 = b3 + r * c4 + s * c5;
                    c2 = b2 + r * c3 + s * c4;
                    c1 = b1 + r * c2 + s * c3;   
                    
                    //Deltas
                    dr = Determinante("R", c1, c2, c3, b0, b1);
                    ds = Determinante("S", c1, c2, c3, b0, b1);
                }
                if(n==5){
                    
                    b5 = a5;
                    b4 = a4 + r * b5;
                    b3 = a3 + r * b4 + s * b5; 
                    b2 = a2 + r * b3 + s * b4;
                    b1 = a1 + r * b2 + s * b3;
                    b0 = a0 + r * b1 + s * b2;

                    c5 = b5;
                    c4 = b4 + r * c5;
                    c3 = b3 + r * c4 + s * c5;
                    c2 = b2 + r * c3 + s * c4;
                    c1 = b1 + r * c2 + s * c3;   
                    
                    //Deltas
                    dr = Determinante("R", c1, c2, c3, b0, b1);
                    ds = Determinante("S", c1, c2, c3, b0, b1);
                }
                if(n==4){
                    
                    b4 = a4;
                    b3 = a3 + r * b4; 
                    b2 = a2 + r * b3 + s * b4;
                    b1 = a1 + r * b2 + s * b3;
                    b0 = a0 + r * b1 + s * b2;
                    
                    c4 = b4;
                    c3 = b3 + r * c4;
                    c2 = b2 + r * c3 + s * c4;
                    c1 = b1 + r * c2 + s * c3;    
                    
                    //Deltas
                    dr = Determinante("R", c1, c2, c3, b0, b1);
                    ds = Determinante("S", c1, c2, c3, b0, b1);
                }
                if(n==3){
                    
                    b3 = a3; 
                    b2 = a2 + r * b3;
                    b1 = a1 + r * b2 + s * b3;
                    b0 = a0 + r * b1 + s * b2;
                    
                    c3 = b3;
                    c2 = b2 + r * c3;
                    c1 = b1 + r * c2 + s * c3;    
                    
                    //Deltas
                    dr = Determinante("R", c1, c2, c3, b0, b1);
                    ds = Determinante("S", c1, c2, c3, b0, b1);
                }
                r = r + dr;
                s = s + ds;

                Ear = Math.abs(dr/r) * 100;
                Eas = Math.abs(ds/s) * 100;
                ++i;
            }
        }while(Ear > Es || Eas > Es);
        
        DIS= Math.pow(r, 2)+ 4*s;

        if(DIS >= 0) {
            this.Raiz= "Raices Realez";
        }else {
            this.Raiz="Raices Complejas";
        }

        if(DIS > 0 ) {
                x1 = (r + Math.sqrt(DIS))/2;
                x2 = (r - Math.sqrt(DIS))/2;
        }else {
                x1 = r/2;
                xi = Math.sqrt(Math.abs(DIS))/2;
                x2 = r / 2;
                x2i = - Math.sqrt(Math.abs(DIS))/2;
        }
        
        this.iteracion = i -1;
        this.r = r;
        this.s = s;
        this.Ear = Ear;
        this.Eas = Eas;
        this.disc = DIS;
        this.x1 = x1;
        this.x2 = x2;

        
        if(n==6){
            this.a0 = b2;
            this.a1 = b3;
            this.a2 = b4;
            this.a3 = b5;
            this.a4 = b6;
        } 
        
        if(n==5){
            this.a0 = b2;
            this.a1 = b3;
            this.a2 = b4;
            this.a3 = b5;
        } 
        if(n==4){
            this.a0 = b2;
            this.a1 = b3;
            this.a2 = b4;
        }
        if(n==3){
            this.a0 = b2;
            this.a1 = b3;
        }
        
        if(n==1){
            this.disc = 0;
            this.x1= -this.s/this.r;
            this.x2=0;
        }
        return TLista.MostrarBairstown(this.iteracion, this.r, this.s, this.Ear, this.Eas, this.disc, this.Raiz, this.x1, this.x2);
    }
    public static double Determinante(String delta,double c1, double c2, double c3, double b0, double b1) {
        double det;
        double det1;
        b0 = -b0;
        b1 = -b1;
        //c2*Dr y c3*Ds = -b1 
        //c1*Dr y c2*Ds = -b0
        double [][] fija = {{c2,c3},{c1,c2}};
        det = (fija[0][0] * fija[1][1]) - (fija[0][1] * fija[1][0]); 
        if(delta.equals("R")) {
                //Delta r
                //b1 y c3*Ds
                //b0 y c2*Ds
            double [][] Dr = {{b1,c3},{b0,c2}};
            det1 = (Dr[0][0] * Dr[1][1]) - (Dr[1][0] * Dr[0][1]);
        }else {
                //Delta s
                //c2*Dr y b1
                //c1*Dr y b0
            double [][] Ds = {{c2,b1},{c1,b0}};
            det1 = (Ds[0][0] * Ds[1][1]) - (Ds[1][0] * Ds[0][1]);
        }
        return det1/det;
    }   
}

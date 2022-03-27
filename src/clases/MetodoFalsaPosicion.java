/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PABLO
 */
public class MetodoFalsaPosicion extends Funcion {

    private String funcion;             // valor de funcion.  
    private double a;                   // valor del punto de inicio del intervalo.
    private double b;                   // valor del punto final del intervalo.
    private double error;               // margen de error.
    private int iteraciones = 30;       // numero de iteraciones del metodo. Por defecto 30.
    private double raiz;                // raiz exacta 

    //Metodo para ingresar la funcion.
    public void setFuncion(String f) {
        funcion = f;
    }

    //Metodo para ingresar el intervalo.
    public void setIntervalo(double intA, double intB) {
        a = intA;
        b = intB;
    }

    //Metodo para ingresar el error.
    public void setError(double err) {
        error = err;
    }

    //Metodo para ingresar las iteraciones
    public void setIteraciones(int i) {
        iteraciones = i;
    }

    //Metodo para ingresar la raiz exacta
    public void setRaiz(double raiz) {
        this.raiz = raiz;
    }

    //Metodo para encontrar la raiz
    public void calcular(DefaultTableModel model) {

        String fila[] = new String[9];          // variable para almacenar los datos de las iteraciones
        double xi = 0;                          // valor del punto medio
        double fa;                              // valor de la funcion evaluada en a
        double fb;                              // valor de la funcion evaluada en b
        double fxi;                             // valor de la funcion evaluada en el punto medio
        double err;                             // margen de error de la iteracion
        double err2;                            // margen de error con raiz exacta
        int i = 1;                              // contador de de iteraciones
        double aux;                             // variable para almacenar temporalmente el valor del punto medio

        do {
            fa = evaluar(funcion, a);                           // calculamos el valor de la funcion en el punto a
            fb = evaluar(funcion, b);                           // calculamos el valor de la funcion en el punto b
            aux = xi;                                           // asignamos el valor del punto medio en varible auxiliar
            xi = ((a * fb) - (b * fa)) / (fb - fa);             // calculamos el punto medio
            fxi = evaluar(funcion, xi);                         // calculamos el valor de la funcion en el punto medio
            err = Math.abs(aux - xi);                           // calculamos el error
            err2 = Math.abs(xi - raiz);                         // calculamos el error con la raiz exacta

            //Almacenando los datos de la iteracion en un array
            fila[0] = String.valueOf(i);
            fila[1] = String.valueOf(a);
            fila[2] = String.valueOf(b);
            fila[3] = String.format("%.10f", xi);
            fila[4] = String.format("%.10f", fa);
            fila[5] = String.format("%.10f", fxi);
            fila[6] = String.format("%.10f", fb);
            fila[7] = i != 1 ? String.format("%.20f", err) : "No hay error";
            fila[8] = raiz == 0 ? "" : String.format("%.20f", err2);
            
            //agregando los datos al modelo de la tabla
            model.addRow(fila);

            // Escogiendo el nuevo intervalo
            if (fxi * fa < 0) {
                b = xi;
            } else {
                a = xi;
            }

            //aumento de las iteraciones
            i++;

        } while (err >= error && i <= iteraciones && err2>=error);

    }

    //Metodo para evaluar si hay raiz en el intervalo
    public boolean evaluarIntervalo() {
        double a1 = this.evaluar(funcion, this.a);
        double b1 = this.evaluar(funcion, this.b);

        return a1 * b1 <= 0;
    }
}

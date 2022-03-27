package clases;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PABLO
 */
public class MetodoSecante extends Funcion {

    private String funcion;             // valor de funcion.  
    private double xo;                  // primera aproximacion 
    private double xi;                  // segunda aproximacion 
    private double error;               // margen de error
    private double iteraciones = 30;    // numero de iteraciones 30 por defecto
    private double raiz;                // raiz exacta 

    //metodo para insertar la funcion
    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    //metodo para insertar las aproximaciones
    public void setAproximaciones(double xo, double xi) {
        this.xo = xo;
        this.xi = xi;
    }

    //metodo para insertar los errores
    public void setError(double error) {
        this.error = error;
    }

    //metodo para insertar las iteraciones
    public void setIteraciones(double iteraciones) {
        this.iteraciones = iteraciones;
    }

    //Metodo para ingresar la raiz exacta
    public void setRaiz(double raiz) {
        this.raiz = raiz;
    }

    //metodo para encontrar la raiz
    public void calcular(DefaultTableModel model) {
        String fila[] = new String[5];          // variable para almacenar los datos de las iteraciones
        double fxo;                             // valor de la funcion evaluada en xo
        double fxi;                             // valor de la funcion evaluada en xi
        double err;                             // margen de error de la iteracion
        double err2;                            // margen de error con raiz exacta
        int i = 0;                              // contador de de iteraciones
        double aux;                             // variable auxiliar

        do {
            fxo = evaluar(funcion, xo);         // calculamos el valor de la funcion en el punto xo
            err = Math.abs(xo - xi);            // calculamos el error
            err2 = Math.abs(xi - raiz);         // calculamos el error con la raiz exacta

            //Almacenando los datos de la iteracion en un array
            fila[0] = String.valueOf(i);
            fila[1] = String.valueOf(xo);
            fila[2] = String.format("%.10f", fxo);
            fila[3] = String.format("%.20f", err);
            fila[4] = raiz == 0 ? "" : String.format("%.20f", err2);
            model.addRow(fila);

            // calculamos la nueva aproximacion
            fxi = evaluar(funcion, xi);
            aux = xi;
            xi = xi - (((xi - xo) / (fxi - fxo)) * fxi);
            xo = aux;
            i++;

        } while (err >= error && i <= iteraciones && err2 >= error);

    }

    public boolean evaluarIntervalo() {
        double a1 = this.evaluar(funcion, this.xo);
        double b1 = this.evaluar(funcion, this.xi);
        return a1 * b1 < 0;
    }
}

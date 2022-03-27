package clases;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PABLO
 */
public class metodoNewton extends Funcion {

    private String funcion;             // valor de funcion.  
    private double xi;                  // aproximacion inicial
    private double error;               // margen de error.
    private int iteraciones = 30;       // numero de iteraciones del metodo. Por defecto 30.
    private double raiz;                // raiz exacta 

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public void setAproximacion(double xi) {
        this.xi = xi;
    }

    public void setError(double error) {
        this.error = error;
    }

    public void setIteraciones(int iteraciones) {
        this.iteraciones = iteraciones;
    }

    //Metodo para ingresar la raiz exacta
    public void setRaiz(double raiz) {
        this.raiz = raiz;
    }

    public void calcular(DefaultTableModel model) {

        String fila[] = new String[6];          // variable para almacenar los datos de las iteraciones
        double fxi;                             // valor de funcion evaluada en la aproximacion
        double dxi;                             // valor de la derivada evaluada en la aproximacion
        double err;                             // valor del error
        double err2;                            // margen de error con raiz exacta
        double aux = 0;                         // variable para almacenar temporalmente el valor de la aproximacion
        int i = 0;                              // contador de las iteraciones

        do {

            fxi = evaluar(funcion, xi);
            dxi = evaluar(derivar(funcion), xi);
            err = Math.abs(xi - aux);
            err2 = Math.abs(xi - raiz);         // calculamos el error con la raiz exacta

            //Almacenando los datos de la iteracion en un array
            fila[0] = String.valueOf(i);
            fila[1] = String.valueOf(xi);
            fila[2] = String.format("%.10f", fxi);
            fila[3] = String.format("%.10f", dxi);
            fila[4] = i != 0 ? String.format("%.15f", err) : "No hay error";
            fila[5] = raiz == 0 ? "" : String.format("%.15f", err2);
            model.addRow(fila);

            //Calculando nueva aproximacion xi
            aux = xi;
            xi = xi - (fxi / dxi);
            i++;

        } while (err >= error && i <= iteraciones && err2 >= error);
    }

    public boolean evaluarAprox() {
        double x = evaluar(derivar(funcion), xi);
        return x != 0;
    }
}

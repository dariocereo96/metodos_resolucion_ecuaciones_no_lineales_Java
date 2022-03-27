package clases;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;
import org.nfunk.jep.TokenMgrError;

public class Funcion {

    public double evaluar(String f, double x) {
        double res;

        JEP funcion = new JEP();
        funcion.addStandardConstants();
        funcion.addStandardFunctions();
        funcion.setImplicitMul(true);
        funcion.addVariable("x", x);
        funcion.parseExpression(f);

        res = funcion.getValue();

        if (funcion.hasError()) {
            System.out.println("Error en la funcion: " + funcion.getErrorInfo());
        }
        return res;
    }

    public String derivar(String f) {
        String derivada = "";
        DJep derivacion = new DJep();

        derivacion.addStandardFunctions();
        derivacion.addStandardConstants();
        derivacion.addComplex();
        derivacion.setAllowUndeclared(true);
        derivacion.setAllowAssignment(true);
        derivacion.setImplicitMul(true);
        derivacion.addStandardDiffRules();

        try {
            Node node = derivacion.parse(f);
            Node diff = derivacion.differentiate(node, "x");
            Node simp = derivacion.simplify(diff);
            derivada = derivacion.toString(simp);

        } catch (ParseException | TokenMgrError ex) {
            System.out.println("Error en la derivacion: " + derivada);
        }

        return derivada;
    }

    public static void main(String[] args) {
        

    }
}
